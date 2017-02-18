package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SKR47CH on 2/19/2017.
 */
class DoubleLinear {
    public static void dblLinear (int n) {
        List<Integer> list = new ArrayList<>();
        int x = 0;
        int y = 0;

        list.add(1);
        for (;list.size() < n + 1;) {
            int a = 2 * list.get(x) + 1;
            int b = 3 * list.get(y) + 1;

            if (a < b) {
                list.add(a);
                x ++;
            } else if (a > b) {
                list.add(b);
                y ++;
            } else {
                list.add(b);
                x ++;
                y ++;
            }
        }
        System.out.println(list);
        //return list.get(n);
    }
}
