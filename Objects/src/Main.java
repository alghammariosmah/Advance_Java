/**
 * Created by Al-Ghammari on 10/28/2016.
 */
public class Main {
    public static void main(String[] args){
        Time t = new Time(18, 30, 50);
        Date d = new Date();
        d.set(1992,11,10);
        System.out.println(d);
        d.addMonth(4);
        System.out.println(d);
        d.addYear(1000000);
        System.out.println(d);
    }
}