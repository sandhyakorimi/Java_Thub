package conditional;

import java.util.Scanner;

public class Greatest_of_Three {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();
        System.out.println();
        
        int greatest = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(greatest+" is greatest among "+a+" ,"+b+" and "+c);
        sc.close();
     }
}
