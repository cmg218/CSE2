//Christine Gelotte
//Homework 6 -- Bar Graph
//10-5-2015
//The purpose of this program is to record the amount of money spent over
//the course of the week and produce a bar graph 
import java.util.Scanner;
public class BarGraph{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//declare scanner
        //declare variables
        String day = "";//each day of the week
        double accumulator = 0;//accumulates the amount of money spent over the course of a week
        String moneyString =""; //if user enters a string
        boolean moneyBoo = true;//boolean for a while loop 
        double money = 0;//amount of money spent each day
        int moneyCounter =0;//counts money (# of * for bar graph)
        int s1=0;//stores the money count for each specific day for bar graph
        int s2=0;
        int s3=0;
        int s4=0;
        int s5=0;
        int s6=0;
        int s7=0;
        for(int counter=1; counter<8; counter++){// for loop for each individual day
            switch(counter){//assign a day value
                case 1: 
                    day="Monday";
                    break;
                case 2:
                    day="Tuesday";
                    break;
                case 3:
                    day="Wednesday";
                    break;
                case 4:
                    day="Thursday";
                    break;
                case 5:
                    day="Friday";
                    break;
                case 6:
                    day="Saturday";
                    break;
                case 7:
                    day="Sunday";
                    break;
            }//end of switch day assignment
            while(moneyBoo==true){//this while loop checks to make sure input is valid, boolean is abitrary condition(I break out of loop with a break)
                System.out.print("Expenses for "+day+": $");//print out initial statement
                moneyString = myScanner.nextLine();//save user input as a string
                try{//try to change the input to a double value
                    money = Double.parseDouble(moneyString);
                    if(money>=0){//if the double value is greater or = to 0, then input is valid as money
                        break;//break out of while loop checker
                    }//end of if statement
                    else{//repeat while loop, input invalid
                        System.out.println("This is not valid. Please enter positive double value in form xx.xx");
                    }//end of else statement
                }//end of try
                catch(NumberFormatException emoney){//user gave a string, a string is not valid input, repeat loop
                    System.out.println("This is not valid. Please enter positive double value in form xx.xx");
                }//end of catch
            }//end of while
           accumulator = accumulator + money; //accumulate the amount of money spent each day
           moneyCounter = (int)money; //convert money to integer for money count
           money = money - moneyCounter -.5;//change money variable to prepare to check a condition (is the change greater than 50c?)
           if (money>=0){//if money=0 or positive, then the change is >=50C so its necessary to round up moneyCounter
               moneyCounter++;
           }//end of if statement
          switch(counter){//assign the specific # of stars for each day (bar graph)
                case 1: 
                    s1=moneyCounter;
                    break;
                case 2:
                    s2=moneyCounter;
                    break;
                case 3:
                    s3=moneyCounter;
                    break;
                case 4:
                    s4=moneyCounter;
                    break;
                case 5:
                    s5=moneyCounter;
                    break;
                case 6:
                    s6=moneyCounter;
                    break;
                case 7:
                   s7=moneyCounter;
                    break;
            }//end of switch star count
        }//end of for loop(each day)
        //print results
        //create a bar graph
        System.out.println("----------------------");//nice formatting break
        System.out.print("Mon:");
        for(int x=1;x<=s1;x++){//for loop to print stars for number of dollars(rounded up)
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Tues:");
        for(int x=1;x<=s2;x++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Wed:");
        for(int x=1;x<=s3;x++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Thurs:");
        for(int x=1;x<=s4;x++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Fri:");
        for(int x=1;x<=s5;x++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Sat:");
        for(int x=1;x<=s6;x++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("Sun:");
        for(int x=1;x<=s7;x++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("----------------------");
        //find and print average daily expenses
        double avgWeek = accumulator/7;
        System.out.printf("Your average daily expenses are:$"+"%.2f",avgWeek);
        System.out.println("");
        //estimated expenditure for 4 years -- fluxuating -20%/20%
        accumulator=0;//reset accumulator
        int randomNumber=0;//intoduce a vvariable to represent random number
        double percent = 0;//percent fluctuation
        for (int x=0;x<208;x++){//for loop accumulating amount spent over the course of a 4 years assuming fluxuation
            randomNumber = (int)(Math.random()*40); //assign a random number between values 0 and 40
            percent = (randomNumber-20)/100.0;//subtract 20 from random number(must be in range -20%/20%) and make decimal val
            accumulator=accumulator+avgWeek*(1+percent);//accumulate the amount of money for each week
        }//end of expenditure loop
        //print results
        System.out.printf("Estimated Expenditure for 4 years:$"+ "%.2f",accumulator);
        System.out.println("");
    }//end of main method
}//end of class