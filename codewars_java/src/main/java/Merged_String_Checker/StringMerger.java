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

        int xom = part1.length() + part2.length();

        System.out.println(s.length() + " " + part1.length() + " " + part2.length() + " " + xom);

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

        s = s.replace("\\", ",");
        part1 = part1.replace("\\", ",");
        part2 = part2.replace("\\", ",");

        for (int i = 0; i < s.length(); i ++) {
            pos = i;

            System.out.print("  " + i + " " + m + " " + x + " " + y);
            if (s.charAt(i) == part1.charAt(x)) {
                if (s.charAt(i) == part2.charAt(y)) {
                    x++;
                    y++;
                    m++;
                    test.add(Character.toString(s.charAt(i)));
                    System.out.println(test);
                } else {
                    if (m > 0) {
                        y -= m;
                        m = 0;
                    }
                    x++;
                    test.add(Character.toString(s.charAt(i)));
                    System.out.println(test);
                }
            } else if (s.charAt(i) == part2.charAt(y)) {
                if (m > 0) {
                    x -= m;
                    m = 0;
                }
                y ++;
                test.add(Character.toString(s.charAt(i)));
                System.out.println(test);
            } else return false;



            if ( x >= part1.length() || y >= part2.length()) {
                //pos ++;
                break;
            }
        }
        System.out.println(test);
        System.out.print("    " + pos  + " " + m + " " + x + " " + y);


        if (x >= part1.length()) {
            if (!s.substring(pos + 1, s.length()).equals(part2.substring(y, part2.length())))
                return false;
        }

        if (y >= part2.length()) {
            if (!s.substring(pos + 1, s.length()).equals(part1.substring(x, part1.length())))
                return false;
        }
        return true;
    }
}
