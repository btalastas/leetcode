class Solution {
    public static int maxDistance(int[] colors) {
        int max = 0;

        for (int i = 0; i < colors.length; i++) {
            int housePointer = colors.length - 1;
            int maxDistance = 0;

            while (housePointer != i) {
                if (colors[i] != colors[housePointer] && housePointer == colors.length) {
                    max = housePointer - i;
                    break;
                } else if (colors[i] != colors[housePointer]) {
                    maxDistance = housePointer - i;

                    if (maxDistance > max) {
                        max = maxDistance;
                    }
                }

                housePointer--;

            }

            if (max == colors.length - 1) {
                break;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 6, 1, 1, 1 };

        System.out.println(maxDistance(array));
    }
}