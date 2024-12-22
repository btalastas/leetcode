
class Solution {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int counter = 0;

        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0 && n == 1) {
                return true;
            } else if (flowerbed[0] == 0 && n == 0) {
                return true;
            } else if (flowerbed[0] == 1 && n != 0) {
                return false;
            }
        }

        for (int i = 0; i < flowerbed.length; i++) {

            // left end
            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                counter++;
                flowerbed[i] = 1;
            }

            // right end
            if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                counter++;
                flowerbed[i] = 1;
            }

            // middle
            if (i != 0 && i != flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0
                    && flowerbed[i + 1] == 0) {
                counter++;
                flowerbed[i] = 1;
            }
        }

        if (counter < n) {
            return false;
        }

        return counter >= n;
    }

    public static void main(String[] args) {

    }
}
