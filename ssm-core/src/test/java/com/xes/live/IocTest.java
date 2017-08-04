package com.xes.live;

import com.xes.live.core.ioctest.HelloWorld;
import com.xes.live.core.ioctest.impl.SpringHelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by liuweishi on 2017/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring-ssm-core.xml" })
public class IocTest {
    @Inject
    private HelloWorld springHelloWorld;
//   控制反转的特性，将类的实例化转由被依赖的类本省执行，试用与多态
    @Test
    public void iocTest(){
        springHelloWorld.sayHelloWorld();
    }
}
