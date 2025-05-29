public class Main {
    public static long fib(int n) {
       long a=0,b=1,temp;
       for(int i=0;i<n;i++){
           temp=a+b;
           a=b;
           b=temp;
       }
       return a; 
    }

    public static long fusc(int n) {
       long[] cache=new long[n+2];
       cache[0]=0; cache[1]=1;
       for(int i=2;i<=n;i++){
           if(i%2==0){
               cache[i]=cache[i/2];
           } else{
               cache[i]=cache[i/2]+cache[i/2+1];
           }
       }
       return cache[n];
    }

    public static void main(String[] args){
       for(int i=0;i<10;i++){
           System.out.println("fib("+i+")="+fib(i));
           System.out.println("fusc("+i+")="+fusc(i));
       }
    }
}