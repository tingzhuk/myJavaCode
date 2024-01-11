package com.wxledu.set_;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();

        set.add(new String(new String("AA")));
        set.add(456);
        set.add(456);

        System.out.println("set = " + set);

    }
}
