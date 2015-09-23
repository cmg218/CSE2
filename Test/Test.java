//Testing various code snippets
import java.util.Scanner; //import scanner
public class Test{
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);//declare scanner
    System.out.print("give me value1:");
    int tempNumber1=myScanner.nextInt();
    System.out.print("give me value2:");
    int tempNumber2=myScanner.nextInt();
     System.out.print("give me value3:");
     int tempNumber3=myScanner.nextInt();
      System.out.print("give me value4:");
     int tempNumber4=myScanner.nextInt();
    System.out.print("give me value5:");
     int tempNumber5=myScanner.nextInt();
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
    boolean stop = false;
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
            stop =true;
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