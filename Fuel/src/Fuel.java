import java.util.Scanner;

public class Fuel {
	double s,s1,s2, distance, pricePerKm, profitPerKm;
    public static void main(String args[]){
        Fuel calling = new Fuel();
        calling.userInput();
        calling.calculating();
    }
    public void userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of fuel remaining in tank (in liters)");
        s = scan.nextDouble();

        System.out.println("Enter the Average consumption of fuel of car (in liters per 100 km)");
        s1 = scan.nextDouble();

        System.out.println("Enter the Price per liter of fuel");
        s2 = scan.nextDouble();

        if (s <= 0 || s1 <= 0 || s2<= 0 ){
            System.err.println("Don't enter an input lower or equal to 0");
        }
    }

    public void calculating(){
//        s = 10; // 10 liters remaining
//        s1 = 4 ;// 100 km per 4 liters
//        s2 = 1.12; // price per liter of fuel
        distance = (s /s1)* 100;
        System.out.printf("The distance in Km that the car can drive with remaining fuel = %.2f \n", distance);
        
        pricePerKm = (s2 * s1)/100;
        System.out.printf("The price per Km = %.2f Euros\n", pricePerKm);

        profitPerKm =  0.42 - pricePerKm;
        System.out.printf("The profit per Km %.2f Euros", profitPerKm);

    }
	
}
