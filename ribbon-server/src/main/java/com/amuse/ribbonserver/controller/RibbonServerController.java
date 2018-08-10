package com.amuse.ribbonserver.controller;

import com.amuse.eurekaclient.model.User;
import com.amuse.ribbonserver.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: yule
 * @Date: 2018/8/9 0009 21:38
 * @Description:
 */
@RestController
public class RibbonServerController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/ribbon/{str}")
    public String test(@PathVariable("str") String str) {
        return "RibbonServer---->" + ribbonService.test(str);
    }

    @GetMapping("ribbon/user")
    public User selectOne() {
        return ribbonService.selectOne();
    }

    @GetMapping("ribbon/users")
    public List<User> selectAll() {
        return ribbonService.selectAll();
    }

}
