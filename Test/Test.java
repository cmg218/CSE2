//Testing various code snippets
import java.util.Scanner; //import scanner
public class Test{
    public static void main(String[] args){
    //Scanner myScanner = new Scanner(System.in);//declare scanner
    int val=validGrade();
    System.out.println(val);
    }//end of main
     public static int validGrade(){
        Scanner myScanner = new Scanner( System.in ); //access Scanner in method
        boolean boo=false;
        int grade=0;
        while (!boo){
            if(myScanner.hasNextInt()){
                grade=myScanner.nextInt();
                if(grade>=0&&grade<=100){
                    break;
                }
                System.out.println("Error! Grade must be between 0-100.");
            }
            else{
                System.out.println("Error! Please type an integer.");
                 myScanner.next();
            }
            System.out.print("Enter Grade:");
        }//while loop check for valid input
        return grade;
    }//end of validGrade
}//end of class
