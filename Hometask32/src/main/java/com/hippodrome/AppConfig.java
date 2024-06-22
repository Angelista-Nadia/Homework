package com.hippodrome;

import com.hippodrome.domain.User;
import com.hippodrome.service.Hippodrome;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public User user() {
        return new User(1000);
    }

    @Bean
    public List<String> horses() {
        return Arrays.asList("Horse1", "Horse2", "Horse3", "Horse4", "Horse5");
    }

    @Bean
    public Hippodrome hippodrome() {
        return new Hippodrome(horses(), user());
    }
}