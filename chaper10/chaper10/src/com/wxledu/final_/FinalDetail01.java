package com.wxledu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
    }
}

class AA{
    //在定义的时候
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {//在构造器中
        TAX_RATE2 = 0.08;
    }

    {//在代码块中
        TAX_RATE3 = 0.9;
    }

}

class BB{
    //在定义的时候
    public final static double TAX_RATE = 10;
    public final static double TAX_RATE2;

    static {//在静态的代码块中
        TAX_RATE2 = 9.9;
    }
}

//final 类不能继承 ，但可以实例化对象
final class CC { }
