package com.amuse.feignserver.dao;

import com.amuse.eurekaclient.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: yule
 * @Date: 2018/8/10 0010 18:47
 * @Description:
 */
@FeignClient(value = "eureka-client")
public interface EurekaServerFeign {

    @GetMapping("hi/user")
    User test();

}
