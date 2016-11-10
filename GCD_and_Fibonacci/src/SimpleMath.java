/**
 * Created by Admin on 11/10/2016.
 */
public class SimpleMath {

    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println("The Greatest Common Divisor:");
        System.out.println(gcd.recursiveGCD(25,20));
        
        Fibonacci fibo = new Fibonacci();
        System.out.println("Fibonacci for 10:");
        System.out.println(fibo.recursiveFibo(10));
        System.out.println(fibo.iterativeFibo(10));
        
        System.out.println("The Binary representation for 10:");
        BinaryInteger x = new BinaryInteger();
        x.set(10);
        System.out.println(x+" Binary represetnation for "+10);
        
        System.out.println("The Towers of Hanoi for 3:");
        TowersOfHanoi t = new TowersOfHanoi(3);
        t.solve();
    }
}