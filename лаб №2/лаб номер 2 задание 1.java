public class Main {
    public static boolean isItReal(String x, String y) {
        
        if (x.length() < y.length()) {
            return false;
        }

        
        String suffix = x.substring(x.length() - y.length());

        
        return suffix.equals(y); 
    }

    public static void main(String[] args) {
        String x = "abc";
        String y = "bc";

        
        boolean result = isItReal(x, y);
        System.out.println("является ли y концом x ? " + result); 
    }
}
