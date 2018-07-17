package com.ravi.microservices.limitsservice.Controllers;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ravi.microservices.limitsservice.Configurations.LimitsConfiguration;
import com.ravi.microservices.limitsservice.Models.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigController {

    @Autowired
    LimitsConfiguration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMaximum(),configuration.getMinimum());
    }

    @GetMapping("/fault")
    @HystrixCommand(fallbackMethod = "retrieveLimits")
    public Limits faultTolerance(){
        throw  new RuntimeException("");
    }


}
