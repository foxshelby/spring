package com.springboot.context.cache.controller;

import com.springboot.context.cache.service.CacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CacheController {

    @Resource
    private CacheService cacheService;

    @GetMapping("test1")
    public String test1(){
        return cacheService.addCache("新增了一个缓存");
    }

    @GetMapping("test2")
    public String test2(){
        return cacheService.substractCache("新增了一个缓存");
    }

    @GetMapping("test3")
    public String test3(){
        return cacheService.putCache("放入一个缓存");
    }

    @GetMapping("test4")
    public String test4(){
        return cacheService.caching("放入一个缓存");
    }
}
