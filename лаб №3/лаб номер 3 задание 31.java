public class Main {
    public static void main(String[] args) {
        int[] rasstoyaniya = {50, 55, 57, 58, 60};
        int maxRasstoyanie = 175;
        int gorodaKotorieNuzhnoPosetit = 3;

        int result = vybratLuchshieSumma(maxRasstoyanie, gorodaKotorieNuzhnoPosetit, rasstoyaniya);
        System.out.println("Максимально возможное расстояние: " + result);
    }

    public static int vybratLuchshieSumma(int maxRasstoyanie, int gorodaKotorieNuzhnoPosetit, int[] rasstoyaniya) {
        int bestSumma = -1;
        int n = rasstoyaniya.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int summa = rasstoyaniya[i] + rasstoyaniya[j] + rasstoyaniya[k];
                    if (summa <= maxRasstoyanie && summa > bestSumma) {
                        bestSumma = summa;
                    }
                }
            }
        }

        return bestSumma;
    }
}