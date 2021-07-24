package com.masiv.casinoapi.configurators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
@PropertySource("application.properties")
public class RedisConfig {
    @Value("${redis.roulettecache.hostname}")
    private String redisHostName;
    @Value("${redis.roulettecache.port}")
    private int redisPort;
    @Value("${redis.roulettecache.password}")
    private String password;
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration rc =new RedisStandaloneConfiguration(redisHostName, redisPort);
        rc.setPassword(password);
        LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory(rc);
        return connectionFactory;
    }
}
