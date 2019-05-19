package CH3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates array mainpulation.
 * @version 1.20 2019-05-20
 * @author Book
 * 个人代码多了一个数组复制，多此一举。
 */
public class LotteryDrawing_b {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k=in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n=in.nextInt();

        // fill an array with numbers 1 2 3...n
        int[] numbers =new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;
        }
        // draw k numbers and put them into a second array.
        int[] result = new  int[k];
        for (int i = 0; i < result.length; i++) {
            // make a random index between 0 and n-1.
            int r=(int)(Math.random()*n);

            // pick the element at the random location.
            result[i]=numbers[r];

            // move the last element into the random location.
            numbers[r]=numbers[n-1];
            System.out.println(Arrays.toString(numbers));
            n--;
        }
        // print the sorted array.
        Arrays.sort(result);
        System.out.println("Bet the following combination.It will make you rich1");
        for (var r : result)
        {
            System.out.println(r);
        }
    }
}
