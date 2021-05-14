
/**
 * Write a description of class allRowSums here.
 *
 * @author Aidan Schmidt
 * @version 05/12/2021
 */
public class allRowSums

{
    public static int[] rowSums(int[][] arr2D){
       int total2 = 0;
       int a[] = new int[arr2D.length];
       for(int x=0; x<arr2D.length; x++){
           for(int n=0; n<arr2D[x].length;n++){
               arr2D[x][n] = total2;
               a[x] = a[x] + total2;
           }
       }
       return a;
   }
}
