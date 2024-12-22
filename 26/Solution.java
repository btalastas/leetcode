public class Solution {

    public int removeDuplicates(int[] nums) {

        /**
         * walk through array if seen number is -1, assign seen number to the
         * first number in array if seen number is == to current number, remove
         * current number, increment k
         */
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
