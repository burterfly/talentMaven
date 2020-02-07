package com.talent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.talent.dao.mapper")
public class TalentApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalentApplication.class, args);
    }

}