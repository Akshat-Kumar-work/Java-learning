import java.util.Scanner;

public class basicques {
        public static void main (String [] args){
           //ques 1,  Write a program to find if a number is a power of 2 or not.
           /*Scanner robot = new Scanner(System.in);
       int n;
       System.out.println("enter no. to check if it is power of 2 or not");
       n = robot.nextInt();

       int m = n-1;
       int r = n & m;
       if ( r == 0){
        System.out.println("it is power of 2");
       }
       else {
        System.out.println("it is not power of 2");
       }
robot.close();*/

// ques 2 Write a program to toggle a bit a position = “pos” in a number “n”.
//toggle means changing 1 bit to zero and zero to 1
/*Scanner robot = new Scanner(System.in);
int n;
System.out.println("enter the number");
n = robot.nextInt();
int pos;
System.out.println("enter position of bit which have to toggle");
pos = robot.nextInt();
int operation;
System.out.println("enter operation to perform 0 or 1");
operation=robot.nextInt();

//for clear bit operation that is 1 to 0
if(operation ==0){
    int bitmask = 1<<pos;
    int not = ~bitmask;
    int r = not&n;
    System.out.println(r);
}
else{ //for set bit operation 0 to 1
    int bitmask = 1<<pos;
    int result = bitmask | n;
    System.out.println(result);
    }  

robot.close();*/

//ques 3 Write a program to count the number of 1’s in a binary representation of the number.
Scanner robot = new Scanner(System.in);
int n;
System.out.println("enter number to count 1's in it");
n=robot.nextInt();

int bit =0;
while (n>0){
    if ((n&1)==1){
        bit++;
    }
    n=n>>1;
}
System.out.println(bit);

robot.close();

}

    }

        
        
    
       