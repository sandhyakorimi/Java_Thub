package conditional;

import java.util.Scanner;

public class Check_Triangle {
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

         if(((a+b)>c)&&((a+c)>b)&&((b+c)>a)){
            if((a==b)&&(b==c)){
                System.out.println("Equilateral Triangle!");
            }
            else if(a==b||b==c||c==a){
                System.out.println("Isosceles Triangle!");
            }
            else if(a!=b && b!=c && c!=a){
                System.out.println("Scalene Triangle!");
            }
         }
         else System.out.println("Not a Triangle!");
        sc.close();
    }
}
