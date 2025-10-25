package conditional;

import java.util.Scanner;

public class Check_Character {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a character : ");
        char ch=sc.next().charAt(0);
        System.out.println();
        if(ch>='A'&&ch<='Z'){
            System.out.println(ch+" is Uppercase Letter !");
        }
        if(ch>='a'&&ch<='z'){
            System.out.println(ch+" is Lowercase Letter !");
        }
        if(ch>='1'&&ch<='9'){
            System.out.println(ch+" is a Number !");
        }
        else{
            System.out.println(ch+" is special character !");
        }
        sc.close();
    }
}   
