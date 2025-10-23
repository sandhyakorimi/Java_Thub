package conditional;

import java.util.Scanner;

public class Vowel_or_Consonant {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a character : ");
        char char1 = sc.next().toLowerCase().charAt(0);
        System.out.println();
        String vowel = (char1=='a'||char1=='e'||char1=='i'||char1=='o'||char1=='u')? "Vowel !":"Consonant !" ;
        System.out.println(char1+" is a "+vowel);
        sc.close();
    }
}
