public  class Main {
    public static int chisla(int x, int y) {
        for (int i = y; i < x; i += y) {
            System.out.println(i * i);
        }
        return x;
    }


    public static void main(String[] args) {
        
        chisla(25, 5); // Ввод: x = 25, y = 5
    }
}
