package conditional;

import java.util.Scanner;

public class Leap_year {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        System.out.println();
        String leap = ((year%100!=0 && year%4==0)||(year%400==0))?"a Leap":"Not a Leap";
        System.out.println(year + " is "+leap+" year");
        sc.close();
    }
}
