package com.wxledu.date_;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        //java.util.Date

        // 1. 获取当前时间
        // 2. 这里的 date 是 java.util.Date;
        // 3. 默认输出的日期格式是国外的方式，因此需要通常需要对格式进行转换
        Date date = new Date(); // 获取当前时间
        System.out.println("当前时间 = " + date);

        // 1. 创建一个这样的对象可以指定相应的格式
        // 2. 这里格式里的字母是规定好的，不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(date);// 将日期格式进行转换
        System.out.println(format);

        // 可以把一个格式化的字符串转换成 date
        // 得到的 date 好是国外的形式，如果还需要指定格式 format()
        // String -> Date  sdf 的格式需要和给的字符串格式一样，否则会抛出异常
        String str = "2023年11月04日 08:43:03 星期六";
        Date d1 = sdf.parse(str); // 这里会有异常 抛出即可  ParseException
        System.out.println(sdf.format(d1));
    }
}
