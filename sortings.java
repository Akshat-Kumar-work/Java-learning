public class sortings {
    
        public static void main ( String [] args){

//sort element of array 
            int [] list = {7,8,3,1,2};
    
            //bubble sort
            /*for ( int i=0; i<list.length-1;i++){
               for(int j= 0; j<list.length-i-1;j++ ){
                if (list[j]>list[j+1]){
                    //do swapping
                    int temp = list [j];
                    list [ j] = list [j+1];
                    list [j+1] = temp;
                }
               }
            }
    //output 
            for ( int i=0; i<list.length;i++){
                System.out.print(list[i]+"");
            }*/




         //selelction sort 
/*for(int i=0; i<list.length-1;i++){
    int smallest = i;
    for(int j=i+1;j<list.length;j++){
        if (list[smallest]>list[j]){
            smallest = j;
        }
    }
    int temp = list[smallest];
    list[smallest]= list[i];
    list[i]= temp;
}
for ( int i=0; i<list.length;i++){
System.out.print(list[i]);
}  */

//insertion sort

for(int i=0;i<list.length;i++){
    int recent= list[i];
    int j = i-1;
    while(j>=0 && recent<list[j]){
            list[j+1] = list[j];
            j--;
            
        }
    
        list[j+1]=recent;
    }
for ( int i=0; i<list.length;i++){
    System.out.print(list[i]);
    }  
        }
        
    }
    