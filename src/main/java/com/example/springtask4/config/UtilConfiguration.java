package com.example.springtask4.config;

import com.example.springtask4.model.DummyLogger;
import com.example.springtask4.model.ListUtil;
import com.example.springtask4.model.StringUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {

    @Bean
    public DummyLogger dummyLogger(){
        return new DummyLogger();
    }

    @Bean
    public ListUtil listUtility(){
        return new ListUtil();
    }

    @Bean("stringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }
}
