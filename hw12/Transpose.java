//Christine Gelotte
//homework 12
//The purpose of this program is to transpose a matrix
 import java.util.Scanner; //import scanner
public class Transpose{
    public static void main(String args[]){
       System.out.print("Enter width:");
       int width= validInput();//method for checking for valid input
       System.out.print("Enter height:");
       int height = validInput();//method valid input
       int [][] matrix= randomMatrix(height,width);//makes a random matrix
       printMatrix(matrix);
       matrix= transposeMatrix(matrix);
       System.out.println("Transposed:");
       printMatrix(matrix);
    }//end of main program
    public static int validInput(){//method for checking if input is valid
        Scanner myScanner = new Scanner(System.in);//declare scanner
        boolean mustInt=false;//arbitrary boolean 
        int dimension=0;
        while(!mustInt){//check for valid input loop
            if(myScanner.hasNextInt()){//make sure dimension is an Int
               dimension= myScanner.nextInt();//save value
               if(dimension>=0&&dimension<=20){
                  break;
               }//make sure dimension is positive
               System.out.println("Error! Invalid input.");
                System.out.print("Please enter a positive integer <=20 for your dimension:");
            }//end of double check
            else{//condition not met
                System.out.println("Error! Invalid input.");
                System.out.print("Please enter a positive integer <=20 for your dimension:");
                myScanner.next();
            }//end else
        }//end of while loop to check for valid input
        return dimension;//exit method with valid input
    }//end of method for getting dimensions
    public static int [][] randomMatrix(int height,int width){
         int [][] matrix = new int[height][width];
         for(int i=0;i<height;i++){
             for(int j=0; j<width;j++){
                 matrix[i][j]=(int)(Math.random()*21)-10;//set matrix coordinate to value between -10 and 10
             }//end of interior loop(assign width portion of coordinate)
         }//end of exterior loop(assign height portion of coordinate)
         return matrix;
     }//end of random Matrix
     public static void printMatrix(int [][] matrix){
         int width=matrix[0].length;//assign width to of first array in matrix,
         for (int i=0; i<matrix.length;i++){
             if (!(matrix[i].length==width)){
                 System.out.println("Warning! This is not a rectangular matrix.");//if not rectangular print error
                 break;
             }//if not rectangular
         }//for check rectangular
         for(int i=0; i<matrix.length;i++){
             System.out.print("|");//start printing line
             for(int j=0; j<matrix[i].length;j++){
                 if(matrix[i][j]>=0){
                     System.out.print(" ");//print a space to even matrix if non negative
                 }
                 if(!(matrix[i][j]==-10||matrix[i][j]==10)){//if not a 2 digit number print space
                     System.out.print(" ");
                 }
                 System.out.print(matrix[i][j]);
                 if(j==(matrix[i].length-1)){//don't print a comma if at end of line
                     break;
                 }
                 System.out.print(",");//print comma
             }//end of interior for loop
             System.out.println("|");//end line
         }//end of exterior for loop
     }//end of print matrix
     public static int[][] transposeMatrix(int[][] matrix){
         //rearrange the arrays so that they are in mirrored postions
         int[][] transpose=new int[matrix[0].length][matrix.length];
         for(int i=0;i<transpose.length;i++){//swap values
             for(int j=0;j<transpose[i].length;j++){
                 transpose[i][j]=matrix[j][i];
             }
         }
         return transpose;
     }//end of transpose matrix
}//end of class