public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Пожалуйста, введите два положительных числа.");
            return;
        }

        int a;
        int w;
        try {
            a = Integer.parseInt(args[0]);
            w = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введены не целые числа.");
            return;
        }

        if (a <= 0 || w <= 0) {
            System.out.println("Оба числа должны быть положительными.");
            return;
        }

        int sum = 0;
        String strA = String.valueOf(a);
        
        for (int i = 0; i < strA.length(); i++) {
            int digit = Character.getNumericValue(strA.charAt(i));
            sum += Math.pow(digit, w + i);
        }

        for (int k = 1; k <= 64; k++) {
            if (sum == a * k) {
                System.out.println("Сумма степеней равна произведению: " + sum + " = " + a + " * " + k);
                return;
            }
        }

        System.out.println("Нет такой ситуации.");
    }
}