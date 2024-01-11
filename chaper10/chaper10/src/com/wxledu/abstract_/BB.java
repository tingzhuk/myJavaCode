package com.wxledu.abstract_;

public class BB extends Template{
    @Override
    public void job() {
        long num = 0;

        for (int i = 1; i <= 200000; i++) {
            num += i;
        }
    }
}
