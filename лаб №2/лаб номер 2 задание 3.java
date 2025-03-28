public class Main {

    public static String del(String str) {
        String result = "";


        for (int schet = 0; schet < str.length(); schet++) {
            char c = str.charAt(schet);

            if (c != 'а' && c != 'у' && c != 'о' &&
                    c != 'А' && c != 'У' && c != 'О' &&
                    c != 'е' && c != 'ё' && c != 'и' &&
                    c != 'ы' && c != 'э' && c != 'ю' &&
                    c != 'я' && c != 'Е' && c != 'Ё' &&
                    c != 'И' && c != 'Ы' && c != 'Э' &&
                    c != 'Ю' && c != 'Я') {
                    result = result + c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "Привет, мир!";
        String output = del(input);
        System.out.println( output);
    }
}