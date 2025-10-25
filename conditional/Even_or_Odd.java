package conditional;

import java.util.Scanner;

public class Even_or_Odd {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a number to check whether it is Even or Odd : ");
        int num = sc.nextInt();
        String result = (num%2==0)?"Even":"Odd";
        System.out.println(num+" is "+result);
        sc.close();
    }
}
