//Christine Gelotte
//homework 6 --Check digit
//the purpose of this program is to check whether or not an entered isbn is valid
import java.util.Scanner;//import scanner
public class CheckDigit{
    public static void main(String[] args){
       //initialize scanner
       Scanner myScanner = new Scanner(System.in);
       //declare variables for first two while loops (determining a potential ISBN (10 digit number))
       boolean booInput=true;//boolean for the while loops (getting an input of 10 digits)
       String initialInput =""; //user input (not sure if string or digits initially)
       String initialCheck=""; //user input for check value (hopfully digit 1-10)
       int digitInput=0;//first 9 digits of isbn
       int digitCheck=0;//(digit 0-10)
       while (booInput=true){//ask user for input, determine whether the input is exactly 9 digits, boolean arbitrary condition to keep loop running
           System.out.print("Please enter first 9 digits of the ISBN:");
           initialInput = myScanner.nextLine();//save user input as a string
           if (initialInput.length() ==9){//is the string 9 characters long?
            try{//try to convert input to integer
                digitInput = Integer.parseInt(initialInput);//can I convert the input to an integer?
                break;//break out of loop because input is valid
                }//end if (try to convert input to integer)
            catch(NumberFormatException edigitInput){//attempted conversion failed, must repeat loop
                System.out.println("This is not valid. Please enter only digits."); 
               }//end catch
           }//end of if statement checking if string 9 char long
           else{//string is not 9 char long
               System.out.println("This is not valid. Please enter only 9 digits.");
           }//end of else
       }//end of input loop
      while (booInput=true){//ask user for input, determine whether the input qualifies as a check digit, I use arbitrary boolean condition again
           System.out.print("Please enter the check digit (arabic number 0-10):");
           initialCheck = myScanner.nextLine();//save user input as a string
            try{//try to convert input to integer
                digitCheck = Integer.parseInt(initialCheck);//can I convert the input to an integer?
                if (digitCheck<11&&digitCheck>=0){//is check number 0-10?
                    break;//break out of loop, input valid
                }//end if
                else{
                   System.out.println("This is not valid. Please enter only arabic numbers (0-10).");  
                }
                }//end try
            catch(NumberFormatException edigitCheck){//attempted conversion failed
                System.out.println("This is not valid. Please enter only arabic numbers (0-10)."); 
               }//end catch
       }//end of check digit loop
       //print the complete ISBN for user
       System.out.println("----------------------");
       System.out.print("The ISBN you entered is "+initialInput);
       if(digitCheck<10){
           System.out.println(digitCheck);
       }
       else{//must be exactly 10 digits, print 10 as roman numeral X
           System.out.println("X");
           System.out.println("(X stands for the roman numeral 10)");
       }
       //declare variables for final check (if 10 digit number is actually an ISBN)
       int accumulator=0;//this accumulates the sum in loop
       double digitDeci=digitInput/1000000000.0;//I convert digit input to a decimal to make getting each individual digit easier
       int digit=0;//each individual digit
       int mulitplier=1;//multiplier to get each individual digit
       for(int counter=10;counter>1;counter--){//for loop counting all first 9 digits
           digit= (int)(digitDeci*(mulitplier*10))%10;//convert to digit using multiplier and modulus
           accumulator=accumulator+digit*counter;//accumulate sum, counter also represents number to multiply each digit by
           mulitplier= mulitplier*10;//increase multiple by a ten's place for next digit
       }
       if(accumulator%11==digitCheck){//check if valid ISBN --remainder=check digit
           System.out.println("This is a valid ISBN");
       }
       else{//false, must print out what check digit should be
           System.out.print("This is NOT a valid ISBN. Check digit should be ");
           if (accumulator%11==10){//if ten, must be represented with X
               System.out.println("X");
           }
           else{//otherwise, just use the remainder 
               System.out.println(accumulator%11);
           }
       }
    }//end of main method
}//end of class