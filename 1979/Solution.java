import java.util.Arrays;

class Solution {

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int findGCD(int[] nums) {
        int gcd = 0;

        Arrays.sort(nums);

        gcd = gcd(nums[nums.length - 1], nums[0]);

        return gcd;
    }
}