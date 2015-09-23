import java.util.Scanner; //import scanner
public class Counter{
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
// Check if there are two pairs
//I check if a boolean is true and then if others (not same two numbers) are also true
// to prevent repeat statements, I introduced a new boolean
//this new boolean is false until the statement is activated, when true it stops other statements from being activated
boolean stop = false;
if(t12){
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
    }
}