package com.dbq.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by @author dabaoqiang on 2023/5/21.
 */
@Configuration
@MapperScan("com.dbq.mybatis.mapper")
public class MyBatisConfig {
}
