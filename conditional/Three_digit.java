// package conditional;

// import java.util.Scanner;

// public class Three_digit {
//      public static void main(String[] args) {
//         Scanner sc = new Scanner((System.in));
//         System.out.print("Enter a number : ");
//         int num = sc.nextInt();
//         int temp =num;
//         System.out.println();
//         int count =1;
//         while(num>9 && count<=4){
//             int val=num/10;
//             if(val>0){
//                 count = count+1;
//             }
//             num =val;
//         }
//         if(count==3){
//             System.out.println(temp+ " is a three digit number !");
//         }
//         else System.out.println(temp+" is not a three digit number !");
//         sc.close();
//     }
// }
package conditional;

import java.util.Scanner;

public class Three_digit {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println();
        if(num>=100 && num<=999){
            System.out.println(num+" is a Three digit number !");
        }
        else if(num<=-100 && num>=-999){
            System.out.println(num+ " is a Three digit number !");
        }
        else System.out.println(num+ " is not a three digit number !");
        sc.close();
    }
}
