package Twice_Linear;

import java.util.ArrayList;
import java.util.List;

class DoubleLinear {
    public static int dblLinear (int n) {
        List<Integer> list = new ArrayList<Integer>();
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
        return list.get(n);
    }
}
