//Christine Gelotte
//September 14 2015
//Homework 3, part 2
//The purpose of this program is to calculate volume and surface area of a block given dimensions

import java.util.Scanner; //import scanner
public class Block{
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);//declare scanner
        System.out.print("Enter the length of the block: "); //ask user for length 
        double length = myScanner.nextDouble();//record input as double
        System.out.print("Enter the width of the block: ");//ask user for width
        double width = myScanner.nextDouble();//record input as double
        System.out.print("Enter the height of the block: ");//ask user for height
        double height = myScanner.nextDouble();//record input as double
        //calculate volume of the block
        double volume = length*width*height;
        //calculate surface area of the block
        double surfaceArea;
        surfaceArea = 2*length*width+2*length*height+2*width*height;
        // print output volume and surface area to user
        System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume+".");
        System.out.println("The surface area of the block is "+surfaceArea+".");
    }//end of main
}//end of class