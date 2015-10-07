//Testing various code snippets
//import java.util.Scanner; //import scanner
public class Test{
    public static void main(String[] args){
    //Scanner myScanner = new Scanner(System.in);//declare scanner
       boolean forBoo=false;//a boolean that becomes true if a forFactor of counter exists
       for(int forCounter=10;forCounter<101;forCounter++){//sets counter to values 10-100 
          for (forFactor=2;forFactor<forCounter;forFactor++){//sets forFactor to values 2-(forCounter-1)
               if ((forCounter%forFactor)==0){//boolean becomes true if a forFactor of counter exists
                   forBoo=true;
               }
           }//forFactor for loop end
           if(!forBoo){//check if boolean is false
               System.out.print(forCounter+",");//if false, then forCounter is a prime number, print result
           }
           forBoo=false;//reset boolean for next counter value
       }//end of for loop prime numbers
}//end of main method
}//end of class
