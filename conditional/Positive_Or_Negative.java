package conditional;
import java.util.Scanner;
public class Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter a number to check whether it is positive or negative : ");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("Enter number greater than 0. ");
        }
        else if(num>0){
            System.out.println(num+" is a Positive Number. ");
        }
        else System.out.println(num+ " is a Negative Number");
        sc.close();
    }
}
