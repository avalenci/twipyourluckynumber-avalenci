package com.company;

/**
 * Created by av128 on 10/10/16.
 */
public class Perfect {
    public String name;

    public Perfect(String n) {
        name = n;
    }

    public int perfectRandom() {
        int x = (int) Math.pow((int) (Math.random() * 1001), 2);
        return x;
    }
}
