package com.amuse.eurekaclient.controller;

import com.amuse.eurekaclient.model.User;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("hi/user")
    public User selectOne() {
        User user = new User();
        user.setId("111");
        user.setName("Tomcat");
        user.setAddress("china");
        return user;
    }

    @GetMapping("hi/users")
    public List<User> selectAll() {
        List<User> users = Lists.newArrayList();
        for(int i = 1; i <= 3; i++) {
            User user = new User();
            user.setId("" + i);
            user.setName("user" + i);
            user.setAddress("address" + i);
            users.add(user);
        }
        return users;
    }

}
