package com.xes.live.dao.dbroute;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by liuweishi on 2017/8/24.
 */
public class DbRouteDataSource extends AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
