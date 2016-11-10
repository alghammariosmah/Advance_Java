/**
 * Created by Al-Ghammari on 11/10/2016.
 */
public class GCD {
    public int iterativeGCD(int a, int b){
        int temp;
        if (a < b){
            temp = a;
            a = b;
            b = temp;
        }
        while (b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int recursiveGCD(int a, int b){
        int temp;
        if(b ==0 ){
            return a;
        }
        temp = a % b;
        return recursiveGCD(a=b,temp);
    }
}
