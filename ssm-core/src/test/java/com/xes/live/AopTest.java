package com.xes.live;

import com.xes.live.core.AopBusiness.LookFilm;
import com.xes.live.core.AopBusiness.impl.LookFilmImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by liuweishi on 2017/8/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring-ssm-core.xml" })
public class AopTest {
    @Inject
    private LookFilm lookFilmImpl;
    @Test
    public void  aopTest(){
        lookFilmImpl.lookFilm();
    }
}
