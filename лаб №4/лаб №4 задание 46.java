public class Main {
    public static int romanToArabic(String s) {
        int total=0,i=0;
        while(i<s.length()){
            int v1=getValue(s.charAt(i));
            int v2=(i+1<s.length())?getValue(s.charAt(i+1)):0;
            if(v2>v1){
                total+=v2-v1;
                i+=2;
            } else{
                total+=v1;
                i++;
            }
        }
        return total;
    }

    private static int getValue(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return10;
            case 'L': return50;
            case 'C': return100;
            case 'D': return500;
            case 'M': return1000;
            default: return0;
        }
    }

    public static void main(String[] args) {
        String romanNumber="MCMLXXXVII";
        System.out.println(romanToArabic(romanNumber));
    }
}