//Christine Gelotte
//Lab 10
//10-30-2015
//The purpose of this program is to ask user for input --strings(names)--and to generate grades 
import java.util.Scanner; //import scanner
public class Grade{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//declare scanner
        int studentNumber = (int)(Math.random()*5)+5;
        String studentName[]=new String[studentNumber];
        System.out.println("Enter "+studentNumber+" student names:");
        for(int x=0;x<studentNumber;x++){
            System.out.print("Enter name:");
            studentName[x]=myScanner.nextLine();
        }
        int grade=0;
        System.out.println("Here are the midterm grades of the 5 students above:");
        for(int x=0;x<studentNumber;x++){
            System.out.print(studentName[x]+":");
            grade=(int)(Math.random()*100);
            System.out.println(grade);
        }
    }//end of main method
}//end of class
