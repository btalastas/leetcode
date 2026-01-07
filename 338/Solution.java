class Solution {
    public static int[] countBits(int n) {
        // int[] array = new int[n + 1];

        // for (int i = 0; i < array.length; i++) {
        // int ones = 0;
        // int num = i;
        // while (num != 0) {
        // if ((num & 1) == 1) {
        // ones++;

        // }
        // num >>= 1;
        // }
        // array[i] = ones;
        // }

        // return array;

        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(countBits(n));
    }
}