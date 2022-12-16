package com.springboot.context.cache.service.impl;

import com.springboot.context.cache.service.CacheService;
import org.springframework.stereotype.Service;

@Service
public class CacheServiceImpl implements CacheService {
    @Override
    public String addCache(String cacheValue) {
        System.out.println(cacheValue+"执行了方法体");
        return cacheValue+"123";
    }

    @Override
    public String substractCache(String cacheValue) {
        System.out.println("执行了方法体");
        return cacheValue+"321";
    }

    @Override
    public String putCache(String cacheValue) {
        System.out.println("执行了方法体");
        return cacheValue+"333";
    }

    @Override
    public String caching(String cacheValue) {
        return "true";
    }
}
