package com.ran.hello;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Auther: Ran
 * @Date: 2019/5/5
 * @Description: com.ran.hello
 * @version: 1.0
 */
public class Hello {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date.getTime());
        System.out.println(date.toLocaleString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        ArrayList<Object> objects = new ArrayList<>();
        System.err.println("haha");
         System.err.println("有addle ");
    }
    
}
