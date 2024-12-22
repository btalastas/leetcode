class Solution {
    public static boolean lemonadeChange(int[] bills) {

        int fiveBills = 0;
        int tenBills = 0;

        if (bills[0] != 5) {
            return false;
        }

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveBills++;
            } else if (bills[i] == 10) {
                tenBills++;
                fiveBills--;

                if (fiveBills < 0) {
                    return false;
                }
            } else {
                if (tenBills == 0) {
                    fiveBills -= 3;
                } else {
                    tenBills--;
                    fiveBills--;
                }

                if (tenBills < 0 || fiveBills < 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = { 5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5 };

        System.out.println(lemonadeChange(array));
    }
}