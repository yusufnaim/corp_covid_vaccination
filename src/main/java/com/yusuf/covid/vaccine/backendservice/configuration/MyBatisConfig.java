package com.yusuf.covid.vaccine.backendservice.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.yusuf.covid.vaccine.backendservice.db.mapper")
public class MyBatisConfig {
}
