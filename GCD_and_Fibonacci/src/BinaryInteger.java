/**
 * Created by Al-Ghammari on 11/10/2016.
 */
public class BinaryInteger {
    private int number;
    public BinaryInteger(){
        number = 0;
    }
    public BinaryInteger(int n){
        number = n;
    }

    public void set(int n){
        number = n;
    }
    private static void getBinary(StringBuffer sb, int n){
        if (n>=2) getBinary(sb,n/2);
        sb.append(""+n%2);
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();

        if (number < 0){
            sb.append("-");
            getBinary(sb, -number);
        }else getBinary(sb, number);
        return sb.toString();
    }
}