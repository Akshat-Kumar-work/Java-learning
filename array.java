import java.util.Scanner;

public class array {
    public static void main(String []args){
        //make array of 4 subject and save marks in it
        /*int[]marks=new int[4];
        marks[0]=97;
        marks[1]=98;
        marks[2]=96;
        marks[3]=95;

        System.out.println(marks[0]);//to print marks of zero

        //to print all marks use loop

        for(int i=0;i<4;i++){
            System.out.println(marks[i]);
        }*/

        
//input array size from user and print it 
/*Scanner robot = new Scanner (System.in);
int size;
System.out.println("enter array size");
size= robot.nextInt(); //input array size


int [] numb = new int [size]; //array

for(int i=0;i<size;i++){
   System.out.println("enter element of array");
    numb[i]=robot.nextInt(); //input array element
}

for(int i = 0; i<size;i++){
    System.out.println(numb[i]);
}*/


//take an array as input from user and search for a given no. x and print the index of which it occurs
/*Scanner robot = new Scanner (System.in);
int size;
System.out.println("enter array size");
size= robot.nextInt(); //input array size

int [] numb = new int [size]; //array

for(int i=0;i<numb.length;i++){  //here numb.length is equal to size variable of array that contain input size of array defined by user
    System.out.println("enter element of array");
     numb[i]=robot.nextInt(); //input array element
}
int x ;
System.out.println("enter number to search");
x=robot.nextInt();

for(int i=0;i<size;i++){
    if(numb[i]==x){
        System.out.print("number found at index"+" "+i);
    }
}*/

//find max and minimum no. in an array of integer
/*Scanner robot = new Scanner (System.in);

//array size input
int size;
System.out.println("enter size of array");
size=robot.nextInt();

int [] num = new int [size];//array

//element input
for(int i =0;i<size ; i++){
    System.out.println("enter elements of array");
    num[i]=robot.nextInt();
}

int max = Integer.MIN_VALUE; 
int min = Integer.MAX_VALUE;// it represent max positive value that can represent in 32 bit

for(int i=0;i<size; i++){
    if(num[i]<min){
        min=num[i];
    }
    if(num[i]>max){ //here num[i] is smallest value of array which can store 
        max=num[i];
    }
}
robot.close();
System.out.println("smallest number is"+min);
System.out.println("largest number is"+max);*/

//Take an array of numbers as input and check if it is an array sorted in ascending order.
Scanner robot = new Scanner (System.in);

//array size input
int size;
System.out.println("enter size of array");
size=robot.nextInt();

int [] num = new int [size];//array

//element input
for(int i =0;i<size ; i++){
    System.out.println("enter elements of array");
    num[i]=robot.nextInt();
}

boolean ascending =true;

for(int i=0; i<size-1;i++){ 
    if(num[i]<num[i+1]){
         ascending =true;}
        else {
             ascending = false;}
        }

if (ascending){
    System.out.println("the array is sorted in ascending order");
}
else{
    System.out.println("the array is NOT sorted in ascending order");
}     
robot.close();
}
}