import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;




public class Version1 {
	static int s, userInputInt;
    public static void main(String[] args){
        Version1 calling = new Version1();
        userInputInt = calling.userInput();
        calling.primeNum(userInputInt);

    }

    public int userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n upper limit");
        userInputInt = scan.nextInt();
        return userInputInt;
    }

    public void primeNum(int max){
        boolean[] sieve = new boolean[max+1];
        for(int i = 2; i <= max; i++) sieve[i] = true;
        System.out.println("Prime number:");
        int no = 1;
        for(int i = 2; i <= max; ){
            no ++;
            if (no % 20 == 0) System.out.println();
            System.out.print(i + " ");
            log(i);
            for (int j = i; j <= max; j=j+i) sieve[j] = false;
            while (i <= max && !sieve[i]) i++;
        }
        // commit
    }

    public static void log(int message) {
        String Converting = new Integer(message).toString();
        Converting = Converting+" ";
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("output.txt", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write(Converting);
        out.close();
    }
}

