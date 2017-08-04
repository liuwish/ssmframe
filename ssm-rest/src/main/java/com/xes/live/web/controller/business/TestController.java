package com.xes.live.web.controller.business;

/**
 * Created by liuweishi on 2017/8/1.
 */

import com.xes.live.ssmframe.base.response.APIResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {
    @RequestMapping(value="/v1/responsetest",method = RequestMethod.GET)
    public APIResult resTest(){
        return new APIResult().success();
    }
    @RequestMapping(value = "/admin1")
    public String testSpring(){
        return "My admin1";
    }
}
