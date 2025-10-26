package conditional;

import java.util.Scanner;

public class Triangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter one side : ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter another side : ");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("Enter third side : ");
        int c = sc.nextInt();
        System.out.println();

        String triangle = (((a+b)>c)&&((a+c)>b)&&((b+c)>a))?"forms":"not forms";
        System.out.println("Three side "+a+" , "+b+" , "+c+" "+triangle+" Triangle!");
        sc.close();
    }
}
