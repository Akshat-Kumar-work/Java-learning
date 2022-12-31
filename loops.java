import java.util.Scanner;

public class loops {
    public static void main (String[]args){
        //print hello world 100 time using for loop

    //for (int print = 0; print <100; print = print+1){
        //System.out.println("hello world");


    //print number 0 to 10 , number = number+1 or number++ is same
        //for ( int number= 0; number < 11 ; number++){
            //System.out.println(number);
       // }


       //while loop
/*
       int a= 0;
       while(a<11){
           System.out.println(a++);

       }
*/

//do while loop
/*
int b = 0;
do{
    System.out.println(b++);
}while(b<11);
*/

//print sum of first n natural number

/*Scanner input = new Scanner (System.in);

int c;
System.out.println("enter value of n");
c = input.nextInt();

int sum=0;


int i = 0;

while(i<=c){
    
    sum= sum+i;
    i++;
   
}
System.out.println(sum);
*/
//print table of number input by user

Scanner robot = new Scanner (System.in);
int k;
System.out.println("enter number for table");
k= robot.nextInt();


for(int g=1; g<=10;g++){
    
    System.out.println(k*g);
}

robot.close();

}


    }
    
    

