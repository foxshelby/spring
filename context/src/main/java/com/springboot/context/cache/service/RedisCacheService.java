package com.springboot.context.cache.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

/**
 * @Author:zdd
 * @Date： 2022/12/16 16:39
 */
@CacheConfig(cacheNames = {"my-redis-cache1"})
public interface RedisCacheService {
    @Cacheable(cacheManager = "redisCacheManager", keyGenerator = "keyGenerator")
    String addCache(String cacheValue);
}
