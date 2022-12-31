import java.util.Scanner;

public class bitManipulation {
    public static void main (String[]args){

        //get bit operation

//example 1        get the 3rd bit of position 2, of a number n=5;
        /*int n = 5; //5 in binary no. system is 0101
        int position = 2;
        int bitMask = 1<<position;
        if ((bitMask & n)==0){ //& is and operation
            System.out.println("the bit was zero");            
        } else{
            System.out.println("the bit was one");
        }*/

// example 2      get the 3rd bit of position 3, of a number n=5;
        /*int n = 5; //5 in binary no. system is 0101
        int position = 3;
        int bitMask = 1<<position;
        if ((bitMask & n)==0){
            System.out.println("the bit was zero");            
        } else{
            System.out.println("the bit was one");
        }*/



        //set bit operation

//example 1 , set the 2nd bit (position =1 ) of a number n, n = 5

   /*int n = 5; //0101
   int position = 1;
   int bitmask = 1<<position;
   int result = bitmask | n ; // | is or operation 
   System.out.println(result);*/


   // clear bit operation 

 //  example 1, clear 3rd bit position 2 of a no. n(n=0101)
 /*int n = 5; //0101
 int pos = 0;
 int bitMask = 1<< pos;
 int NOT = ~bitMask;
 int result = NOT & n;
 System.out.println(result);*/

 //update bit

// example update 2nd bit having position 1 , of a no (n=0101)
int n = 5;  //0101
Scanner robot = new Scanner (System.in);
int operation ;
System.out.println("enter operation to perform 0 or 1");
operation = robot.nextInt();
//set operation
if ( operation == 1){
    int bitmask = 1<<1;
int result = bitmask | n;
System.out.println(result);
} 
// clear operation
else{
    int bitmask2 = 1<<2;
    int not = ~bitmask2;
    int Result = not & n;
    System.out.println(Result);
}
robot.close();
}



    }
    

