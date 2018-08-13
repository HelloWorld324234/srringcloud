package com.amuse.ribbonserver.service;

import com.alibaba.fastjson.JSONObject;
import com.amuse.eurekaclient.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: yule
 * @Date: 2018/8/9 0009 21:36
 * @Description:
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String test(String str) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi/" + str, String.class);
    }

    @HystrixCommand(fallbackMethod = "selectOneError")
    public User selectOne() {
        User forObject = restTemplate.getForObject("http://EUREKA-CLIENT/hi/user", User.class);
        return forObject;
    }

    public List<User> selectAll() {
        Object forObject = restTemplate.getForObject("http://EUREKA-CLIENT/hi/users", Object.class);
        List<User> users = JSONObject.parseArray(JSONObject.toJSONString(forObject), User.class);
        return users;
    }

    public String error(String string) {
        return "" + this.getClass().getName() + "出现错误";
    }

    public User selectOneError() {
        return null;
    }

}
