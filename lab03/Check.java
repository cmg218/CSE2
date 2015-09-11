// Christine Gelotte
//CSE2
//September 11 2015
// Lab 03
//The purpose of this program is to calculate the amount each person pays at a restaurant splitting the bill
import java.util.Scanner;
public class Check{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //access Scanner in program
        System.out.print("Enter the original cost of the check in the form xx.xx: "); // ask user for original cost input
        double checkCost = myScanner.nextDouble(); // accept user input recieved
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");// ask user for tip percentage
        double tipPercent = myScanner.nextDouble();//accept user input recieved
        tipPercent = tipPercent/100;//convert whole number into decimal
        System.out.print("Enter number of people who went out to dinner: ");//ask user for number of people at dinner
        double numPeople = myScanner.nextInt();//accept user input recieved
        // declare other variables
        double totalCost;
        double costPerPerson;
        int dollars;//whole dollars
        int dimes;
        int pennies;
        //dimes and pennies store digits to right of decimal place
        //Calculate the total cost, and cost per person
        totalCost = checkCost*(1+tipPercent);
        costPerPerson=totalCost/numPeople;
        // Make use of variables (dollars, dimes, pennies) to store the cost per person without excess digits past right side of decimal point
        dollars = (int)costPerPerson;
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes: $"+dollars+"."+dimes+pennies); //print out final output
    }// end of main method
}// end of class