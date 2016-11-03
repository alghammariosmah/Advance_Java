

/**
 * Created by Al-Ghammari on 10/28/2016.
 */
public class Main {
    public static void main(String[] args){
        Time t = new Time(18, 30, 50);
        System.out.println(t);
        t.set(5000);
        System.out.println(t);
        t.addSec(100);
        System.out.println(t);
        t.addMin(100);
        System.out.println(t);
        t.addHour(3);
        System.out.println(t);
        Time test = new Time();
        test.set(5000);
        System.out.println(t.equals1(test));

        Date d = new Date();
        System.out.println(d);
        d.set(1992, 12, 2);
        System.out.println(d);
        d.add(12);
        System.out.println(d);
        d.addMonth(4);
        System.out.println(d);
        d.addYear(1000000);
        System.out.println(d);
        Date test1 = new Date();
        test1.set(1001993,4,14);
        System.out.println(d.equals(test1));
    }
}