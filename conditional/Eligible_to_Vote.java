package conditional;

import java.util.Scanner;

public class Eligible_to_Vote {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        System.out.println();
        String eligible = (age>=18)?"Eligible":"Not Eligible";
        System.out.println(age+ " is "+eligible+" for vote !");
        sc.close();
    }
}
