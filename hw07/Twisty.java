//Christine Gelotte
//Homework 7
//10/14/15
//The purpose of this program is to produce a twisting pattern with loops
import java.util.Scanner;
public class Twisty{
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        boolean mustInt=false;//arbitrary boolean for while loop
         int height = 0;//height of pattern
        int length = 0;//length of pattern
        while(!mustInt){//check whether input is valid
            System.out.print("Please enter the height:");//ask for input
            if(myscanner.hasNextInt()){//check if input is an integer
                height=myscanner.nextInt();//record integer
                if(height<51&&height>0){//make sure integer is reasonable
                    break;//exit loop
                }//make sure height is reasonable size
                System.out.println("Error: Must enter integer >0 and <= 50");//condition not met
            }
            else{
                System.out.println("Error: Must enter integer >0 and <= 50");//condition not met
                myscanner.next();
            }
        }//end of height while loop
        while(!mustInt){//check if input valid
            System.out.print("Please enter the length:");//ask user for input
            if(myscanner.hasNextInt()){//check if input is an integer
                length=myscanner.nextInt();//record input
                if(length>height&&length<101){//make sure input is reasonable
                    break;//leave loop
                }//make sure length is reasonable size
                System.out.println("Error: Must enter integer >height and <=100");//condition not met
            }//make sure input is integer
            else{
                System.out.println("Error: Must enter integer >height and <=100");
                myscanner.next();
            }//print error message if condition not met
        }//end of length while loop
        for (int i=1;i<=height;i++){//for loop to produce each new row
            for (int j=1;j<=length;j++){//for loop to produce the components of the pattern on each row
                if(j%(2*height)==i){//if statement to create diagonal sloping down for #
                    System.out.print("#");
                }
                else if((j-i)%height==0){//else if statement for creating diagonal sloping down for \
                    System.out.print("\\");
                }
                else if(((j+i)-1)%(2*height)==0){//else if statement for creating diagonal # sloping up
                    System.out.print("#");
                }
                else if(((j+i)-1)%(height)==0){//else if statement for creating diagonal / sloping up
                    System.out.print("/");
                }
                else{//if none of the conditions are met, print space
                    System.out.print(" ");
                }
            } //end of length for loop
            System.out.println(""); 
        } //end of height for loop
    }//end of main method
}//end of class
