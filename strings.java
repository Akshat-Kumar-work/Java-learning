import java.util.Scanner;

public class strings {
    public static void main ( String [] args){
        Scanner robot = new Scanner(System.in);
        /*String firstName = " tony";
        String lastName = "stark";
        String fullName = firstName+lastName; //THIS ADDING IS  KNOWN AS CONCATENTATION
        System.out.println(fullName);

        //TO PRINT LENGTH OF VARIABLE USE .length()
        System.out.println(fullName.length());

        //to print single chracter at a time use .charAt(index number of string)
        String a = "akshat";
        for( int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }

        //to compare two string use .compareTo()

        String one = "akshat";
        String two = "akshghat";

        if(one.compareTo(two)==0){
        System.out.println("Strings are equal");

        }*/

        //substring to divide string into some part
/*String sentence = "My name is Tony";
String name = sentence.substring(11,sentence.length()); //here string is started from 11 till end
System.out.print(name);*/

//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
 /*
 String yo = robot.nextLine();
 String  result = yo.replace("e","i"); //to replace a character use .replace(,);
 System.out.println(result);
 robot.close();*/

 //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        String email = robot.nextLine();
        String username =" ";
         for(int i=0; i<email.length();i++ ){
            if (email.charAt(i)=='@'){
                break;
            }
            else{
                
                 username += email.charAt(i);
            }
         }
        System.out.println(username);

         robot.close();
    }
}
