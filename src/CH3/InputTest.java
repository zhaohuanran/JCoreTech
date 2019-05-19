package CH3;

import java.util.Scanner;
/**
 * This program demonstrates console input.
 * @version 1.20 2019-05-16
 * @author nauh
 */

public class InputTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("What's your name?");
        String name=in.nextLine();

        System.out.println("How old are you?");
        int year=in.nextInt();

        System.out.println("Hello "+name+". Next year you'll be "+(year+1)+".");
    }
}
