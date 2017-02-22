package Merged_String_Checker;

import java.util.ArrayList;
import java.util.List;

public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        int m = 0;
        int x = 0;
        int y = 0;
        int pos = 0;

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

        for (int i = 0; i < s.length(); i ++) {
            pos = i;
            if (s.charAt(i) == part1.charAt(x)) {
                x ++;
                if (s.charAt(i) == part2.charAt(y)) {
                    y ++;
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
                y ++;
                if (m > 0) {
                    x -= m;
                    m = 0;
                }
            }
            else if (m > 0 && s.charAt(i) == part1.charAt(x-m)) {
                x = x - m + 1;
                m = 0;
            }
            else if (m > 0 && s.charAt(i) == part2.charAt(y-m)) {
                y = y - m + 1;
                m = 0;
            }
            else return false;

            if ( x >= part1.length() || y >= part2.length()) {
                pos ++;
                break;
            }
        }

        if (m > 0 && s.charAt(pos) == part1.charAt(x-m) && (x-m) < part1.length()) {
            x = x - m;
            m = 0;
        }
        else if (m > 0 && s.charAt(pos) == part2.charAt(y-m)) {
            y = y - m;
            m = 0;
        }

        if (x >= part1.length()) {
            if(m > 0) {
                return (s.substring(pos-m).equals(part2.substring(y - m) + part1.substring(x - m)));
            }
            else return (!s.substring(pos).equals(part2.substring(y)));
        }
        else if (y >= part2.length()) {
            if(m > 0) {
                return (s.substring(pos-m).equals(part1.substring(x - m) + part2.substring(y - m)));
            }
            else return (s.substring(pos).equals(part1.substring(x)));
        }

        return true;
    }
}
