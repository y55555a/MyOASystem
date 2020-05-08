package com.y55555a.oasystem.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author y55555a
 * Date on 2020/5/2  22:55
 */
public class SQLDateTime {

    public static String toTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(new Date());
    }

    public static String toTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(date);
    }
}
