package com.xes.live.web.controller.business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuweishi on 2017/7/31.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(value = "/admin")
    @ResponseBody
    public String testSpring(){
        return "My Spring";
    }
}
