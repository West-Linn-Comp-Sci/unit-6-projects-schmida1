public class smallEven
{
      public static void main(String args[]){
     int temp, size;
     int array[] = {1, 26, 94, 52, 86, 11};
     size = array.length;
     for(int i = 0; i<size; i++ ){
        for(int j = i+1; j<size; j++){
           if(array[i]>array[j]){
              temp = array[i];
              array[i] = array[j];
              array[j] = temp;
           }
        }
     }
     int x;
     x = array[0] %2;
     if(x == 0){
     System.out.println("Smallest number in the array is: " +array[0]);
   }
 }
}
