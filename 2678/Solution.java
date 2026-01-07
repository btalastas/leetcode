class Solution {
    public static int countSeniors(String[] details) {
        int seniors = 0;

        for (int i = 0; i < details.length; i++) {
            System.out.println(Integer.parseInt(details[i].substring(11, 13)));
            if (Integer.parseInt(details[i].substring(11, 13)) > 60) {
                seniors++;
            }
        }

        return seniors;
    }

    public static void main(String[] args) {

        String[] array = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };

        System.out.println(countSeniors(array));
    }
}