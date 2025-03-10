package com.hanshan.hanpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com/hanshan/hanpicturebackend/mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class HanPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanPictureBackendApplication.class, args);
    }

}
