import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void test() {
		checkGCD(20,25); // checking both iterative and recursive way
		checkGCD1(20,25, 5); // checking only the iterative way
		checkGCD2(20,25, 5); // checking only the recursive way
		
		checkFibonacci(10);// checking both iterative and recursive way
		checkFibonacci1(10, 55);// checking only the iterative way
		checkFibonacci2(10, 55);// checking only the recursive way
	}
	
	private void checkGCD(int a,int b){
		GCD gcd = new GCD();
		result1 = gcd.iterativeGCD(a, b);
		result2 = gcd.recursiveGCD(a, b);
		assertEquals(result1,result2);
	}
	
	private void checkGCD1(int a, int b, int input){
		GCD gcd = new GCD();
		result1 = gcd.iterativeGCD(a, b);
		assertEquals(result1,input);
	}
	private void checkGCD2(int a, int b, int input){
		GCD gcd = new GCD();
		result2 = gcd.iterativeGCD(a, b);
		assertEquals(result2,input);
	}
	
	private void checkFibonacci(int n){
		Fibonacci fibo = new Fibonacci();
		result1 = fibo.recursiveFibo(n);
		result2 = fibo.iterativeFibo(n);
		assertEquals(result1,result2);
	}
	
	private void checkFibonacci1(int n, int input){
		Fibonacci fibo = new Fibonacci();
		result1 = fibo.iterativeFibo(n);
		assertEquals(result1,input);
	}
	private void checkFibonacci2(int n, int input){
		Fibonacci fibo = new Fibonacci();
		result2 = fibo.recursiveFibo(n);
		assertEquals(result2,input);
	}
	
	private int result1, result2;
}
