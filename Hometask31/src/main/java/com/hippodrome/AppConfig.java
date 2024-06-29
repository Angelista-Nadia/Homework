package com.hippodrome;

import com.hippodrome.domain.Horse;
import com.hippodrome.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
public class AppConfig {

    @Bean
    public User user() {
        return new User(1000);
    }

    @Bean
    public Horse horse1() {
        return new Horse("Horse1");
    }

    @Bean
    public Horse horse2() {
        return new Horse("Horse2");
    }

    @Bean
    public Horse horse3() {
        return new Horse("Horse3");
    }

    @Bean
    public Horse horse4() {
        return new Horse("Horse4");
    }

    @Bean
    public Horse horse5() {
        return new Horse("Horse5");
    }
}