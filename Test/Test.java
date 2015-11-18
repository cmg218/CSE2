//Testing various code snippets
//import java.util.Scanner; //import scanner
public class Test{
    public static void main(String[] args){
    //Scanner myScanner = new Scanner(System.in);//declare scanner
    int height = 30;
    int width = 6;
     int [][] matrix= randomMatrix(height,width);//makes a random matrix
     printMatrix(matrix);
    }//end of main
     public static int [][] randomMatrix(int height,int width){
         int [][] matrix = new int[height][];
         int k=0;
         for(int i=0;i<height;i++){
             k++;
             matrix[i]= new int[k];
             for(int j=0; j<k;j++){
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
}//end of class
