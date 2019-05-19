package CH3;


import java.util.Arrays;

public class LotteryDrawing {
    public static void main(String[] args) {
        int n=49;
        int[] numbers=new  int[n];
        int k=6;
        int[] result= new int[k];
        for (int i = 0; i < 49; i++) {
            numbers[i]=i+1;
        }
        for (int i = 0; i < 6; i++) {
            int j;
            j= (int)(Math.random()*n);
            result[i]=numbers[j];
            numbers[j]=numbers[n-1];
            n--;
            System.out.println(n);
            int[] temp;
            temp= Arrays.copyOf(numbers,n);
            numbers=temp;
            System.out.println(Arrays.toString(numbers)+"Lenth is: "+numbers.length);
        }
        Arrays.sort(result);
        for (var i:result){
            System.out.println(i);
        }
    }
}
