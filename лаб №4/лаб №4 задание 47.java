public class Main {
    public static int[] snail(int[][] array) {
        int n=array.length,result[]=new int[n*n],index=0;
        int top=0,bottom=n-1,left=0,right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++) result[index++]=array[top][i];
            top++;
            for(int i=top;i<=bottom;i++) result[index++]=array[i][right];
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--) result[index++]=array[bottom][i];
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--) result[index++]=array[i][left];
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N=4; 
        int[][] array=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                array[i][j]=(int)(Math.random()*100)+1;
            }
        }
        for(int[] row:array){
            for(int v:row) System.out.print(v+" ");
            System.out.println();
        }
        int[] sortedArray=snail(array);
        for(int v:sortedArray) System.out.print(v+" ");
    }
}