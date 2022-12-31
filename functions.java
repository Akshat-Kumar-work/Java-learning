import java.util.Scanner;

public class functions {

    //ques 1, print given name in the function
    /*public static void printMyName(String name){ //NEW FUNCTION
        System.out.println(name);
        return;
    }

    public static void main (String arg[]){  //MAIN FUNCTION
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        printMyName(name); //FUNCTION KO CALL KIA

        



        sc.close();
    }*/
//ques 2, make a function to add 2 numbers and return the sum
    /*public static int calculatesum (int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main (String [] arg){
        Scanner sc = new Scanner (System.in);
        int a;
        System.out.print("enter 1st number");
        a = sc.nextInt();

        int b;
        System.out.print("enter 2nd number");
        b = sc.nextInt();

        int sum = calculatesum(a, b);
        System.out.println(sum);

        sc.close();
    }*/

    //ques 3, make a function to multiply 2 no. and return the product

    /*public static int calproduct ( int a , int b){
        int product = a*b;
        return product; 
    }

    public static void main(String args[]){

    Scanner sc = new Scanner (System.in);

    int a;
        System.out.print("enter 1st number");
        a = sc.nextInt();

        int b;
        System.out.print("enter 2nd number");
        b = sc.nextInt();

        int product = calproduct(a, b);
        System.out.print(product);

        sc.close();
}*/

// ques 4, find the factorial
public static int calculatefactorial ( int n){
    int factorial = 1;
    for(int i = n; i>= 1;i--){
    
    factorial = factorial * i;
    
    }
    System.out.println(factorial);
    return factorial;
}
public static void main(String args[]){
    Scanner sc = new Scanner (System.in);

    int n = sc.nextInt();

    calculatefactorial(n);
    
    sc.close();    
}
}
