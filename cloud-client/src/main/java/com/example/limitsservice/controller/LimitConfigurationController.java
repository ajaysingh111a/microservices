package com.example.limitsservice.controller;

import com.example.limitsservice.config.Configuration;
import com.example.limitsservice.entity.LimitConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
public class LimitConfigurationController {

    private final Configuration configuration;

    @RequestMapping(value = "/limit", method = RequestMethod.GET)
    public LimitConfiguration limitConfiguration(){

        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

}
