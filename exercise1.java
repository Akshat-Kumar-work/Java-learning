import java.util.Scanner;

public class exercise1 {
    //ques 1 , enter 3no. from the user and make a function to print their average
/*public static int numaverage (int a, int b, int c){
    int average = (a+b+c)/3;
    return average;
}
    public static void main (String args[]){
        Scanner robot = new Scanner (System.in);

        int a;
        System.out.println("enter 1st number");
        a = robot.nextInt();

        int b;
        System.out.println("enter 2nd number");
        b = robot.nextInt();

        int c;
        System.out.println("enter 3rd number");
        c = robot.nextInt();

        int average= numaverage(a, b, c);
        System.out.println(average);

        robot.close();
    }*/

//ques 2, write a function that calculate the greatest common divisor of 2 no.
/*public static int caldivisor (int a, int b){
    while (a != b){
        if(a>b){
            a = a-b;
        }
            else{
                b = b-a;
            }
        
    }
    return a;
}
public static void main (String args[]){
    Scanner robot = new Scanner (System.in);
 int a;
 System.out.println("enter first number");
 a= robot.nextInt();

 int b;
 System.out.println("enter second number");
 b= robot.nextInt();

 
  int c=caldivisor(a, b);
 System.out.println(c);

 robot.close();
}*/

//ques 3 write a program to print fibonacci series of n term where n is input by user
public static void fibonacci ( int n){
    int a = 0; int b = 1;
    System.out.print(a);
    for(int i=2;i<=n;i++){
        System.out.print(b);
        int c=b;
        b= a+b;
        a=c;}
    }
    public static void main (String [] args){
        Scanner robot = new Scanner(System.in);
        int n = robot.nextInt();
        fibonacci(n);
        robot.close();
    }
    
    
}



