public class recurSion1 {


    //ques 1 , tower of hanoi
/*public static void towerofhanoi (int n, String source , String helper , String destination){
    if(n==1){
        System.out.println(" transfer disk "+ n + " from " + source + " to " + destination );
        return;
    }
towerofhanoi(n-1, source, destination, helper);
System.out.println(" transfer disk "+n+" from "+source+" to "+destination);
towerofhanoi(n-1, helper, source, destination);    
} 
public static void main (String [] args ){
    int n = 2; // 3 disk
towerofhanoi(n, "S", "H", "D");
}*/


//ques 2, PRINT A STRING IN REVERSE
/*public static void REVERSE (String str , int index  ){
    if(index==0){
        System.out.println(str.charAt(index));
        return;
    }
    System.out.println(str.charAt(index));
    REVERSE(str, index-1);
}
public static void main (String [] args){
    String str = "abcd";
    REVERSE(str, str.length()-1);
    System.out.println(str.length()-1);  
}*/


//ques 3, find the 1st & last occurence of an element in string "abaacdaefaaah"
/**public static int first =-1;
public static int last = -1;

public static void  occ (String str  , int indx, char element ){

    if(indx == str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
    }

    char currchar = str.charAt(indx);
    if(currchar==element){
        if(first ==-1){
            first= indx;
        }else{
            last = indx;
        }
    }
    occ(str, indx+1, element);
    

}
public static void main (String []args ){
    String str = "abaacdaefaah";
    occ(str, 0, 'a');
}*/

//ques 4 , check if an array is sorted strictly increasing 

/*public static boolean issort (int arr[], int idx){
    if (idx == arr.length-1){
        return true;
    }
if ( arr[idx]<arr[idx+1]){
    //array is sorted till now , call function again
    return issort(arr, idx+1);
    
}else{
    return false;
}
}
public static void main (String [] args ){
    int arr [ ]= {1,2,3,4,5};
   System.out.println( issort(arr, 0));
}*/


//ques 5 , move all x to the end of string "axbcxxd"
/*public static void movex (String str, String newstr , int indx , int count ){

    if(indx==str.length()){
        for(int i = 0; i<=count;i++){
            newstr += 'x';
        }

    System.out.println(newstr);

    return;
}
char currchar = str.charAt(indx);
if(currchar=='x'){
    count++;
    movex(str, newstr, indx+1, count);
}else{
    newstr+=currchar;
    movex(str, newstr, indx+1, count);
}
    
}
public static void main (String [] args){
    String str = "axbcxxd";
    movex(str, " ", 0, 0);
}*/


//ques 6, remove duplicate in string abbccda

//alternative code for only this abbccda string
/*public static void remduplicate (int indx , String str , String newstr ){
if(indx==str.length()-1 ){
    System.out.println(newstr);
    return;
}
    char currelement = str.charAt(indx);

if(str.charAt(indx) == str.charAt(indx+1)){
    remduplicate(indx+1, str, newstr);
}else{
newstr += currelement;
remduplicate(indx+1, str, newstr);
}

}
public static void main (String [] args){
    String str = "abbccda";
    remduplicate(0, str, " ");
}*/
    
//code to remove duplicate for all string 
/*public static boolean [] map = new boolean [26];

public static void removeduplicate (String str , int indx , String newstr){
    if(indx == str.length()){
        System.out.println(newstr);
        return;
    }
    char currcharacter = str.charAt(indx);
    if( map [currcharacter-'a']){
        removeduplicate(str, indx+1, newstr);

    } else {
        newstr+= currcharacter;
        map[currcharacter-'a']=true;
        removeduplicate(str, indx+1, newstr);
    }
}
public static void main (String [] args ){
    String str = "abbccda";
    removeduplicate(str, 0, " ");
}*/




//ques 7 , print all subsequence of a string abc

/*public static void subsequence (String str , int indx , String newstr){

    if (indx == str.length()){
        System.out.println(newstr);
        return;
    }
    char currchar = str.charAt(indx);

    //to be in newstr  
    subsequence(str, indx+1, newstr+currchar);



    //not to be in newstr
    subsequence(str, indx+1, newstr);
}

public static void main (String [] args){
    String str = "abc";
    subsequence(str, 0, " ");

}*/


//ques 8 , print all the unique subsequence of a string "aaa"





}
