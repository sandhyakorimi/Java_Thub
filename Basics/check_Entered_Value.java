import java.util.Scanner;
public class check_Entered_Value{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int val = sc.next().charAt(0);
        if((val>='A'&&val<='Z')||(val>='a'&&val<='z')){
            System.out.println(val+" is a character");
        }
        else if(val>='0'&&val<='9'){
            System.out.println(val+" is a Number");
        }
        else
         System.out.println(val+" is a Special character");

         sc.close();
    }
}