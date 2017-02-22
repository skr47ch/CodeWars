package Number_Of_Trailing_Zeros_Of_Factorial_N;

public class Solution {
    public static int zeros(int n) {

        int count = 0;

        for (int i = 5; i <= n; i *= 5) {
            count += n/i;
        }
        return count;
    }
}
