package com.avcherkasov.mongoose.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Value("${mongoose.name}")
    private String appName;

    @RequestMapping(method = RequestMethod.GET)
    public String test(){
        LOGGER.info("Test log {}", appName);
        return "test";
    }
}
