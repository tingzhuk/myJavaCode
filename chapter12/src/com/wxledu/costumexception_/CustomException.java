package com.wxledu.costumexception_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        if(!(age >= 18 && age <= 120)){
            throw new AgeException("年龄需要在 18 ~ 120 之间");
        }
        System.out.println("你的年龄范围正确");
    }
}

//自定义一个异常类
// 解读
//1. 一般情况下我们自定义的异常 继承 RuntimeException
//2. 即把自定义异常定义成 运行时异常的好处是 我们可以使用默认的处理机制
//3. 即比较方便
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
