//Christine Gelotte
//hw 11
//November 10 2015
//The purpose of this program is to make an array holding grades and to use binary and linear searches and sorting method
import java.util.Scanner;//import scanner
public class CSE2Linear{
    public static void main(String[] args){
        int[] grades=new int[15];//set length of grades array to 15
        System.out.println("Enter 15 final grades in CSE2");//input message
        for(int x=0;x<15;x++){//for loop for assigning grades to array
            System.out.print("Enter grade:");
            grades[x]=validGrade();//call subroutine that asks user for input, makes sure input isn't a string and is 0<=y<=100
        }//end of for loop for assigning grades to array
        printArray(grades);//call void method that prints array to screen
        System.out.println("Sorted:");
        sortArray(grades);//void method that sorts array
        printArray(grades);//call void method that prints array to screen
        System.out.print("Enter grade to search for:");
        int searchGrade= validGrade();//make sure user input is a valid grade
        binarySearch(grades,searchGrade);//void subroutine that performs binary search and prints results
        scrambleArray(grades);//void method that scrambles array
        System.out.println("Scrambled:");
        printArray(grades);//print scrambled array
        System.out.print("Enter grade to search for:");
        searchGrade= validGrade();//make sure user input is a valid grade
        linearSearch(grades,searchGrade);//perform linear search and print results 
    }//end of main
    public static int validGrade(){
        Scanner myScanner = new Scanner( System.in ); //access Scanner in method
        boolean boo=false;//arbitrary boolean
        int grade=0;//introduce variable
        while (!boo){//continually run loop until given valid input
            if(myScanner.hasNextInt()){//if integer, save into variable
                grade=myScanner.nextInt();
                if(grade>=0&&grade<=100){//if integer greater 0-100, return value
                    break;
                }
                System.out.println("Error! Grade must be between 0-100.");//if not print error
            }
            else{
                System.out.println("Error! Please type an integer.");//if not integer print error, erase previous input
                 myScanner.next();
            }
            System.out.print("Enter grade:");
        }//while loop check for valid input
        return grade;
    }//end of validGrade
    public static void printArray(int[] array){
      for(int i=0;i<array.length;i++){//print out each member of array separated by space
          System.out.print(array[i]);
          System.out.print(" ");
      }//end of loop
      System.out.println("");
  }//end of printArray
  public static void sortArray(int[] array){//sort the values in an array so that they are increasing
  int passBy=0;//integer holding passing value in array
      for(int x=14; x>=1;x--){//outer loop controls upper value
          for(int y=x-1;y>=0;y--){//upper value compared to lower values, swapped if smaller
              if(array[x]<array[y]){
                 passBy=array[x];//value held in temporary variable
                 array[x]=array[y];//swap
                 array[y]=passBy;
              }//end of if statement
          } //end of inner for loop
      }//end of for loop for sorting array
  }//end of sortArray
  public static void binarySearch(int[] array, int val){//use binary search to see if value in set, print results
      int bottom=0;//set bottom of array=0
      int top=14;//set top of array to highest value place
      int counter=0;//set counter to count iterations
      int middle=0;//middle variable declared
      while(bottom<=top){//keep checking until bottom and top are same value 
          middle=(top+bottom)/2;//point to middle of array
          if(array[middle]==val){
              counter++;//increment counter for (final iteration)
              break;//exit loop
          }//end if =
          if(array[middle]>val){
              top=middle-1;//set the ceiling to new position
          }//end if >val
          else{
              bottom=middle+1;//set the floor to new position
          }//end else(<val)
          counter++;//increment counter to show that the loop iterated again
      }//end of while loop for binary search
      if(array[middle]==val){
          System.out.println(val+" was found in "+counter+" iterations.");
      }//end of if true
      else{
          System.out.println(val+" was not found.There were "+counter+" iterations.");
      }//condition not met
  }//end of binary search
  public static void scrambleArray(int[] array){//subroutine that scambles all the values of an array
      int passBy=0;//passBy value holds the swapping term temporarily
      int randomNumber=0;//random number assigned in loop
      for(int x=0; x<200;x++){
          randomNumber=(int)(Math.random()*14)+1;//set random number
          passBy=array[0];//hold array value temporarily
          array[0]=array[randomNumber];//set array[0] to random value in array
          array[randomNumber]=passBy;//set random position to passing term
      }//end of loop
  }//end of scrambleArray
  public static void linearSearch(int[] array, int val){//search for value given by user
      int counter=0;//set counter to zero
      boolean boo=false;
      for(int x=0;x<15;x++){
          if (val==array[x]){
              counter++;
              boo=true;//set boolean to true
              break;//val found
          }//end of if
          counter++;
      }//end of search loop
      if (boo){
          System.out.println(val+" was found in "+counter+" iterations.");
      }
      else{
         System.out.println(val+" was not found.There were "+counter+" iterations.");
      }
  }//end of linear search
}//end of class