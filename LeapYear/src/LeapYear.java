import java.util.Scanner;

/**
 * Created by Al-Ghammari on 10/12/2016.
 */
public class LeapYear {
    int userInputNm, beginning, ending, k;
    public static void main(String[] args){
        LeapYear calling = new LeapYear();
        calling.userInput();
        calling.userInput2();
    }
    public void userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a year to check whether it is a leap year or not:");
        userInputNm = scan.nextInt();
        if (isLeapingYear(userInputNm)){
            System.out.println(userInputNm+" is a leaping year");
        }else {
            System.out.println(userInputNm+" is NOT a leaping year");
        }
    }

    public static boolean isLeapingYear(int year){
        return year%400 == 0 || (year%4==0 && year%100 > 0 );
    }

    public void forRange(int begin, int ends){
        for (int i = begin; ends >= i; i++) {
            if (isLeapingYear(i)){
                System.out.println(i+" is a leaping year");
            }else {
                System.out.println(i+" is NOT a leaping year");
            }

        }
    }
    public void userInput2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nNow enter a range of years. Choose the beginning year: E.g. 2000");
        beginning = scan.nextInt();
        System.out.println("Now choose the ending year: E.g. 2100");
        ending = scan.nextInt();
        forRange(beginning, ending);
    }
}
