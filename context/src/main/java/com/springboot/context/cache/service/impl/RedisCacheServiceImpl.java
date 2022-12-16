package com.springboot.context.cache.service.impl;

import com.springboot.context.cache.service.RedisCacheService;
import org.springframework.stereotype.Service;

/**
 * @Author:zdd
 * @Date： 2022/12/16 16:39
 */
@Service
public class RedisCacheServiceImpl implements RedisCacheService {
    @Override
    public String addCache(String cacheValue) {
        System.out.println("执行了方法体");
        return cacheValue+"123";
    }
}
