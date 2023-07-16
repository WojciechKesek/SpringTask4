package com.example.springtask4.model;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;


@Slf4j
public class DummyLogger {
    private void sayHi() {
        log.info("Hi from zadanie4");
    }
}

