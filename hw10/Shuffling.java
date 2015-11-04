//Christine Gelotte
//11-2-2015
//hw 10 -Shuffling
//the purpose of this program is to shuffle a deck of cards and pull a randomized hand
public class Shuffling{
  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
    }
    printArray(cards);
    shuffle(cards);
    System.out.println("Shuffled");
    printArray(cards);
    randomizeHand(cards,hand);
     System.out.println("Randomized Hand");
    printArray(hand);
  }//end of main method
  public static void printArray(String[] array){
      for(int i=0;i<array.length;i++){//print out each member of array separated by space
          System.out.print(array[i]);
           if(i==0){//if statement for nicer formatting
              System.out.print(" ");
              continue;
          }
          if(i%20==0){//if statement for nicer formatting
              System.out.println("");
              continue;
          }
          System.out.print(" ");
      }//end of loop
      System.out.println("");
  }//end of printArray
  public static void shuffle(String[] array){
      String passBy="";//a variable that temporarily holds the value of array[0] during swap
      int randomizer=0;//variable that holds a random value 
      for(int i=0;i<100;i++){//for loop for randomizing value
          randomizer=(int)(Math.random()*51)+1;//set randomizer to random value
          passBy=array[0];//hold array member in passBy var
          array[0]=array[randomizer];//set array member to new val
          array[randomizer]=passBy;//swap passBy value to new position
      }//end of for loop
  }//end of shuffle
  public static void randomizeHand(String[] cards,String[] hand){
    int randomizer=0;//variable that holds random values of array
    int k=0;//variable that controls while loop
    for(int i=0;i<5;i++){//set values for randomized hand
      randomizer=(int)(Math.random()*52);//set random variable
      hand[i]=cards[randomizer];//set value of array member to random card
      k=i-1;//set k to one less than current member number to check for repeats
      while(k>=0){//check for repeats
        if(hand[k].equals(hand[i])){//if statement for check
          i=i-1;//if condition met, repeat for loop for current member(reassign)
          break;//break out of while loop
        }//end of if
        k--;
      }//end of while loop for checking for repeat cards
    }//end of for loop for assigning randomized hand
  }//end of randomize hand
}//end of class
