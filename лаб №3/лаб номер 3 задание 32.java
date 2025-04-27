public class Main {
    public static void main(String[] args) {
        int i = 10; 
        
        if (i < 10 || i > 100000) {
            System.out.println("Znacheniye i dolzhno byt' v diapazone ot 10 do 100000.");
            return;
        }

        String chisloFibonacci = raschitatFibonacci(i);
        System.out.println("f(" + i + ") = " + chisloFibonacci);
        
        int[] schetchikTsifr = poschitatTsifry(chisloFibonacci);
        int[] rezultat = naytiMaxTsifru(schetchikTsifr);
        
        System.out.println("Naibol'shoye vkhodeniye: " + rezultat[0] + " (kolichestvo: " + rezultat[1] + ")");
    }

    public static String raschitatFibonacci(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";

        String a = "0";
        String b = "1";
        
        for (int j = 2; j <= n; j++) {
            String sleduyushchee = dobavitStroki(a, b);
            a = b;
            b = sleduyushchee;
        }
        
        return b;
    }

    public static String dobavitStroki(String num1, String num2) {
        StringBuilder rezultat = new StringBuilder();
        
        int perenos = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || perenos > 0) {
            int summa = perenos;
            if (i >= 0) summa += num1.charAt(i--) - '0';
            if (j >= 0) summa += num2.charAt(j--) - '0';
            
            rezultat.append(summa % 10);
            perenos = summa / 10;
        }
        
        return rezultat.reverse().toString();
    }

    public static int[] poschitatTsifry(String number) {
        int[] schetchik = new int[10];
        
        for (char c : number.toCharArray()) {
            schetchik[c - '0']++;
        }
        
        return schetchik;
    }

    public static int[] naytiMaxTsifru(int[] schetchikTsifr) {
        int maxSchetchik = -1;
        int tsifraSMaxSchetchikom = -1;

        for (int tsifra = 0; tsifra < schetchikTsifr.length; tsifra++) {
            if (schetchikTsifr[tsifra] > maxSchetchik) {
                maxSchetchik = schetchikTsifr[tsifra];
                tsifraSMaxSchetchikom = tsifra;
            } else if (schetchikTsifr[tsifra] == maxSchetchik && tsifra < tsifraSMaxSchetchikom) {
                tsifraSMaxSchetchikom = tsifra; 
            }
        }

        return new int[]{tsifraSMaxSchetchikom, maxSchetchik};
    }
}