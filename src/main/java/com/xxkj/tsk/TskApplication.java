package com.xxkj.tsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xxkj.ilikestudy.mapper")
public class TskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TskApplication.class, args);
    }

}
