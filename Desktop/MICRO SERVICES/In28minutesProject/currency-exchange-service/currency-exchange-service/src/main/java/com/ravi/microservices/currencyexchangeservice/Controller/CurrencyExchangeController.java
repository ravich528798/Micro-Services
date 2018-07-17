package com.ravi.microservices.currencyexchangeservice.Controller;


import com.ravi.microservices.currencyexchangeservice.Services.ExchangeValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
public class CurrencyExchangeController {


    @Autowired
    Environment environment;



    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue exchangeValue = new ExchangeValue(1000L,from,to,65.00);
        exchangeValue.setPort(Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"))));
        return exchangeValue;
    }
}
