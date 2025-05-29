public class Main {
    public static java.util.List<Integer> generateU(int limit) {
        java.util.List<Integer> uList=new java.util.ArrayList<>();
        java.util.Queue<Integer> queue=new java.util.LinkedList<>();
        queue.add(1);
        while (!queue.isEmpty() && uList.size()<limit){
            int x=queue.poll();
            if(!uList.contains(x)){
                uList.add(x);
                long y=2L*x+1,z=3L*x+1;
                if(!uList.contains((int)y)) queue.add((int)y);
                if(!uList.contains((int)z)) queue.add((int)z);
                if(x>Integer.MAX_VALUE/3) break;
            }
        }
        return uList;
    }

    public static void main(String[] args) {
        int N=10; 
        java.util.List<Integer> uSequence=generateU(N);
        for(int v:uSequence) System.out.print(v+" ");
    }
}