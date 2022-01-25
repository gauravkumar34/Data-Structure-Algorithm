/**
 * BitWise
 */
public class BitWise {

    public static void main(String[] args) {
        int a =2;
        int b=3;
        System.out.println("a|b , OR "+(a|b));
        System.out.println("a&b , AND "+(a&b));
        System.out.println("a^b , XOR "+(a^b));
        System.out.println("~a , not "+(~a));
        System.out.println("~a , not "+(17>>1));
        System.out.println("~a , not "+(17>>2));
        System.out.println("~a , not "+(19<<1));
        System.out.println("~a , not "+(19<<2));
    }
}