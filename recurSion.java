public class recurSion {
    
        //print number 5 to 1
        /*public static void printnumb (int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printnumb(n-1);
        }
        public static void main (String [] args){
            int n = 5;
        printnumb(n);
        }*/

        //print number 1 to 5 
         /*public static void num (int n ){
            if(n==6){
                return;
            }
            System.out.println(n);
            num(n+1);
         }
         public static void main (String args[]){
            int n = 1;
            num(n);
         }*/

         //print sum of first n natural no.

         /*public static  void printsum  (int i , int n, int sum ){
            if (i==n){
                sum += i;
                System.out.println(sum);
                return;
            }
            sum += i;
            printsum(i+1, n, sum);

         }
         public static void main (String args[]){
            printsum(1, 5, 0);
         }*/

         //print factorial of a no. n
         /*public static void printfactorial ( int i , int n , int fact){
            if(i==n){
                fact *= i;
                System.out.println(fact);
                return;
            }
            fact *= i;
            printfactorial(i-1, n, fact);
         }
         public static void main (String args[]){
            printfactorial(5, 1, 1);
         }*/

         //print fibonaci series using recursion 
         /*public static void fibonaci ( int a , int b , int n){
            if(n==0){
               return;
            }
            int c = a+b;
            System.out.println(c);
            fibonaci(b, c, n-1);

           
         }

         public static void main ( String args []){
            int a = 0;
            int b = 1;
            System.out.println(a);
            System.out.println(b);

            int n = 7; //totoal number of term to print 
            fibonaci(a, b, n-2);
            
         }*/

         //print x^n ( stack height = n)

         public static void xxx (int n , int x , int result ){
            if(n==0){
               System.out.print(result);
               
               return;
            }
            result *= x;
            xxx(n-1, x, result);
         }
         public static void main ( String [] args){
            xxx(5, 2, 1);
         }

    }
    

