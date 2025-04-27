public class Main {
    public static void main(String[] args) {
        
        testCheckSumOfPowers(89, 1);  
        testCheckSumOfPowers(695, 2); 
        testCheckSumOfPowers(123, 1); 
    }

    public static void checkSumOfPowers(int chisloA, int stepenW) {
        int summa = 0;
        String strChisloA = String.valueOf(chisloA);
        
        for (int i = 0; i < strChisloA.length(); i++) {
            int cifra = Character.getNumericValue(strChisloA.charAt(i));
            summa += Math.pow(cifra, stepenW + i);
        }

        for (int k = 1; k <= 64; k++) {
            if (summa == chisloA * k) {
                System.out.println("Сумма степеней равно произведению: " + summa + " = " + chisloA + " * " + k);
                return;
            }
        }

        System.out.println("нет такой ситуации = " + chisloA + " и степени = " + stepenW);
    }

    public static void testCheckSumOfPowers(int chisloA, int stepenW) {
        System.out.println("проверка для числа = " + chisloA + ", степень = " + stepenW);
        checkSumOfPowers(chisloA, stepenW);
    }
}