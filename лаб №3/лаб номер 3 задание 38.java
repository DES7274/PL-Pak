public class EveryThirdGame {
    public static void main(String[] args) {
        int kolichestvoIgrakov = 7;
        int nomerNachalnogoIgraka = 1;

        int[] igroki = new int[kolichestvoIgrakov];
        for (int i = 0; i < kolichestvoIgrakov; i++) {
            igroki[i] = i + 1;
        }

        int kolichestvoUbitih = 0;
        int index = nomerNachalnogoIgraka - 1;

        while (kolichestvoUbitih < kolichestvoIgrakov - 1) {
            index = (index + 2) % (kolichestvoIgrakov - kolichestvoUbitih);
            System.out.print("[");

            for (int j = 0; j < kolichestvoIgrakov; j++) {
                if (igroki[j] != 0) {
                    System.out.print(igroki[j] + " ");
                }
            }

            System.out.print("] => " + igroki[index] + " отсчитывается и засчитывается в результат [");
            igroki[index] = 0;
            kolichestvoUbitih++;

            for (int j = 0; j < kolichestvoIgrakov; j++) {
                if (igroki[j] == 0) {
                    System.out.print(igroki[j] + " ");
                }
            }

            System.out.println("]");
        }

        for (int j = 0; j < kolichestvoIgrakov; j++) {
            if (igroki[j] != 0) {
                System.out.println("[] => " + igroki[j] + " отсчитывается и засчитывается в результат [");
                break;
            }
        }
    }
}