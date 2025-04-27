public class TextTransformer {
    public static void main(String[] args) {
        String tekst = "сегодняшний враг  завтрашний дру";
        String[] slova = tekst.split("(?<=\\s)|(?=\\s)");
        StringBuilder rezultat = new StringBuilder();

        for (String slovo : slova) {
            if (slovo.matches("\\w+")) {
                char pervayaBukva = slovo.charAt(0);
                String preobrazovannoeSlovo = slovo.substring(1) + pervayaBukva + "aуч";
                rezultat.append(preobrazovannoeSlovo);
            } else {
                rezultat.append(slovo);
            }
        }

        System.out.println(rezultat.toString());
    }
}