package Task1;

import java.util.*;

public class Exercise_A {
    public static int CubeSum(Integer num){
        int dig1 = num / 10;
        int dig2 = num % 10;

        return (int) Math.pow(dig1 + dig2, 3);
    }

    public static void main(String[] args) {

        //___________________#16___________________//
        System.out.println("Task A #16");

        ArrayList<Integer> container = new ArrayList<Integer>();
        int i = 10;

        for (; i < 100; ++i) {
            if (i*i == CubeSum(i)) {
                container.add(i);
            }
        }

        for (int num : container){
            System.out.println(num);
        }

        //___________________#3___________________//
        System.out.println("\n\nTask A #3");

        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int sumEven = 0;
        int sumOdd = 0;

        int tmp;
        int newNum = 0;
        while (b > 0){
            tmp = b % 10;

            newNum *= 10;
            newNum += tmp;

            b = b / 10;
        }

        System.out.println("The reverse of the given number is - " + newNum);
    }

}
