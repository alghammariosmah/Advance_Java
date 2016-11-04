

/**
 * Created by Al-Ghammari on 10/28/2016.
 */
public class Main {
    public static void main(String[] args){
        Time t = new Time(18, 30, 50);
        System.out.println("Without the constructor the time is s set as: "+ t);
        t.set(5000);
        System.out.println("Setting the time to 5000 seconds: "+ t);
        t.addSec(100);
        System.out.println("Adding 100 seconds: "+ t);
        t.addMin(100);
        System.out.println("Adding 100 mins: "+ t);
        t.addHour(60);
        System.out.println("Adding 60 hours: "+ t);
        Time test = new Time();
        test.set(5000);
        System.out.println("Setting a new time: "+ test);
        System.out.println("Does "+ test+" equals "+t+" ?");
        System.out.println(t.equals1(test));

        Date d = new Date();
        System.out.println("With the constructor the date is s set as: "+ d);
        d.set(1992, 12, 2);
        System.out.println("Setting the Date to: "+ d);
        d.add(12);
        System.out.println("Adding 12 days: " + d);
        d.addMonth(4);
        System.out.println("Adding 4 months: " + d);
        d.addYear(1000000);
        System.out.println("Adding 1000000 years: " + d);
        Date test1 = new Date();
        test1.set(1001993,4,14);
        System.out.println("Setting a new date: "+ test1);
        System.out.println("Does "+ test1+" equals "+d+" ?");
        System.out.println(d.equals(test1));
    }
}