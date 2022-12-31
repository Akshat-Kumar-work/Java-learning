import java.util.Scanner;

public class conditionalstaement {
    public static void main(String[]arg){

        Scanner sc = new Scanner(System.in);

     // take input age and print if age>18 adult else not adult
      /*  int age = sc.nextInt();
        
        if(age>18){
            System.out.print("ADULT");
        }

        else{
            System.out.print("NOT ADULT");

      }*/
    
          // to find odd or even number

       /* int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.print("EVEN");
        }

        else{
            System.out.print("ODD");
        }*/
     

     // take two inputs a and b
/*
     int a = sc.nextInt();
     int b = sc.nextInt();
    
     if(a==b){
         System.out.print("EQUAL");
     }
    else{
        if(a>b){
            System.out.print("a is greater");
        }else{
            System.out.print("a is lesser");
        }

        }

        //else if statement

        if(a==b){
         System.out.print("EQUAL");
     }
    else if(a>b){
            System.out.print("a is greater");
        }
        else{
            System.out.print("a is lesser");
        }

*/
    //using switch and break statement 

    int button = sc.nextInt();

    switch (button) {
        case 1:System.out.print("hello");
        break;
        case 2:System.out.print("namesty");
        break;
        case 3:System.out.print("bonjour");
        break;
        default:System.out.print("invalid");
           
    }
    

        
    sc.close();
    
    
    }


    }
    

