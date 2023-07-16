package com.example.springtask4.command;

import com.example.springtask4.config.UtilConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class CommandLineRunnerTest implements CommandLineRunner {
    private final ApplicationContext applicationContext;
    @Override
    public void run(String... args) throws Exception {
        String[] beans = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beans)
                .filter(s-> s.equalsIgnoreCase("listUtility")
                || s.equalsIgnoreCase("stringUtility")
                || s.equalsIgnoreCase("dummyLogger"))
                .forEach(System.out::println);
    }
}
