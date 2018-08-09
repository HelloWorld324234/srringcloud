package com.amuse.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yule
 * @Date: 2018/8/9 0009 20:56
 * @Description:
 */
@RestController
public class EurekaClientController {

    @Value("${server.port}")
    private String port;

    @Value(("${spring.application.name}"))
    private String name;

    @GetMapping("hi/{str}")
    public String home(@PathVariable("str") String str) {
        return "AppName:" + name + "     port:" + port + "    " + str;
    }

}
