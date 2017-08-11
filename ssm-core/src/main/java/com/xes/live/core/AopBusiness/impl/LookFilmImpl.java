package com.xes.live.core.AopBusiness.impl;

import com.xes.live.core.AopBusiness.LookFilm;
import org.springframework.stereotype.Service;

/**
 * Created by liuweishi on 2017/8/11.
 */
@Service
public class LookFilmImpl implements LookFilm{
    @Override
    public void lookFilm() {
        System.out.println("this film of off is good");
    }
}
