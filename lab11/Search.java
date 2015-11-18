//Christine Gelotte
//11-6-2105
//lab 11
//The purpose of this program is to give two arrays random values and to do a linear search and binary search to find max
import java.util.Scanner; //import scanner
public class Search{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//declare scanner
        //declare arrays and alot space
        int[] array1=new int[5000];
        int[] array2=new int[5000];
        for(int i=0;i<5000;i++){//put random values in first array
            array1[i]=(int)(Math.random()*100000);
        }//end of loop for giving values to first array
        int k=0;//set k to 0 for linear search
        for(int i=1;i<5000;i++){//search to find maximum value
            if(array1[i]>array1[k]){//if array[i] is greater than array k, it is new maximum
                k=i;//set k to i because array found is new maximum
            }//end of if
        }//end of search to find maximum
        System.out.println("The maximum of array1 is:"+array1[k]);
        k=0;//reset k for next linear search(min)
        for(int i=1;i<5000;i++){//search to find minumum value
            if(array1[i]<array1[k]){//if array[i] is less than array k, it is new minimum
                k=i;//set k to i because array found is new minimum
            }//end of if
        }//end of search to find minimum
        System.out.println("The minimum of array1 is:"+array1[k]);
        //set array2 to increasing random values
        int x=0;
        for(int i=0;i<5000;i++){
            x=(int)(Math.random()*1000);
            if (i==0){
                array2[i]=x;
            }
            else{
                array2[i]=array2[i-1]+x;
            }
        }
        System.out.println("The maximum of array2 is:"+array2[4999]);
        System.out.println("The minimum of array2 is:"+array2[0]);
        boolean boo=false;
        System.out.print("Enter an integer >=0:");
         int val=myScanner.nextInt();
                if (val<0){
                    System.out.println("Invalid.");
                }
            
            k=0;
            int bottom=0;
            int top=4999;
            if(val>-1){
                if(val<array2[0]){
                    System.out.println(val+" was not found in the list");
                    System.out.println("just above nothing");
                    System.out.println("just below:"+array2[0]);
                }
                else if(val>array2[4999]){
                    System.out.println(val+" was not found in the list");
                    System.out.println("just above:"+array2[4999]);
                    System.out.println("just below nothing");
                }
                else{
                while(bottom<=top){
                    k=(top+bottom)/2;
                    if(array2[k]==val){
                        break;
                    }
                    if (array2[k]<val){
                        bottom=k+1;
                    }
                    if(array2[k]>val){
                       top=k-1;
                    }
                }//end of while loop
                if (array2[k]==val){
                    System.out.println(val+" was found in the list");
                }
                else{
                    System.out.println(val+" was not found in the list");
                    if(array2[k]>val){
                         System.out.println("just below:"+array2[k]);
                         System.out.println("just above:"+array2[k-1]);
                    }
                    if(array2[k]<val){
                        System.out.println("just below:"+array2[k+1]);
                        System.out.println("just above:"+array2[k]);
                    }
                }
                }//end of else
            }//end of if(val>0)
    }//end of main
}//end of class