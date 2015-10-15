//Testing various code snippets
import java.util.Scanner; //import scanner
public class Test{
    public static void main(String[] args){
        int height=0;
        boolean mustInt=false;//arbitrary boolean for while loop
    Scanner myscanner = new Scanner(System.in);//declare scanner
       while(!mustInt){
            System.out.print("Please enter the height:");
            if(myscanner.hasNextInt()){
                height=myscanner.nextInt();
                if(height<51&&height>0){
                    break;
                }
                System.out.println("Error: Must enter integer >0 and <= 50");
            }
            else{
            System.out.println("Error: Must enter integer >0 and <= 50");
            myscanner.next();
            }
        }//end of height while loop
}//end of main method
}//end of class
