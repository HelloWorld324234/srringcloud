package com.amuse.feignserver.controller;

import com.amuse.eurekaclient.model.User;
import com.amuse.feignserver.dao.EurekaServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yule
 * @Date: 2018/8/10 0010 18:52
 * @Description:
 */
@RestController
public class FeignServerController {

    @Autowired
    private EurekaServerFeign eurekaServerFeign;

    @GetMapping("/feign/user")
    public User getUser() {
        return eurekaServerFeign.test();
    }

}
