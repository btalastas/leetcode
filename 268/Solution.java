class Solution {
    public int missingNumber(int[] nums) {

        int sum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        int missingNumber;

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        missingNumber = sum - actualSum;
        return missingNumber;
    }
}