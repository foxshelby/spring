package com.springboot.context.format.controller;

import com.springboot.context.format.service.FormatService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author:zdd
 * @Date： 2022/12/16 16:54
 */
@RestController
public class FormatController {

    @Resource
    private FormatService formatService;

    @GetMapping("dateP")
    public String redis(){
        return formatService.getFormattedDate(new Date());
    }
}
