/**
 * Created by Al-Ghammari on 11/10/2016.
 */
public class Fibonacci {
    public int iterativeFibo(int n){
        int t1 = 0,nextNumber = 0 , t2 = 1;
        if ((n == 0) || (n == 1))return n;
        nextNumber = t1 + t2;
        for (int i = 3; i<= n; i++) {
            //System.out.println(t1 + " "+ t2 + " "+ nextNumber);
            t1 = t2;
            t2 = nextNumber;
            nextNumber = t1 + t2;
        }
        return nextNumber;
    }



    public int recursiveFibo(int n) {
        if ((n == 0) || (n == 1))return n;
        return recursiveFibo(n - 1) + recursiveFibo(n - 2);
    }
}
