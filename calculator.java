//make a calculator 


import java.util.*;
public class calculator{
    public static void main(String[]arg) {
        Scanner robot = new Scanner (System.in);
 
        int a;
        System.out.println("enter the number");
        a= robot.nextInt();

        int b;
        System.out.println("enter the number");
        b=robot.nextInt();

        String operation;
        System.out.println("choose the operation\n+\n-\n*\n/\n%");
        operation=robot.next();

        switch (operation){
            case "+":System.out.print(a+b);
            break;
            case "-":System.out.print(a-b);
            break;
            case "*":System.out.print(a*b);
            break;
            case "/":System.out.print(a*b);
            break;
            case "%":System.out.print(a%b);
            break;
            default:System.out.print("invalid operation");
        }
        robot.close();
    }
}
