public class Game {
    public static void main(String[] args) {
        long kolichestvoPalochek = 10; 
        String pobeditel = opredelitPobeditela(kolichestvoPalochek);
        System.out.println("Победитель: " + pobeditel);
    }

    public static String opredelitPobeditela(long n) {
        if (n == 0) {
            return "Nichya";
        }
        return (n % 2 == 0) ? ((n / 2) % 2 == 0 ? "Tanya" : "Sasha") : "Sasha";
    }
}