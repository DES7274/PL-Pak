public class CodeBreakerGame {
    public static void main(String[] args) {
        int[] zagadanniyKod = {1, 2, 3, 4};
        int popitki = 0;
        int maksimalniePopitki = 20;

        System.out.println("Угадайте код из 4 чисел (от 0 до 9). у вас " + maksimalniePopitki + " попыток.");

        while (popitki < maksimalniePopitki) {
            int[] predpolozhenie = new int[4];
            System.out.print("введите вашу попытку (4 числа через пробел): ");

            for (int i = 0; i < 4; i++) {
                predpolozhenie[i] = Integer.parseInt(System.console().readLine());
            }

            int sovpadenia = countMatches(zagadanniyKod, predpolozhenie);
            popitki++;

            if (sovpadenia == 4) {
                System.out.println("вы угадали код: " + arrayToString(zagadanniyKod));
                break;
            } else {
                System.out.println("совпадения: " + sovpadenia);
                System.out.println("попыток осталось: " + (maksimalniePopitki - popitki));
            }
        }

        if (popitki == maksimalniePopitki) {
            System.out.println("исчерпали все попытки. загаданный код был: " + arrayToString(zagadanniyKod));
        }
    }

    private static int countMatches(int[] zagadanniyKod, int[] predpolozhenie) {
        int sovpadenia = 0;
        boolean[] proverennye = new boolean[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (zagadanniyKod[i] == predpolozhenie[j] && !proverennye[j]) {
                    sovpadenia++;
                    proverennye[j] = true;
                    break;
                }
            }
        }

        return sovpadenia;
    }

    private static String arrayToString(int[] array) {
        String result = "";
        for (int num : array) {
            result += num + " ";
        }
        return result.trim();
    }
}