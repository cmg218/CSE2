//Christine Gelotte
//10/9/15
//lab 07 --encripted x
//the purpose of this lab is to make an encripted x
import java.util.Scanner;//import scanner
public class encrypted_x{
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //access Scanner in program
        int side = 0;
        boolean booInt=false;//boolean for the while loop
        while(!booInt){//check input
            System.out.print("Enter an integer between 5-100:");
            if(myScanner.hasNextInt()){
                side=myScanner.nextInt();
                if (side>4&&side<=100){
                    break;
                }
                System.out.println("Invalid.");
            }
            else{
               System.out.println("Invalid.");
               myScanner.next();
            }
        }//end of while loop checking input
        int row = 0;//number of rows
        int collumn = 0;//number of collumns
        int counter = side-1;//a counter value for creating a diagonal 
        while(collumn<=side){
            while(row<=side){
                if(collumn==row||(row-collumn)==counter){
                    System.out.print(" ");
                }//end of if statement
                else{
                    System.out.print("*");
                }
                row++;//increment the row #
            }//end of while loop for creating stars for each row corresponding to each row
            collumn++;//increment the collumn
            counter = counter - 2;//decrement the counter by two
            System.out.println("");//start next line
            row=0;//reset row
        }//while loop for creating each new collumn of square
    }//end of main method
}//end of class