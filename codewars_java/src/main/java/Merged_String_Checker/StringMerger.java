package Merged_String_Checker;

import java.util.ArrayList;
import java.util.List;

public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        int m = 0;
        int x = 0;
        int y = 0;
        int pos = 0;
        List<String> test = new ArrayList<String>();

        if (s.length() != part1.length() + part2.length())
            return  false;

        if (part1.length() == 0) {
            if(part2.equals(s)) return  true;
            else  return false;
        }

        if (part2.length() == 0) {
            if(part1.equals(s)) return  true;
            else  return false;
        }
//
//        s = s.replace("\\", ",");
//        part1 = part1.replace("\\", ",");
//        part2 = part2.replace("\\", ",");

        for (int i = 0; i < s.length(); i ++) {
            pos = i;

            if (s.charAt(i) == part1.charAt(x)) {
                x ++;       test.add(Character.toString(part1.charAt(x-1)));
                if (s.charAt(i) == part2.charAt(y)) {
                    y ++;   test.add(Character.toString(part2.charAt(y-1)));
                    m ++;
                }
                else {
                    if (m > 0) {
                        y -= m;
                        m = 0;
                    }
                }
            }
            else if (s.charAt(i) == part2.charAt(y)) {
                y ++;   test.add(Character.toString(part2.charAt(y-1)));
                if (m > 0) {
                    x -= m;
                    m = 0;
                }
            }
            else if (m > 0 && s.charAt(i) == part1.charAt(x-m)) {
                x = x - m + 1; test.add(Character.toString(part1.charAt(x - 1)));
                m = 0;
            }
            else if (m > 0 && s.charAt(i) == part2.charAt(y-m)) {
                y = y - m + 1; test.add(Character.toString(part2.charAt(y-1)));
                m = 0;
            }
            else return false;

            System.out.println(test + "  , m = " + m + "  , x = " + x + "  , y = " + y);

            if ( x >= part1.length() || y >= part2.length()) {
                pos ++;
                System.out.println(test);
                break;
            }
        }

        if (x >= part1.length()) {
            if (!s.substring(pos, s.length()).equals(part2.substring(y, part2.length())))
                return false;
        } else if (y >= part2.length()) {
            if (!s.substring(pos, s.length()).equals(part1.substring(x, part1.length())))
                return false;
        }
        return true;
    }
}
