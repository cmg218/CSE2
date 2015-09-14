//Christine Gelotte
//September 14, 2015
//Homework 3, part 1
//The purpose of this program is to calculate the amount of time remaining before dinner

import java.util.Scanner;
public class Timer{
    public static void main(String[]args){
      Scanner myScanner = new Scanner(System.in);//declare scanner
      System.out.print("Enter current time in military time in this format (HHMM):");//ask user for current time
      int currentTime = myScanner.nextInt();//record user input 
      System.out.print("Enter time you plan on eating dinner in military time in this format (HHMM):");//ask user for dinner time
      int dinnerTime = myScanner.nextInt();//record user input
      //calculate the time left before dinner
      int timeLeft = dinnerTime - currentTime;
      // convert time left into two separate values
      int timeHours = (int)(timeLeft/100); //make use of conversion to integer to get rid of extra digits
      int timeMinutes = timeLeft-(timeHours*100); //find minutes left
      System.out.println("You have "+timeHours+" hours and "+timeMinutes+" minutes left until dinner.");
      }//end of main method
}//end of class