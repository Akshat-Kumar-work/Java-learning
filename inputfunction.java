import java.util.Scanner;

public class inputfunction {
    public static void main (String[]arg){
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        //System.out.print(name);

       // int a = sc.nextInt();
       // int b = sc.nextInt();
       // int sum = a+b;
       // System.out.print(sum);
        

        int r= sc.nextInt();
        int x = r*r;
        System.out.print(x);
        sc.close(); // to close scanner after scanner work is done

    }
    
}
