package conditional;

import java.util.Scanner;

public class Greatest_of_Two {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println();
        int greater = (a>b)?a:b;
        System.out.println(greater+ " is greatest number among "+a+" and "+b);
        sc.close();
    }
}
