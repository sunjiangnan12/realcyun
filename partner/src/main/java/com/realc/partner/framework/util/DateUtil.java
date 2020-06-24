package com.realc.partner.framework.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String format1 = "yyyy-MM-dd HH:mm:ss";

    public static String getNow() {
        DateFormat dateFormat = new SimpleDateFormat(format1);
        return dateFormat.format(new Date());
    }

    public static String dateToString(Date date, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

}
