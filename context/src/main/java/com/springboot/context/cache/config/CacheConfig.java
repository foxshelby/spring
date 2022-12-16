package com.springboot.context.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * 第一种缓存的配置方式，通过继承 CachingConfigurerSupport类
 */
@Configuration
@EnableCaching
public class CacheConfig extends CachingConfigurerSupport {

    /**
     * 自定义缓存管理对象
     * @return
     */
    @Bean
    @Override
    public CacheManager cacheManager() {
        // configure and return an implementation of Spring's CacheManager SPI
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("default"),new ConcurrentMapCache("test")));
        return cacheManager;
    }

    /**
     * 自定义缓存的key值的生成策略
     * @return
     */
    @Bean
    @Override
    public KeyGenerator keyGenerator() {
        // configure and return an implementation of Spring's KeyGenerator SPI
        return new SimpleKeyGenerator();
    }
}
