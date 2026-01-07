import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] array = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (map.get(difference) != null && map.get(difference) != i) {
                array[0] = i;
                array[1] = map.get(difference);
                break;
            }
        }

        return array;

    }

    public static void main(String[] args) {
        int[] array = { 3, 2, 4 };

        System.out.println(twoSum(array, 6));
    }
}