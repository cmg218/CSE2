//Christine Gelotte
//October 19,2015
//Homeowork 8 part 2
//This program analyzes a string input from user and determines whether string is all letters
import java.util.Scanner;//import scanner
public class StringAnalysis{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//access scanner in main method
        //declare variables
        Boolean boo=false;//arbitrary boolean
        String ans="";//yes or no for analyzing whole string
        Boolean allLetters=false;//this boolean indicates whether analyzed section contained all letters
        int i=1;//this integer represents portion of string to be analyzed
        System.out.print("Please enter a string of characters:");//ask user for input
        String string = myScanner.nextLine();//store input as string
        System.out.print("Would you like to analyze whole string? Type yes or no (must be lowercase):");
        while(!boo){//while loop checking if user wants to analyze whole string
             ans=myScanner.nextLine(); //store string value
            if(ans.equals("yes")){//is input yes?
                break;//exit while loop
            }//end if yes
            if(ans.equals("no")){//is input no?
                break;//exit while loop
            }//end if no
            System.out.print("Error! Please enter yes or no(lowercase):");
        }//end while loop checking if user wants to analyze whole string
         if(ans.equals("yes")){//is input yes?
               allLetters= categorizeString(string);//call method
            }//end if yes
         else{//input was no
             System.out.print("Enter positive integer to indicate portion of string analyzed:");//ask for input
             while (!boo){//while, check if input positive integer
                if (myScanner.hasNextInt()){//make sure input is integer
                     i=myScanner.nextInt();
                    if(i>0){//make sure input>0
                        break;
                     }//check if input is greater than 0
                     System.out.print("Error! Must enter positive integer:");
                } // check if input is an integer
                else{//not integer
                    System.out.print("Error! Must enter positive integer:");
                    myScanner.next();
                }//else not integer
         }//end while check integer
         allLetters=categorizeString(i,string);//call method
         }//end else no
         if(allLetters){//print results if boolean true
            System.out.println("The portion of your string analyzed contains only letters"); 
         }
         else{//print results if boolean false
            System.out.println("Your string does not contain only letters.");
         }
    }//end of main method
  public static boolean categorizeString(int i,String string){//method for determining if (portion of string indicated by i)=all letters
            if (i>=string.length()){
                i=string.length();
            }//if integer greater than length, analyze whole length
            char c='q';//declare variables
            boolean boo=true;//boolean is true until proven false
            for(int x=0;x<i;x++){//must start x at 0 b/c strings are indexed starting at 0, not 1
                c=string.charAt(x);//set char c to character in string at position x
                if (!Character.isLetter(c)){//check if character isn't letter
                 boo=false;//if not letter, statement false
                 break;//no need to continue loop
                }//end of if statement
            }//end of for loop
            return boo;
        }//end of categorizeString with integer input
    public static boolean categorizeString(String string){//method for determining if whole string=all letters
        int i=string.length();//set integer to length of string
        return categorizeString(i, string);//access other method
   }//end of categorizeString no integer input
}//end of class