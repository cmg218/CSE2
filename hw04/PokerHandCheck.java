//Christine Gelotte
//September 18,2015
//homework 4
//The purpose of this program is to generate a poker hand (5 random cards), assign values to all of the cards, look for matching card values
import java.util.Scanner; //import scanner
public class PokerHandCheck{
    public static void main(String[] args){
        //assign variable names
        String cardValue1 = "";
        String cardValue2 = "";
        String cardValue3 = "";
        String cardValue4 = "";
        String cardValue5 = "";
        String suit1="";
        String suit2="";
        String suit3="";
        String suit4="";
        String suit5="";
        int tempNumber1=0;
        int tempNumber2=0;
        int tempNumber3=0;
        int tempNumber4=0;
        int tempNumber5=0;
        //assign suit and value to card 1
       int randomNumber1 = (int)(Math.random()*52)+1; //assign a random number between values 1 to 52 
       if (randomNumber1 <= 13){ //check if suit is diamonds
            suit1 = "Diamonds";  //assign suit 
            tempNumber1=randomNumber1;//convert random number to value 1-13
            switch (tempNumber1){//assign card value
                case 1: 
                    cardValue1 = "Ace";
                    break;
                case 11:
                    cardValue1 = "Jack";
                    break;
                case 12:
                    cardValue1 = "Queen";
                    break;
                case 13:
                    cardValue1 = "King";
                    break;
                default:
                    cardValue1 = ""+tempNumber1;
                    break;
            }//end of card value assignment
       }//end of check diamond
       else if(randomNumber1 <= 26){//check if suit is clubs
           suit1 = "Clubs";//assign suit
           tempNumber1=randomNumber1 - 13;//convert random number to value 1-13
            switch (tempNumber1){//assign card value
                case 1: 
                    cardValue1 = "Ace";
                    break;
                case 11:
                    cardValue1 = "Jack";
                    break;
                case 12:
                    cardValue1 = "Queen";
                    break;
                case 13:
                    cardValue1 = "King";
                    break;
                default:
                    cardValue1 = ""+ tempNumber1;
                    break;
            }//end of card value assignment
       }//end of check club
       else if(randomNumber1 <= 39){//check if suit is hearts
           suit1 = "Hearts";//assign suit
           tempNumber1=randomNumber1 - 26;//convert random number to value 1-13
            switch (tempNumber1){//assign card value
                case 1: 
                    cardValue1 = "Ace";
                    break;
                case 11:
                    cardValue1 = "Jack";
                    break;
                case 12:
                    cardValue1 = "Queen";
                    break;
                case 13:
                    cardValue1 = "King";
                    break;
                default:
                    cardValue1 = ""+ tempNumber1;
                    break;
            }//end of card value assignment
       }//end of check hearts
       else if(randomNumber1 <= 52){//check if suit is spades
           suit1 = "Spades";//assign suit
           tempNumber1=randomNumber1 - 39;//convert random number to value 1-13
            switch (tempNumber1){//assign card value
                case 1: 
                    cardValue1 = "Ace";
                    break;
                case 11:
                    cardValue1 = "Jack";
                    break;
                case 12:
                    cardValue1 = "Queen";
                    break;
                case 13:
                    cardValue1 = "King";
                    break;
                default:
                    cardValue1 = "" +tempNumber1;
                    break;
            }//end of card value assignment 
       }//end of check spades
       //assign suit and value to card 2
       int randomNumber2 = (int)(Math.random()*52)+1; //assign a random number between values 1 to 52 
       if (randomNumber2 <= 13){ //check if suit is diamonds
            suit2 = "Diamonds";  //assign suit 
            tempNumber2=randomNumber2;//convert random number to value 1-13
            switch (tempNumber2){//assign card value
                case 1: 
                    cardValue2 = "Ace";
                    break;
                case 11:
                    cardValue2 = "Jack";
                    break;
                case 12:
                    cardValue2 = "Queen";
                    break;
                case 13:
                    cardValue2 = "King";
                    break;
                default:
                    cardValue2 = ""+tempNumber2;
                    break;
            }//end of card value assignment
       }//end of check diamond
       else if(randomNumber2 <= 26){//check if suit is clubs
           suit2 = "Clubs";//assign suit
           tempNumber2=randomNumber2 - 13;//convert random number to value 1-13
            switch (tempNumber2){//assign card value
                case 1: 
                    cardValue2 = "Ace";
                    break;
                case 11:
                    cardValue2 = "Jack";
                    break;
                case 12:
                    cardValue2 = "Queen";
                    break;
                case 13:
                    cardValue2 = "King";
                    break;
                default:
                    cardValue2 = ""+ tempNumber2;
                    break;
            }//end of card value assignment
       }//end of check club
       else if(randomNumber2 <= 39){//check if suit is hearts
           suit2 = "Hearts";//assign suit
           tempNumber2=randomNumber2 - 26;//convert random number to value 1-13
            switch (tempNumber2){//assign card value
                case 1: 
                    cardValue2 = "Ace";
                    break;
                case 11:
                    cardValue2 = "Jack";
                    break;
                case 12:
                    cardValue2 = "Queen";
                    break;
                case 13:
                    cardValue2 = "King";
                    break;
                default:
                    cardValue2 = ""+ tempNumber2;
                    break;
            }//end of card value assignment
       }//end of check hearts
       else if(randomNumber2 <= 52){//check if suit is spades
           suit2 = "Spades";//assign suit
           tempNumber2=randomNumber2 - 39;//convert random number to value 1-13
            switch (tempNumber2){//assign card value
                case 1: 
                    cardValue2 = "Ace";
                    break;
                case 11:
                    cardValue2 = "Jack";
                    break;
                case 12:
                    cardValue2 = "Queen";
                    break;
                case 13:
                    cardValue2 = "King";
                    break;
                default:
                    cardValue2 = "" +tempNumber2;
                    break;
            }//end of card value assignment 
       }//end of check spades
        //assign suit and value to card 3
       int randomNumber3 = (int)(Math.random()*52)+1; //assign a random number between values 1 to 52 
       if (randomNumber3 <= 13){ //check if suit is diamonds
            suit3 = "Diamonds";  //assign suit 
            tempNumber3=randomNumber3;//convert random number to value 1-13
            switch (tempNumber3){//assign card value
                case 1: 
                    cardValue3 = "Ace";
                    break;
                case 11:
                    cardValue3 = "Jack";
                    break;
                case 12:
                    cardValue3 = "Queen";
                    break;
                case 13:
                    cardValue3 = "King";
                    break;
                default:
                    cardValue3 = ""+tempNumber3;
                    break;
            }//end of card value assignment
       }//end of check diamond
       else if(randomNumber3 <= 26){//check if suit is clubs
           suit3 = "Clubs";//assign suit
           tempNumber3=randomNumber3 - 13;//convert random number to value 1-13
            switch (tempNumber3){//assign card value
                case 1: 
                    cardValue3 = "Ace";
                    break;
                case 11:
                    cardValue3 = "Jack";
                    break;
                case 12:
                    cardValue3 = "Queen";
                    break;
                case 13:
                    cardValue3 = "King";
                    break;
                default:
                    cardValue3 = ""+ tempNumber3;
                    break;
            }//end of card value assignment
       }//end of check club
       else if(randomNumber3 <= 39){//check if suit is hearts
           suit3 = "Hearts";//assign suit
           tempNumber3=randomNumber3 - 26;//convert random number to value 1-13
            switch (tempNumber3){//assign card value
                case 1: 
                    cardValue3 = "Ace";
                    break;
                case 11:
                    cardValue3 = "Jack";
                    break;
                case 12:
                    cardValue3 = "Queen";
                    break;
                case 13:
                    cardValue3 = "King";
                    break;
                default:
                    cardValue3 = ""+ tempNumber3;
                    break;
            }//end of card value assignment
       }//end of check hearts
       else if(randomNumber3 <= 52){//check if suit is spades
           suit3 = "Spades";//assign suit
           tempNumber3=randomNumber3 - 39;//convert random number to value 1-13
            switch (tempNumber3){//assign card value
                case 1: 
                    cardValue3 = "Ace";
                    break;
                case 11:
                    cardValue3 = "Jack";
                    break;
                case 12:
                    cardValue3 = "Queen";
                    break;
                case 13:
                    cardValue3 = "King";
                    break;
                default:
                    cardValue3 = "" +tempNumber3;
                    break;
            }//end of card value assignment 
       }//end of check spades
        //assign suit and value to card 4
       int randomNumber4 = (int)(Math.random()*52)+1; //assign a random number between values 1 to 52 
       if (randomNumber4 <= 13){ //check if suit is diamonds
            suit4 = "Diamonds";  //assign suit 
            tempNumber4=randomNumber4;//convert random number to value 1-13
            switch (tempNumber4){//assign card value
                case 1: 
                    cardValue4 = "Ace";
                    break;
                case 11:
                    cardValue4 = "Jack";
                    break;
                case 12:
                    cardValue4 = "Queen";
                    break;
                case 13:
                    cardValue4 = "King";
                    break;
                default:
                    cardValue4 = ""+tempNumber4;
                    break;
            }//end of card value assignment
       }//end of check diamond
       else if(randomNumber4 <= 26){//check if suit is clubs
           suit4 = "Clubs";//assign suit
           tempNumber4=randomNumber4 - 13;//convert random number to value 1-13
            switch (tempNumber4){//assign card value
                case 1: 
                    cardValue4 = "Ace";
                    break;
                case 11:
                    cardValue4 = "Jack";
                    break;
                case 12:
                    cardValue4 = "Queen";
                    break;
                case 13:
                    cardValue4 = "King";
                    break;
                default:
                    cardValue4 = ""+ tempNumber4;
                    break;
            }//end of card value assignment
       }//end of check club
       else if(randomNumber4 <= 39){//check if suit is hearts
           suit4 = "Hearts";//assign suit
           tempNumber4=randomNumber4 - 26;//convert random number to value 1-13
            switch (tempNumber4){//assign card value
                case 1: 
                    cardValue4 = "Ace";
                    break;
                case 11:
                    cardValue4 = "Jack";
                    break;
                case 12:
                    cardValue4 = "Queen";
                    break;
                case 13:
                    cardValue4 = "King";
                    break;
                default:
                    cardValue4 = ""+ tempNumber4;
                    break;
            }//end of card value assignment
       }//end of check hearts
       else if(randomNumber4 <= 52){//check if suit is spades
           suit4 = "Spades";//assign suit
           tempNumber4=randomNumber4 - 39;//convert random number to value 1-13
            switch (tempNumber4){//assign card value
                case 1: 
                    cardValue4 = "Ace";
                    break;
                case 11:
                    cardValue4 = "Jack";
                    break;
                case 12:
                    cardValue4 = "Queen";
                    break;
                case 13:
                    cardValue4 = "King";
                    break;
                default:
                    cardValue4 = "" +tempNumber4;
                    break;
            }//end of card value assignment 
       }//end of check spades
       //assign suit and value to card 5
       int randomNumber5 = (int)(Math.random()*52)+1; //assign a random number between values 1 to 52 
       if (randomNumber5 <= 13){ //check if suit is diamonds
            suit5 = "Diamonds";  //assign suit 
            tempNumber5=randomNumber5;//convert random number to value 1-13
            switch (tempNumber5){//assign card value
                case 1: 
                    cardValue5 = "Ace";
                    break;
                case 11:
                    cardValue5 = "Jack";
                    break;
                case 12:
                    cardValue5 = "Queen";
                    break;
                case 13:
                    cardValue5 = "King";
                    break;
                default:
                    cardValue5 = ""+tempNumber5;
                    break;
            }//end of card value assignment
       }//end of check diamond
       else if(randomNumber5 <= 26){//check if suit is clubs
           suit5 = "Clubs";//assign suit
           tempNumber5=randomNumber5 - 13;//convert random number to value 1-13
            switch (tempNumber5){//assign card value
                case 1: 
                    cardValue5 = "Ace";
                    break;
                case 11:
                    cardValue5 = "Jack";
                    break;
                case 12:
                    cardValue5 = "Queen";
                    break;
                case 13:
                    cardValue5 = "King";
                    break;
                default:
                    cardValue5 = ""+ tempNumber5;
                    break;
            }//end of card value assignment
       }//end of check club
       else if(randomNumber5 <= 39){//check if suit is hearts
           suit5 = "Hearts";//assign suit
           tempNumber5=randomNumber5 - 26;//convert random number to value 1-13
            switch (tempNumber5){//assign card value
                case 1: 
                    cardValue5 = "Ace";
                    break;
                case 11:
                    cardValue5 = "Jack";
                    break;
                case 12:
                    cardValue5 = "Queen";
                    break;
                case 13:
                    cardValue5 = "King";
                    break;
                default:
                    cardValue5 = ""+ tempNumber5;
                    break;
            }//end of card value assignment
       }//end of check hearts
       else if(randomNumber5 <= 52){//check if suit is spades
           suit5 = "Spades";//assign suit
           tempNumber5=randomNumber5 - 39;//convert random number to value 1-13
            switch (tempNumber5){//assign card value
                case 1: 
                    cardValue5 = "Ace";
                    break;
                case 11:
                    cardValue5 = "Jack";
                    break;
                case 12:
                    cardValue5 = "Queen";
                    break;
                case 13:
                    cardValue5 = "King";
                    break;
                default:
                    cardValue5 = "" +tempNumber5;
                    break;
            }//end of card value assignment 
       }//end of check spades
       // all of the values and suits have been assigned to all of the cards
       //print out results of card suits and values
       System.out.println("You picked the "+cardValue1+" of "+suit1+".");
       System.out.println("You picked the "+cardValue2+" of "+suit2+".");
       System.out.println("You picked the "+cardValue3+" of "+suit3+".");
       System.out.println("You picked the "+cardValue4+" of "+suit4+".");
       System.out.println("You picked the "+cardValue5+" of "+suit5+".");
//Scanner myScanner = new Scanner(System.in);//declare scanner
   // System.out.print("give me value1:");
   //   tempNumber1=myScanner.nextInt();
  //  System.out.print("give me value2:");
   //   tempNumber2=myScanner.nextInt();
    //  System.out.print("give me value3:");
   //  tempNumber3=myScanner.nextInt();
   //   System.out.print("give me value4:");
     //tempNumber4=myScanner.nextInt();
     //System.out.print("give me value5:");
     //tempNumber5=myScanner.nextInt();
    //I set up boolean true false values using the tempnumber because those are all between 1-13
    boolean t12 = (tempNumber1==tempNumber2);
    boolean t13 = (tempNumber1==tempNumber3);
    boolean t14 = (tempNumber1==tempNumber4);
    boolean t15 = (tempNumber1==tempNumber5);
    boolean t23 = (tempNumber2==tempNumber3);
    boolean t24 = (tempNumber2==tempNumber4);
    boolean t25 = (tempNumber2==tempNumber5);
    boolean t34 = (tempNumber3==tempNumber4);
    boolean t35 = (tempNumber3==tempNumber5);
    boolean t45 = (tempNumber4==tempNumber5);
    boolean stop = false;// to prevent repeat statements in my "two pair" section
    //I introduced a new boolean "stop"
    // if it becomes true, then the "two pairs statement will not activate"
  //do all cards match?
  //I checked if all the cards match
    if (t12==t23&&t23==t34&&t34==t45&&t12==true){
        System.out.println("5 of a kind!");
        stop = true;
    }//end do all cards match?
    //do 4/5 cards match?
    //I checked if four cards match and one doesn't match the others
    if (t23==t34&&t34==t45&&t23==true&&t12==false||t13==t34&&t34==t45&&t13==true&&t12==false){
        System.out.println("4 of a kind!");
        stop = true;
    }
    if (t12==t24&&t24==t45&&t12==true&&t13==false||t12==t23&&t23==t35&&t12==true&&t45==false||t12==t23&&t23==t34&&t12==true&&t45==false){
        System.out.println("4 of a kind!");
        stop = true;
    }//end of 4/5 cards match
    //do 3/5 cards match?
    //I checked in each condition whether three cards matched and if one of those three cards didn't match one of the other two
    //I nested another if statement within each if statement to check if the pair that didn't match the three matched each other
    if (t34==true&&t45==true&&t13==false||t24==true&&t45==true&&t12==false){
        System.out.println("3 of a kind!");
        stop = true;
         if (t34==true&&t45==true&&t12==true||t24==true&&t45==true&&t13==true){
             System.out.println("And a pair!");
              stop = true;
         }
    }
    if (t23==true&&t35==true&&t12==false||t23==true&&t34==true&&t12==false){
        System.out.println("3 of a kind!");
        stop = true;
        if (t23==true&&t35==true&&t14==true||t23==true&&t34==true&&t15==true){
             System.out.println("And a pair!");
              stop = true;
        }
    }
    if (t14==true&&t45==true&&t12==false||t13==true&&t35==true&&t12==false){
        System.out.println("3 of a kind!");
        stop = true;
        if (t14==true&&t45==true&&t23==true||t13==true&&t35==true&&t24==true){
            System.out.println("And a pair!");
             stop = true;
        }
    }
    if (t13==true&&t34==true&&t12==false||t12==true&&t25==true&&t13==false){
        System.out.println("3 of a kind!");
        stop = true;
        if (t13==true&&t34==true&&t25==true||t12==true&&t25==true&&t34==true){
             System.out.println("And a pair!");
              stop = true;
        }
    }
    if (t12==true&&t24==true&&t13==false||t12==true&&t23==true&&t14==false){
        System.out.println("3 of a kind!");
        stop = true;
        if (t12==true&&t24==true&&t35==true||t12==true&&t23==true&&t45==true){
            System.out.println("And a pair!");
        }
    }//end of 3/5 cards match
    //any single pairs?
    //For every if statement, I set all booleans to false except for one. there are ten total for each boolean pair
    if(t12==true&&t13==false&&t14==false&&t15==false&&t23==false&&t24==false&&t25==false&&t34==false&&t35==false&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==true&&t14==false&&t15==false&&t23==false&&t24==false&&t25==false&&t34==false&&t35==false&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==false&&t14==true&&t15==false&&t23==false&&t24==false&&t25==false&&t34==false&&t35==false&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==false&&t14==false&&t15==true&&t23==false&&t24==false&&t25==false&&t34==false&&t35==false&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==false&&t14==false&&t15==false&&t23==true&&t24==false&&t25==false&&t34==false&&t35==false&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==false&&t14==false&&t15==false&&t23==false&&t24==true&&t25==false&&t34==false&&t35==false&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==false&&t14==false&&t15==false&&t23==false&&t24==false&&t25==true&&t34==false&&t35==false&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==false&&t14==false&&t15==false&&t23==false&&t24==false&&t25==false&&t34==true&&t35==false&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==false&&t14==false&&t15==false&&t23==false&&t24==false&&t25==false&&t34==false&&t35==true&&t45==false){
        System.out.println("A pair!");
    }
    if(t12==false&&t13==false&&t14==false&&t15==false&&t23==false&&t24==false&&t25==false&&t34==false&&t35==false&&t45==true){
        System.out.println("A pair!");
    }
    // Check if there are two pairs
//I check if a t boolean is true and then if others (not same two numbers) are also true
// to prevent repeat statements, I introduced a new boolean "stop" -- it is declared with other booleans and takes affect throughout if statements
//the stop boolean is false until certain statements are activated, when true it stops these statements from being activated
if(!stop&&t12){
    if(t34||t35||t45){
        stop = true;
       System.out.println("Two Pairs!"); 
    }
}
if(!stop&&t13){
    if(t24||t25||t45){
        stop = true;
        System.out.println("Two Pairs!"); 
    }
}
if(!stop&&t14){
    if(t23||t25||t45){
        stop = true;
      System.out.println("Two Pairs!");   
    }
}
if(!stop&&t15){
    if(t23||t24||t34){
        stop = true;
      System.out.println("Two Pairs!");   
    }
}
if(!stop&&t23){
    if(t14||t15||t45){
        stop = true;
      System.out.println("Two Pairs!");   
    }
}
if(!stop&&t24){
    if(t13||t15||t35){
        stop = true;
      System.out.println("Two Pairs!");   
    }
}
if(!stop&&t25){
    if(t13||t14||t34){
        stop = true;
      System.out.println("Two Pairs!");   
    }
}
if(!stop&&t34){
    if(t12||t15||t25){
        stop = true;
      System.out.println("Two Pairs!");   
    }
}
if(!stop&&t35){
    if(t12||t14||t24){
        stop = true;
      System.out.println("Two Pairs!");   
    }
}
if(!stop&&t45){
    if(t12||t13||t23){
        stop = true;
      System.out.println("Two Pairs!");   
    }
}
//end of the two pairs
    //no cards match --else if statement (all booleans false)
    else if(t12==false&&t13==false&&t14==false&&t15==false&&t23==false&&t24==false&&t25==false&&t34==false&&t35==false&&t45==false){
        System.out.println("High card hand!");
    }
    }//end of main method
}//end of class
//note to grader: I have a scanner embedded in comments of my code if you would like to check the more rare conditions manually
//the random numbers still generate and give values (even with scanner on), you just have to type them in manually afterwards
//it is above list of booleans
//the import statement at the top does not need to be uncommented