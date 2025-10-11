public class Greatest_of_three {
    public static void main(String[] args) {
       int a=10,b=20,c=29;
       int res = ((a>b) ? ((a>c)?a:c):(b>c)?b:c);
       System.out.println("The greater Element is : "+res);
    }
}
