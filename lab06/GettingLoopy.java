//Christine Gelotte
//Lab 06
//10/2/15
//purpose of this lab is to make loops
public class GettingLoopy{
    public static void main(String[] args){
        int counter1= 0;
        int seven=0;
        //first loop -- print out numbers 1-6
       while (counter1<7) {
           counter1++;
           System.out.print(counter1);
       }//end print numbers 1-6
       //print 7 7's after first 6 numbers
       while(seven<6){
           seven ++;
           System.out.print("7");
       }//end print 7 sevens
       System.out.println("");
       //print out all prime numbers between 10-100
      System.out.print("While loop:");
       int whileCounter=10;//new counter set at 10
       int whileFactor = 2;//whileFactor (another counter) set at 2
       boolean whileBoo=false;//a boolean that becomes true if a whileFactor of counter exists
       while(whileCounter<101){//sets counter to values 10-100 
           while (whileFactor<whileCounter){//sets whileFactor to values 2-(whileCounter-1)
               if ((whileCounter%whileFactor)==0){//boolean becomes true if a whileFactor of counter exists
                   whileBoo=true;
               }
               whileFactor++;
           }//whileFactor while loop end
           if(!whileBoo){//check if boolean is false
               System.out.print(whileCounter+",");//if false, then whileCounter is a prime number, print result
           }
           whileCounter++;
           whileBoo=false;//reset boolean for next counter value
           whileFactor=2;//reset whileFactor for next counter value
       }//end of while loop prime numbers
       System.out.println("");
       System.out.print("Do While loop:");
         //print out all prime numbers between 10-100 with do while loop
       int doCounter=10;//new counter set at 10
       int doFactor = 2;//doFactor (another counter) set at 2
       boolean doBoo=false;//a boolean that becomes true if a doFactor of counter exists
       do{//sets counter to values 10-100 
            while (doFactor<doCounter){//sets doFactor to values 2-(doCounter-1)
               if ((doCounter%doFactor)==0){//boolean becomes true if a doFactor of counter exists
                   doBoo=true;
               }
               doFactor++;
           }//doFactor while loop end
           if(!doBoo){//check if boolean is false
               System.out.print(doCounter+",");//if false, then doCounter is a prime number, print result
           }
           doCounter++;
           doBoo=false;//reset boolean for next counter value
           doFactor=2;//reset doFactor for next counter value
       }while(doCounter<101);//end of do while loop prime numbers
        System.out.println("");
         //print out all prime numbers between 10-100 with for loop
        System.out.print("For loop:");
        boolean forBoo=false;//a boolean that becomes true if a forFactor of counter exists
        for(int forCounter=10;forCounter<101;forCounter++){//sets counter to values 10-100 
          for (int forFactor=2;forFactor<forCounter;forFactor++){//sets forFactor to values 2-(forCounter-1)
               if ((forCounter%forFactor)==0){//boolean becomes true if a forFactor of counter exists
                   forBoo=true;
               }
           }//forFactor for loop end
           if(!forBoo){//check if boolean is false
               System.out.print(forCounter+",");//if false, then forCounter is a prime number, print result
           }
           forBoo=false;//reset boolean for next counter value
       }//end of for loop prime numbers
        System.out.println("");
        //print out random school of fish eating worms and swimming in rectangle formation
        int randomNumber = (int)(Math.random()*20)+1; //assign a random number between values 1 to 20
        for(int fish=0;fish<randomNumber;fish++){
            System.out.print("~<><");
        }//end of for loop fish eating worms
        System.out.println("");
        for(int fish=0;fish<randomNumber;fish++){
            System.out.print("~<><");
        }//end of for loop more fish eating worms
        System.out.println("");
        for(int fish=0;fish<randomNumber;fish++){
            System.out.print("~<><");
        }//end of for loop even more fish eating worms
        System.out.println("");
    }//end of main method
}//end of class