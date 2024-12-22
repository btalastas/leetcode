package easy.leetcode14;

public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String longestCommonPrefix = "";
        int max = 0;
        for (int i = 0; i < strs.length - 1; i++) {
            char[] letters = strs[i].toCharArray();

            if (letters.length > 1) {
                for (int j = 1; j < strs.length; j++) {
                    char[] currentLetters = strs[j].toCharArray();

                    if (currentLetters.length > 1) {
                        int counter = 0;

                        for (int k = 0; k < letters.length; k++) {
                            if (k < currentLetters.length && letters[k] == currentLetters[k]) {
                                counter++;
                                sb.append(letters[k]);
                            }
                        }

                        if (max < counter) {
                            max = counter;
                            longestCommonPrefix = sb.toString();
                            sb.setLength(0);
                        }
                    }
                }
            }

        }

        return longestCommonPrefix;
    }

    public static void main(String[] args) {
        String[] test = {"flower", "flow", "flight"};

        String prefix = longestCommonPrefix(test);

    }
}
