import java.util.Scanner;

public class array2d {
    public static void main (String[]arg){

//make 2d array, take size and elment as input from user
        /*Scanner robot = new Scanner (System.in);

        int row;//size of array row
        System.out.println("enter row of array");
        row=robot.nextInt();

        int column;//size of column
        System.out.println("enter column of array");
        column=robot.nextInt();

        int [] [] abc = new int [row] [column]; //array

        for(int i=0;i<row;i++){ //for row
            for(int j=0;j<column;j++){ //for column
                System.out.println("enter elements");
                abc [i] [j] =robot.nextInt(); //entering element
            }           
        }

        for(int i=0;i<row;i++){ //for row output
            for(int j=0;j<column;j++){ //for column output
                System.out.print(abc[i][j]+" ");
            }
            System.out.println();
    }
    robot.close();*/
   
    
//take a matrix as a input from user search for a given no. x and print the index at which it occur
/*Scanner robot = new Scanner (System.in);

int row;//size of array row
System.out.println("enter row of array");
row=robot.nextInt();

int column;//size of column
System.out.println("enter column of array");
column=robot.nextInt();

int [][] matrix = new int [row] [column]; //array

//elemnt input
for (int i =0; i<row; i++){
    for(int j=0; j<column;j++){
        System.out.print("enter elements ");
        matrix [i] [j] = robot.nextInt();
    }
}

int x;
System.out.println("enter number to search ");
x=robot.nextInt();

//output 
for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
        if (matrix [i] [j]==x){
            System.out.println("number found at index "+i+j);
        }
    }
}

robot.close();*/


//for a given matrix n*m , print its transpose

/*Scanner robot = new Scanner (System.in);

int row;
System.out.println("enter row size");
row=robot.nextInt();

int column;
System.out.println("enter column size");
column=robot.nextInt();

int matrix [] [] = new int [row] [column];

//input 
for(int i=0;i<row;i++){
     for (int j=0;j<column;j++){
        System.out.println("enter elements for matrix");
        matrix [i] [j] = robot.nextInt();
     }
}

//matrix output
for(int i=0;i<row;i++){
    for (int j=0;j<column;j++){
        System.out.print(matrix [i] [j]+" ");
    }
    System.out.println();
}


//transpose output
for(int j=0;j<column;j++){
    for (int i=0;i<row;i++){
        System.out.print(matrix [i] [j]+" ");  
}
System.out.println();
}
robot.close();;*/


//print the spiral order matrix as output for a given  matrix of number 
Scanner robot = new Scanner (System.in);
int row;
System.out.println("enter size of row");
row = robot.nextInt();
int col;
System.out.println("enter size of col");
col = robot.nextInt();
int [][] matrix = new int [row ] [col];
int startingrow = 0;
int endingrow = row-1;
int startingcol = 0;
int endingcol = col-1;
int count = 0 ;
int total = row * col;

//input
for(int i=0;i<row;i++){
    for (int j=0;j<col;j++){
       System.out.println("enter elements for matrix");
       matrix [i] [j] = robot.nextInt();
    }
}

//ouput

while( count < total){
    for( int i = startingcol ; i<= endingcol;i++){
        System.out.print(matrix[startingrow][i]);
        count++;
    }
}

startingrow++;
for( int i= startingrow; i <= endingrow;i++){
    System.out.print(matrix[i][endingcol]);
    count++;
}

endingcol--;
for(int i= endingcol; i>= startingcol;i--){
    System.out.print(matrix[endingrow][i]);
    count++;
}

endingrow--;
for(int i= endingrow; i>= startingrow;i--){
    System.out.print(matrix[i][startingcol]);
    count++;
}


startingcol++;
robot.close();



}
}



