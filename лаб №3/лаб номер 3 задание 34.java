public class Game {
    public static void main(String[] args) {
        long n = 10; 
        long tanyaPalochki = igrovaiaLogika(n);
        System.out.println("Количество палочек у Тани: " + tanyaPalochki);
    }

    public static long igrovaiaLogika(long n) {
        long tanyaPalochki = 0;
        boolean tanyaTurn = true; 

        while (n > 0) {
            if (tanyaTurn) {
                
                if (n % 2 == 0) {
                    
                    tanyaPalochki++;
                    n--; 
                } else {
                    
                    tanyaPalochki++;
                    n--; 
                }
            } else {
              
                if (n % 2 == 0) {
                    
                    n /= 2; 
                } else {
                    
                    n--;
                }
            }
            tanyaTurn = !tanyaTurn;
        }

        return tanyaPalochki;
    }
}