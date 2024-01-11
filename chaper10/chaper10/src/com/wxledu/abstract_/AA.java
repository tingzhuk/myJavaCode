package com.wxledu.abstract_;

public class AA extends Template{
    @Override
    public void job() {
        long num = 0;
        for (int i = 1; i <= 10000; i++) {
            num += i;
        }
    }
}
