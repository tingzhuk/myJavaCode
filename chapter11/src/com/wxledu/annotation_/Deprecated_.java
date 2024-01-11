package com.wxledu.annotation_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}

/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */

// @Deprecated  修饰某个元素表示已经过时，即不推荐使用，不代表不能使用
@Deprecated
class A{
    public int n1 =10;
    @Deprecated
    public void hi(){

    }
}
