package com.xes.live.dao.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by liuweishi on 2017/8/24.
 */
public class User {
    @Id
    private String id;//主键

    @Column(name = "user_id")
    private String userid;


}
