//Christine Gelotte
//September 18,2015
//lab 3
//The purpose of this program is to generate a number corresponding to a card and to assign suit and value to it

public class CardGenerator{
    public static void main(String[] args){
        String cardValue = "";//assign variable names
        String suit="";
        int tempNumber=0;
       int randomNumber = (int)(Math.random()*52)+1; //assign a random number between values 1 to 52 
       if (randomNumber <= 13){ //check if suit is diamonds
            suit = "Diamonds";  //assign suit 
            tempNumber=randomNumber;//convert random number to value 1-13
            switch (tempNumber){//assign card value
                case 1: 
                    cardValue = "ace";
                    break;
                case 11:
                    cardValue = "jack";
                    break;
                case 12:
                    cardValue = "queen";
                    break;
                case 13:
                    cardValue = "king";
                    break;
                default:
                    cardValue = ""+tempNumber;
                    break;
            }//end of card value assignment
       }//end of check diamond
       else if(randomNumber <= 26){//check if suit is clubs
           suit = "Clubs";//assign suit
           tempNumber=randomNumber - 13;//convert random number to value 1-13
            switch (tempNumber){//assign card value
                case 1: 
                    cardValue = "ace";
                    break;
                case 11:
                    cardValue = "jack";
                    break;
                case 12:
                    cardValue = "queen";
                    break;
                case 13:
                    cardValue = "king";
                    break;
                default:
                    cardValue = ""+ tempNumber;
                    break;
            }//end of card value assignment
       }//end of check club
       else if(randomNumber <= 39){//check if suit is hearts
           suit = "Hearts";//assign suit
           tempNumber=randomNumber - 26;//convert random number to value 1-13
            switch (tempNumber){//assign card value
                case 1: 
                    cardValue = "ace";
                    break;
                case 11:
                    cardValue = "jack";
                    break;
                case 12:
                    cardValue = "queen";
                    break;
                case 13:
                    cardValue = "king";
                    break;
                default:
                    cardValue = ""+ tempNumber;
                    break;
            }//end of card value assignment
       }//end of check hearts
       else if(randomNumber <= 52){//check if suit is spades
           suit = "Spades";//assign suit
           tempNumber=randomNumber - 39;//convert random number to value 1-13
            switch (tempNumber){//assign card value
                case 1: 
                    cardValue = "ace";
                    break;
                case 11:
                    cardValue = "jack";
                    break;
                case 12:
                    cardValue = "queen";
                    break;
                case 13:
                    cardValue = "king";
                    break;
                default:
                    cardValue = "" +tempNumber;
                    break;
            }//end of card value assignment
       }//end of check spades
       //print out results
       System.out.println("You picked the "+cardValue+" of "+suit+".");
    }//end of main method
}//end of class