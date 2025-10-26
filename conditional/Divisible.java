package conditional;

import java.util.Scanner;

public class Divisible {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println();
        String divisible = ((num%5==0)&&(num%11==0))?"Divisible":"Not divisible";
        System.out.println(num + " is "+divisible+" by  5 and 11 !");
        sc.close(); 
    }
}   
