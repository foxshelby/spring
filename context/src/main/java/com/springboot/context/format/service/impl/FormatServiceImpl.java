package com.springboot.context.format.service.impl;

import com.springboot.context.format.service.FormatService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author:zdd
 * @Date： 2022/12/16 16:55
 */
@Service
public class FormatServiceImpl implements FormatService {


    @Override
    public String getFormattedDate(Date localDateTime) {
        System.out.println();
        return localDateTime.toString();
    }
}
