package com.springboot.context.format.service;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author:zdd
 * @Date： 2022/12/16 16:55
 */
public interface FormatService {
    String getFormattedDate(@DateTimeFormat(style = "SS",pattern = "yyyy") Date localDateTime);
}
