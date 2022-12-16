package com.springboot.context.cache.service;

import org.springframework.cache.annotation.*;

/**
 * @CacheConfig注解用于在类级别上配置公共的缓存配置，例如cacheNames、KeyGenerator、CacheManager、CacheResolver等
 * @Cacheable 注解则是会将方法的返回值缓存，下次调用时先检查缓存中是否存在这个值，存在则返回，不存在则执行方法体，缓存返回值
 * @CacheEvict 注解则是会根据对应的key值从缓存中将对应的value值删除
 * @CachePut 注解则是会根据condition和unless的条件进行判断之后将返回值添加到缓存中
 * @Caching 注解则是复合注解，用于定义复杂的缓存规则
 */
@CacheConfig(cacheNames = {"test"})
public interface CacheService {
    @Cacheable(cacheManager = "cacheManager", keyGenerator = "keyGenerator")
    String addCache(String cacheValue);

    @CacheEvict(cacheManager = "cacheManager", keyGenerator = "keyGenerator")
    String substractCache(String cacheValue);

    @CachePut(cacheManager = "cacheManager", keyGenerator = "keyGenerator")
    String putCache(String cacheValue);

    @Caching(
            cacheable = {
                    @Cacheable(value = "emp", key = "#lastName")
            },
            put = {
                    @CachePut(value = "emp", key = "#result.id"),
                    @CachePut(value = "emp", key = "#result.email")
            }
    )
        //此时会将id、email、lastname分别作为key的之后的数据都加载缓存中
    /*但这个根据lastName查询employee的方法每次查询都会执行，不会从缓存中取；
        因为有@CachePut；CachePut是把方法执行后的结果放入缓存；所以方法必须执行*/
    String caching(String cacheValue);

    /**
     * 缓存查询流程说明：
     *
     */
}
