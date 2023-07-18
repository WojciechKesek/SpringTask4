package com.example.springtask4.command;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CommandLineRunnerTest implements CommandLineRunner {
    private final ApplicationContext applicationContext;
    private final Set<String> correctNames = Set.of("dummyLogger", "listUtility", "stringUtility");
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Solution 1");
        String[] beans = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beans)
                .filter(s-> s.equalsIgnoreCase("listUtility")
                || s.equalsIgnoreCase("stringUtility")
                || s.equalsIgnoreCase("dummyLogger"))
                .forEach(System.out::println);
        System.out.println("Solution 2");
        System.out.println(Set.of(applicationContext.getBeanDefinitionNames()).containsAll(correctNames));
    }
}
