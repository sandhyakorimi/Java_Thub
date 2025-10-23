package conditional;

import java.util.Scanner;

public class Grade {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();
        System.out.println();
        if(marks>=90){
            System.out.println(marks+" has A grade!");
        }
        else if(marks>75 && marks<89){
            System.out.println(marks+" has B grade!");
        }
        else if(marks>50 && marks<74){
            System.out.println(marks+" has C grade!");
        } 
        else if(marks<50){
            System.out.println(" Fail!");
        }       
        sc.close();
    }
}
