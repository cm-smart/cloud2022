package com.chen.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.chen.dao"})
public class MybatisConfig {

}
