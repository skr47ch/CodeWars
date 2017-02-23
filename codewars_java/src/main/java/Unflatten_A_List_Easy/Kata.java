/*
*** Unflatten a list (Easy) ***
You get an array of integers and have to unflatten it by these rules:

- You start at the first number.
- If this number x is smaller than 3, take this number x direct
  for the new array and continue with the next number.
- If this number x is greater than 2, take the next x numbers (inclusive this number) as a
  sub-array in the new array. Continue with the next number AFTER this taken numbers.
- If there are too few numbers to take by number, take the last available numbers.

The given array will always contain numbers. There will only be numbers > 0.

Example:
 [1,4,5,2,1,2,4,5,2,6,2,3,3] -> [1,[4,5,2,1],2,[4,5,2,6],2,[3,3]]

*/
package Unflatten_A_List_Easy;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static Object[] unflatten(int[] flatArray) {
        List<Object> split = new ArrayList<Object>();
        int length = flatArray.length;

        for (int i = 0; i < length;) {
            if(flatArray[i] < 3) {
                split.add(flatArray[i ++]);
            }
            else {
                Object[] temp = new Object[Math.min(flatArray[i], length - i)];
                for (int j = 0; j < temp.length; j++, i++) {
                    temp[j] = flatArray[i];
                }
                split.add(temp);
            }
        }
        return split.toArray();
    }
}
