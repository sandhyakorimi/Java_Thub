public class Operators {
    public static void main(String[] args) {
        int a=10, b=20;
        //Arithmetic Operators
        System.out.println("***** Arithmetic Operators *****");
        System.out.println("Sum : "+(a+b));
        System.out.println("Difference : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
        System.out.println("Modulo division : "+(a%b));

        // Relational Operators 
        System.out.println("***** Relational Operators *****");
        System.out.println("a==b : "+(a==b));
        System.out.println("a!=b : "+(a!=b));
        System.out.println("a<=b : "+(a<=b));
        System.out.println("a>=b : "+(a>=b));
        System.out.println("a<b : "+(a<b));
        System.out.println("a>b : "+(a>b));
 

        //Logical Operators
        System.out.println("**** Logical Operators *****");
        System.out.println((a==10) && (a>b));
        System.out.println((a!=b) && (b>a));
        System.out.println((a==10) || (a>b));
        System.out.println((a!=b) || (b>a));
        System.out.println(a!=b);
        System.out.println(a!=10);

        //Assignment Operators
        System.out.println("(a+=2) : "+(a+=2));
        System.out.println("(a-=2) : "+(a-=2));
        System.out.println("(a*=2) : "+(a*=2));
        System.out.println("(a/=2) : "+(a/=2));
        System.out.println("(a%=2) : "+(a%=2));

        //INcrement decrement
        int c =10;
        System.out.println("The value of c is : "+c);
        System.out.println("++c : "+(++c));
        System.out.println("c++ : "+(c++));
        System.out.println("--c : "+(--c));
        System.out.println("c-- : "+(c--));
        System.out.println("The value of c is : "+c);
    }
}
