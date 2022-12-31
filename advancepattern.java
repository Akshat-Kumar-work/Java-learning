
public class advancepattern{
    public static void main(String[]args){

        //ques 10 print butterfly pattern
        
       /*  for(int i= 1; i<=4;i++){

            //1st part
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
        
            


        //spaces
        int space=2*(4-i);
        for(int j=1; j<=space;j++){
            System.out.print(" ");
        }

        //2nd part
        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
    }


        //lower half
        for(int i= 4; i>=1;i--){

            //1st part
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
        
            


        //spaces
        int space=2*(4-i);
        for(int j=1; j<=space;j++){
            System.out.print(" ");
        }

        //2nd part
        for(int j = 1; j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
    }*/
    
  //ques 2 print solid rhombus


     /*for (int i =1; i<=5;i++){
        for(int j = 1; j<=5-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
     }   */
    
     //ques 12 , print number pyramid
       /*for(int i=1; i<=5;i++){
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        }
        for(int j =1;j<=i;j++){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
       }*/

//ques 13, palindromic pattern
/*for(int i = 1;i<=5;i++){
    for(int j=1; j<=5-i;j++){
        System.out.print(" ");
    }
    for(int j=i;j>=1;j--){
        System.out.print(j);
        
    }
    

for(int j=2;j<=i;j++){
    System.out.print(j);
    }
    System.out.println();
}*/
//ques 14, print diamond pattern
for(int i=1;i<=4;i++){
    for(int j=1;j<=4-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=4;i>=1;i--){
    for(int j=1;j<=4-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
}
}