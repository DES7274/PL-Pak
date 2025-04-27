public class FitnessSorting {
    public static void main(String[] args) {
        String vesi = "56 65 74 100 99 68 86 180 90";
        String otsortirovannyeVesi = sortirovatVesiPoSummeCifr(vesi);
        System.out.println(otsortirovannyeVesi);
    }

    public static String sortirovatVesiPoSummeCifr(String vesi) {
        String[] massivVesov = vesi.split(" ");
        
        for (int i = 0; i < massivVesov.length - 1; i++) {
            for (int j = 0; j < massivVesov.length - i - 1; j++) {
                if (sravnit(massivVesov[j], massivVesov[j + 1]) < 0) {
                    String temp = massivVesov[j];
                    massivVesov[j] = massivVesov[j + 1];
                    massivVesov[j + 1] = temp;
                }
            }
        }
        
        return String.join(" ", massivVesov);
    }

    public static int sravnit(String w1, String w2) {
        int suma1 = sumaCifr(w1);
        int suma2 = sumaCifr(w2);
        
        if (suma1 != suma2) {
            return Integer.compare(suma1, suma2);
        }
        
        return Integer.compare(Integer.parseInt(w2), Integer.parseInt(w1));
    }

    public static int sumaCifr(String chislo) {
        int suma = 0;
        for (char cifra : chislo.toCharArray()) {
            suma += cifra - '0';
        }
        return suma;
    }
}