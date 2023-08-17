package operators;

public class AddingShort {
    public static void main(String args[]) {
        short a = 10;
        short b = 10;
        // a+=b;//a=a+b internally so fine
        // a = a + b;// Compile time error because 10+10=20 now int

        // another type
        a = (short) (a + b);
        // 20 which is int but now converted to short
        System.out.println(a);
    }
}
