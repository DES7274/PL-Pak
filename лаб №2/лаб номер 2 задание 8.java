public class Main {
    public static void main(String[] args) {
        // Заранее заданная строка
        String input1 = "ABccAAr";
        String input2 = "abCCaaR";

        System.out.println(convertCase(input1));
        System.out.println(convertCase(input2));
    }

    public static String convertCase(String input) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;


        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }


        if (upperCaseCount > lowerCaseCount) {
            return input.toUpperCase();
        } else if (lowerCaseCount > upperCaseCount) {
            return input.toLowerCase();
        } else {
            return input.toLowerCase(); 
        }
    }
}
