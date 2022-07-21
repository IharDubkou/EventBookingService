package org.podpivas.configuration;

import org.jeasy.random.EasyRandom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public EasyRandom easyRandom() {
        return new EasyRandom();
    }
}
