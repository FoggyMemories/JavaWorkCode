package com.qian.school_2023.May.exercise05_06.work.p153_10_7_习题_7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-01-01 00:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);

        System.out.println(date.getTime());

        System.out.println("-----------------------");

        //转化格式

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        String str2 = sdf2.format(date);

        System.out.println(str2);
    }
}
