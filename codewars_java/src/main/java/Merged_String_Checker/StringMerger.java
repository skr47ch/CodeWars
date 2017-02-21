package Merged_String_Checker;

import java.util.ArrayList;
import java.util.List;

public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        List<String> listMain = new ArrayList<String>();
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        int m = 0;

        if (s.length() != part1.length() + part2.length())
            return  false;

        if (part1.length() == 0 && part2.equals(s))
            return true;
        else if (part2.length() == 0 && part1.equals(s))
            return true;

        for (int i = 0; i < part1.length() && i < part2.length();) {
            int k = i+1;
            if (part1.charAt(i) == part2.charAt(i)) {
                for (; k < part1.length() && k < part2.length(); k++) {
                    if (part1.charAt(k) != part2.charAt(k)) {
                        k += 1;
                        break;
                    }
                }
            }
            list1.add(part1.substring(i, k));
            list2.add(part2.substring(i, k));

            //m += i;
            listMain.add(s.substring(m, m + k));
            listMain.add(s.substring(m + k, m + k + k ));

            i = k;
        }

        System.out.println(listMain);
        System.out.println(list1);
        System.out.println(list2);
        return  false;
    }
}
