//Christine Gelotte
//Homework 8-Area
//10-16-2015
//This program reads user input and produces the area of one of three shapes indicated by user
import java.util.Scanner;//import scanner
public class Area{//class
    public static void main(String[] args){//main method
    Scanner myScanner = new Scanner(System.in);//declare scanner
    //declare variables for main method
        boolean notShape=false;//arbitrary shape boolean
        String shape="";
        double area=0;
        while(!notShape){//loop for user input (type of shape)
            System.out.print("Please enter a shape(triangle, circle, or rectangle) all lowercase:");
            shape=myScanner.nextLine(); //store string value
            if(shape.equals("triangle")){//is input triangle?
                break;//exit while loop
            }//end triangle
            if(shape.equals("circle")){//circle?
                break;//exit loop
            }//end circle
            if(shape.equals("rectangle")){//rectangle?
                break;//exit loop
            }//end rectangle
            System.out.println("Error! Enter valid input.");//error message
        }//end of loop to check if input is a valid shape
         if(shape.equals("triangle")){//go to triangle method
             area=areaTriangle();
         }
        if(shape.equals("circle")){//go to circle method
            area=areaCircle();
         }
        if(shape.equals("rectangle")){//go to rectangle method
            area=areaRectangle();
         }
         System.out.println("The area of the "+shape+" is "+area);
    }//end of main method
    public static double areaTriangle(){//area of triangle method
        System.out.print("Please enter the height:");
        double height= inputDimension();//recieve user input for dimensions
        System.out.print("Please enter the base:");
        double base= inputDimension();
        return base*height/2;//calculate area, return result
    }//end of triangle method
    public static double areaCircle(){//area of circle
        System.out.print("Please enter the radius:");//ask for user input
        double radius=inputDimension();
        return radius*radius*3.14;
    }//end of circle method
    public static double areaRectangle(){//area of rectangle
        System.out.print("Please enter the length:");//ask for user input
        double length=inputDimension();
        System.out.print("Please enter the width:");
        double width=inputDimension();
        return length*width;
    }//end of rectangle method
    public static double inputDimension(){//method for checking if input is valid
        Scanner myScanner = new Scanner(System.in);//declare scanner
        boolean mustDouble=false;//arbitrary boolean 
        double dimension=0;
        while(!mustDouble){//check for valid input loop
            if(myScanner.hasNextDouble()){//make sure dimension is a double
               dimension= myScanner.nextDouble();//save value
               if(dimension>=0){
                  break;
               }//make sure dimension is positive
               System.out.println("Error! Invalid input.");
                System.out.print("Please enter a positive value for your dimension:");
            }//end of double check
            else{//condition not met
                System.out.println("Error! Invalid input.");
                System.out.print("Please enter a double value for your dimension:");
                myScanner.next();
            }//end else
        }//end of while loop to check for valid input
        return dimension;//exit method with valid input
    }//end of method for getting dimensions
}//end of class