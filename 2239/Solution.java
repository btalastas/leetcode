class Solution {
    public static int findClosestNumber(int[] nums) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(answer) || (Math.abs(nums[i]) == Math.abs(answer) && nums[i] > answer)) {
                answer = nums[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = { -100000, -100000 };

        System.out.println(findClosestNumber(array));
    }
}