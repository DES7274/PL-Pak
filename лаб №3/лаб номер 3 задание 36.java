public class CaesarCipherDecoder {
    private static String[] slovar = {
        "пример", "текст", "слово", "другой", "зашифрованный", 
        // ...
    };

    public static void main(String[] args) {
        String zashifrovannyyTekst = "Uifsf jt b tfdsfu dpef";
        rasshifrovatCaesar(zashifrovannyyTekst);
    }

    private static void rasshifrovatCaesar(String tekst) {
        for (int sdvig = 1; sdvig < 26; sdvig++) {
            String rasshifrovannyyTekst = "";
            for (char c : tekst.toCharArray()) {
                if (Character.isLetter(c)) {
                    char baza = Character.isLowerCase(c) ? 'a' : 'A';
                    char rasshifrovannyySimvol = (char) ((c - baza - sdvig + 26) % 26 + baza);
                    rasshifrovannyyTekst += rasshifrovannyySimvol;
                } else {
                    rasshifrovannyyTekst += c;
                }
            }
            proveritRasshifrovannyyTekst(rasshifrovannyyTekst, sdvig);
        }
    }

    private static void proveritRasshifrovannyyTekst(String rasshifrovannyyTekst, int sdvig) {
        String[] slova = rasshifrovannyyTekst.split("\\W+");
        int kolichestvoPravilnykhSlov = 0;

        for (String slovo : slova) {
            for (String s : slovar) {
                if (slovo.equalsIgnoreCase(s)) {
                    kolichestvoPravilnykhSlov++;
                }
            }
        }

        if (kolichestvoPravilnykhSlov > 0) {
            System.out.println("Sdvig: " + sdvig + " | Rasshifrovannyy tekst: " + rasshifrovannyyTekst);
        }
    }
}