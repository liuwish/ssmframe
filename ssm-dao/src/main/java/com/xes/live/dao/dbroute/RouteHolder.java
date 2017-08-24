package com.xes.live.dao.dbroute;

/**
 * Created by liuweishi on 2017/8/24.
 */
public class RouteHolder {
    private static ThreadLocal<String> routeKey = new ThreadLocal<String>();

    public static String getRouteKey() {
        String key = routeKey.get();
        return key;
    }

    public static void setRouteKey(String key) {
        routeKey.set(key);
    }

    public static void removeRouteKey() {
        routeKey.remove();
    }
}
