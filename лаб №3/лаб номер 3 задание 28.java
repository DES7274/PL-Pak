public class Main {
    public static String Shifr(String stroka, int sdvig, int napravlenie) {
        StringBuilder result = new StringBuilder();
        sdvig = sdvig % 26; 

        for (char c : stroka.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                if (napravlenie == 1) { 
                    c = (char) ((c - base - sdvig + 26) % 26 + base);
                } else { 
                    c = (char) ((c - base + sdvig) % 26 + base);
                }
            }
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String stroka = "Hello World";
        int sdvig = 3;
        int napravlenie = 0; 

        String shifrovannayaStroka = Shifr(stroka, sdvig, napravlenie);
        System.out.println(shifrovannayaStroka);
    }
}