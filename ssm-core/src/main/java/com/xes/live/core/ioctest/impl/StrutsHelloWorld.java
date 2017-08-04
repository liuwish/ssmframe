package com.xes.live.core.ioctest.impl;

import com.xes.live.core.ioctest.HelloWorld;
import org.springframework.stereotype.Service;

/**
 * Created by liuweishi on 2017/8/4.
 */
@Service
public class StrutsHelloWorld implements HelloWorld{
    @Override
    public void sayHelloWorld() {
        System.out.println("Struts hello world");
    }
}
