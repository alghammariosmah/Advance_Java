import java.util.Scanner;

/**
 * Created by Osamah Al-Ghammari on 10/25/2016.
 */
public class Power {
    static int userInputInt, userInputExp;
    
    public static void main(String[] args){
        System.out.println("Enter the integer value:");
        userInputInt = userInput();
        System.out.println("Enter the exponential value:");
        userInputExp = userInput();

        long lStartTime = System.currentTimeMillis();
        double result = power1(userInputInt, userInputExp);
        System.out.println("Power ="+result);
        long lEndTime = System.currentTimeMillis();
        long t = lEndTime - lStartTime;
        System.out.println("Efficiency in Milli Second= "+t);
    }
    public static int userInput(){
        int userInputN;
        Scanner scan = new Scanner(System.in);
        userInputN = scan.nextInt();
        return userInputN;
    }
    static double power(int val, int exp) {
        double res = 1;
        if (exp < 0){
            exp = Math.abs(exp);
            for (int i = 1; i <= exp; i++)
                res = res * val;
            res =  1/res;
            return res;
        }else {
            for (int i = 1; i <= exp; i++)
                res = res * val;
            return res;
        }
    }

    static double power1(int val, int exp) {
        double res= 1;
        if (exp < 0){
            exp = Math.abs(exp);
            while(exp> 0) {
                if(exp% 2 == 0) {val= val* val; exp= exp/ 2;// x²ⁿ = (x*x)ⁿ
                } else{res= res* val; exp--;}// xⁿ⁺¹ = x*xⁿ
            }
            return 1/res;
        }else {
            while (exp > 0) {
                if (exp % 2 == 0) {val = val * val;exp = exp / 2;
                } else {res = res * val;exp--;}
            }
            return res;
        }
    }

}