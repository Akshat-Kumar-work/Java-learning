//import java.util.Scanner;

public class patterns {
    public static void main(String[]arg){

        //Scanner  robot = new Scanner (System.in);

        // nested loops

    //qus 1 - print the solid rectangle pattern 
    /*String a;
    System.out.println("enter pattern style");
    a=robot.next();

    for(int i=1;i<=4;i++){ //outer loop
        for(int j=1;j<=5;j++){  //inner loop
            System.out.print(a);
        }
       System.out.println(); 
    }

*/

//ques 2 print the given hollow rectangle pattern

    /*String c;
    System.out.println("enter pattern style");
    c=robot.next();

    for ( int i = 1; i<= 4;i++){
        for ( int j = 1; j<=5;j++){
            if(i==1 || j==1 || i==4 || j==5){
            System.out.print(c);
            }
        
            else{
        System.out.print(" "  );
    }
}
    System.out.println();
    }*/
//print the half pyramid pattern
/* 
    String d;
    System.out.println("enter pattern style");
    d=robot.next();

    for (int i=1;i<=4;i++){
        for(int j = 1; j<=i;j++){
            
            System.out.print(d);
        }
        System.out.println();
    } 

    */
//ques 4 print the pattern 
    /*String e;
    System.out.println("enter the pattern");
    e=robot.next();

    for(int i=4; i>=1; i--){
        for(int j=1; j<=i ;j++){
           System.out.print(e); 
        }
        System.out.println();
    }*/
// ques 5 print the pattern
/*String f;
    System.out.println("enter the pattern");
    f=robot.next();

    for(int i=1; i<=4; i++){
     for(int j = 1 ; j<=4-i; j++){ //to print space
        System.out.print(" ");

     }
     for(int j=1; j<=i;j++){
        System.out.print(f);
     }
     System.out.println();
    }*/

    
//ques 6 print the pattern
    /*for(int i=1; i<=5; i++){
     for(int j = 1 ; j<=i; j++){ 
        System.out.print(j);
}
 System.out.println();     
  }*/


//ques 7
  /*for(int i=5; i>=1; i--){
    for(int j=1; j<=i ;j++){
       System.out.print(j); 
    }
    System.out.println();
}*/


//ques8 floyd triangle 
/*int number = 1;
for(int i=1;i<=5;i++){
   for( int j = 1;j<=i;j++){
System.out.print(number);
number++;
   }
   System.out.println();
}*/

//ques 9,  0-1 triangle

for(int i=1;i<=5;i++){
    for( int j = 1;j<=i;j++){
        int sum = i+j;
        if(sum%2==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
}
System.out.println();
}
}  
}
    
