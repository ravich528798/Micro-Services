package com.ravi.microservices.currencyconversionservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  CurrencyConversionController {


    @Autowired
    CurrencyExchangeServiceProxy proxy;

    @RequestMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public ConversionValue getValue(@PathVariable String from,@PathVariable String to,@PathVariable double quantity){
    ConversionValue response = proxy.retrieveExchangeValue(from,to);
    return new ConversionValue(response.getId(),response.getFrom(),response.getTo(),response.getConversionRate(),quantity,quantity*response.getConversionRate(),response.getPort());
    }
}
