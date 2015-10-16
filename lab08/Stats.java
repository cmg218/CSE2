//Christine Gelotte
//lab 07
//The purpose of this program is to print the mean and median of a set of 5 increasing numbers
import java.util.Scanner;
public class Stats{
    public static void main(String[] args){
        double val1=0;//declare variables used
        double val2=0;
        double val3=0;
        double val4=0;
        double val5=0;
        Scanner myScanner = new Scanner(System.in);
        Boolean mustInc=false;//arbitrary boolean
        System.out.print("Please enter first value:");
        val1 = myScanner.nextDouble();
        System.out.print("Please enter second value:");
        val2 = myScanner.nextDouble();
        while (!mustInc){
                if (val2>val1){
                    break;
                }//condition met, break out of while loop
                else{
                     System.out.println("Error: Must be greater than previous value");//condition not met
                     System.out.print("Please enter second value:");
                     val2 = myScanner.nextDouble();
                }//condition not met, try again
        }//end of while loop
        System.out.print("Please enter third value:");
        val3 = myScanner.nextDouble();
        while (!mustInc){
                if (val3>val2){
                    break;
                }//condition met, break out of while loop
                else{
                     System.out.println("Error: Must be greater than previous value");//condition not met
                     System.out.print("Please enter third value:");
                     val3 = myScanner.nextDouble();
                }//condition not met, try again
        }//end of while loop
        System.out.print("Please enter fourth value:");
        val4 = myScanner.nextDouble();
        while (!mustInc){
                if (val4>val3){
                    break;
                }//condition met, break out of while loop
                else{
                     System.out.println("Error: Must be greater than previous value");//condition not met
                     System.out.print("Please enter fourth value:");
                     val4 = myScanner.nextDouble();
                }//condition not met, try again
        }//end of while loop
        System.out.print("Please enter fifth value:");
        val5 = myScanner.nextDouble();
        while (!mustInc){
                if (val5>val4){
                    break;
                }//condition met, break out of while loop
                else{
                     System.out.println("Error: Must be greater than previous value");//condition not met
                     System.out.print("Please enter fifth value:");
                     val5 = myScanner.nextDouble();
                }//condition not met, try again
        }//end of while loop
        double mean= valMean(val1,val2,val3,val4,val5);//use mean method
        double median = valMedian(val3);//use median method
        printResults(mean,median);
    }//end of main method
    public static double valMean(double a,double b,double c, double d, double e){//method for computing the mean
        return (a+b+c+d+e)/5;
    }//end of varMean method
    public static double valMedian(double c){
        //only 5 values therefore median = c in set a-e
        return c;
    }//end of varMedian method
    public static void printResults(double x, double y){//method for printing results
        System.out.println("Mean:"+x);
        System.out.println("Median:"+y);
    }//print results
}//end of class