import java.util.Scanner;


public class Version2 {
	static double sum, buffer1;
    int s;
    static double avg;
    int[] anArray; // creating an array for the input n numbers
    static StringBuffer b= new StringBuffer();
    public static void main(String[] args){
    	Version2 calling = new Version2();
        calling.userInput();
        sum = 0;
        buffer1 =0;
        /*
        printing the array here
         */
        for (int i=0; i <= calling.anArray.length; i++){
            if (calling.anArray[i]==0){
                break;
            }
            System.out.print(calling.anArray[i]+" ");
            sum += calling.anArray[i];
            buffer1++;
        }
        String result= b.toString();
        System.out.println("\nstring:\n"+result);
        System.out.println("The min = "+ calling.anArray[0]);
        int counter = 1;
        while (true){
            if (calling.anArray[calling.anArray.length-counter]!=0){
                System.out.println("The max = "+ calling.anArray[calling.anArray.length-counter]);
                break;
            }
            counter++;
        }
        avg = sum /buffer1;
        System.out.println("average="+avg);
        System.out.println("Sumation="+(int)sum);



    }

    public void userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n upper limit");
        s = scan.nextInt();
        primeNum(s);
    }

    public void primeNum(int max){
        anArray = new int[max+1];
        boolean[] sieve = new boolean[max+1];
        for(int i = 2; i <= max; i++) {
            sieve[i] = true;
        }
        int no = 1;
        int counter = 0;
        System.out.println("The Prime number array:");
        for(int i = 2; i <= max; ){
            no ++;
            anArray[counter]= i; // inserting the prime numbers into the array
            b.append(i);
            counter++;
            for (int j = i; j <= max; j=j+i) sieve[j] = false;
            while (i <= max && !sieve[i]) i++;
        }
    }

}
