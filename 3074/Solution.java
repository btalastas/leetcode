import java.util.Arrays;

class Solution {
    public static int minimumBoxes(int[] apple, int[] capacity) {

        int totalApples = Arrays.stream(apple).sum();
        int totalBoxes = 0;

        Arrays.sort(capacity);

        for (int i = capacity.length - 1; i >= 0; i--) {
            totalApples -= capacity[i];
            totalBoxes++;

            if (totalApples <= 0) {
                break;
            }
        }

        return totalBoxes;
    }

    public static void main(String[] args) {

        int[] apple = { 9, 8, 8, 2, 3, 1, 6 };
        int[] capacity = { 10, 1, 4, 10, 8, 5 };

        System.out.println(minimumBoxes(apple, capacity));
    }
}