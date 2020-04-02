package com.example.usermanagement.config;

import com.example.licensemanagement.service.LicenseService;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonGetServiceConfig {

    /**
     * Spring boot sudah melakukan auto config terhadap connection redis
     */
    @Autowired
    private RedissonClient redisson;

    /**
     * Untuk ambil service dari "server side" dibutuhkan bean yang 
     * dapat ambil service tersebut dari instance redis
     * @return LicenseService
     */
    @Bean
    public LicenseService registerLicenseService() {
        return redisson.getRemoteService().get(LicenseService.class);
    }
    
}