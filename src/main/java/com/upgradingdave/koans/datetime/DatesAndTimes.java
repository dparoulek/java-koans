package com.upgradingdave.koans.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatesAndTimes {
    
    public static String now(String dateFormat) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(cal.getTime());

      }

      public static void  main(String arg[]) {
         System.out.println(now("dd MMMMM yyyy"));
         System.out.println(now("yyyyMMdd"));
         System.out.println(now("dd.MM.yy"));
         System.out.println(now("MM/dd/yy"));
         System.out.println(now("yyyy.MM.dd G 'at' hh:mm:ss z"));
         System.out.println(now("EEE, MMM d, ''yy"));
         System.out.println(now("h:mm a"));
         System.out.println(now("H:mm:ss:SSS"));
         System.out.println(now("K:mm a,z"));
         System.out.println(now("yyyy.MMMMM.dd GGG hh:mm aaa"));
      }

}
