package com.amuse.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: yule
 * @Date: 2018/8/9 0009 20:54
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient // 选用的注册中心是eureka
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
