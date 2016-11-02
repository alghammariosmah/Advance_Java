/*
 * with the professor
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class PrimerNumbers {
	static int userInputInt;
	  public static void main(String[] args){
	      //userInputInt = t.userInput();
//	      t.printPrimeNumbers(userInputInt);
	      int[] primeNumbers1 = getPrimeNumbers(100);
	      //int n = getNoPrimeNumbers(5);
	      print(primeNumbers1);
	      log(primeNumbers1);

	     
	  }

	  public int userInput(){
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter the n upper limit");
	      userInputInt = scan.nextInt();
	      scan.close();
	      return userInputInt;
	  }

	  public static int[] getPrimeNumbers(int max){
	  	if (max <= 0)return null;
	  	int[] primeNumbers;
	      boolean[] sieve = new boolean[max+1];
	      int n = getNoPrimeNumbers(max);
	      primeNumbers = new int[n];
	      for(int i = 1; i <= max; i++) sieve[i] = true;
	      int no = 0;
	      int i = 2;
	      primeNumbers[0]= 1;
	      while(i <= max){
	          no ++;
	          primeNumbers[no]= i;
	          for (int j = i; j <= max; j=j+i) sieve[j] = false;
	          while (i <= max && !sieve[i]) i++;
	      }
	      return primeNumbers;
	  }
	  
	  public static int getNoPrimeNumbers(int max){
	  	if (max <= 0)return 0;
	  	if (max <= 3)return max;
	      boolean[] sieve = new boolean[max+1];
	      for(int i = 2; i <= max; i++) sieve[i] = true;
	      int noPrimeNumbers = 1;
	      int i = 2;
	      while(i <= max){
	      	noPrimeNumbers ++;
	          for (int j = i; j <= max; j=j+i) sieve[j] = false;
	          while (i <= max && !sieve[i]) i++;
	      }
	      return noPrimeNumbers;
	  }
	  
	  public static void print(int[] n ){
	  	if (n == null)return;
	  	for(int i = 0; i < n.length; i++){
	  		System.out.println(n[i]);
	  	
	  	}
	  }
	  
	  public static void log(int[] n) {
	      PrintWriter out = null;
	      try {
	          out = new PrintWriter(new FileWriter("primeNumbers.txt", true), true);
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	      for(int i = 0; i < n.length; i++){
	      	out.write(n[i]+" ");
	  	
	  	}
	      out.close();
	  }
}