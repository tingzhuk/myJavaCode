package com.wxledu;

/**
 * @author 王鑫磊
 * @version 1.0
 * 做成处理流 / 包装流
 */
public class BufferedReader_ extends Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    // 让他的方法更加灵活， 多次读取文博姐爱你
    public void readFiles(int nums){
        for (int i = 0; i < nums; i++) {
            reader_.readFile();
        }
    }

    // 扩展 readString  可以多次读取字符串
    public void readStrings(int nums){
        for (int i = 0; i < nums; i++) {
            reader_.readString();
        }
    }
}
