public class InstanceVariables {
    // instance variables
    byte b;
    float f;
    public static void main(String[] args) {
        // create object
        InstanceVariables obj = new InstanceVariables();
        System.out.println("The default value of byte is : "+obj.b);
        obj.b=10;
        System.out.println("The value of byte after assigning value: "+obj.b);

        System.out.println("The default value of float is : "+obj.f);
        obj.f=3.14f;
        System.out.println("The assigned value of float is : "+obj.f);
    }
}
