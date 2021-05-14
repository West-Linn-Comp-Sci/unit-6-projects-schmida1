
/**
 * Write a description of class averageCol here.
 *
 * @author Aidan Schmidt
 * @version 05/12/2021
 */
import java.util.Scanner;
public class averageCol
{
    
       public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter how many rows you want: ");
       int rows = input.nextInt();
       System.out.print("Enter how many columns you want: ");
       int columns = input.nextInt();
       int[][] array = new int[rows][columns];
       System.out.println("Enter the numbers for the array: ");
       for(int i=0 ; i<rows ; i++)
       {
           for(int j=0 ; j<columns ; j++)
           {
               array[i][j] = input.nextInt();
           }
       }
       int rowSum = 0;
       int colSumArr[] = new int[columns];
       for(int i=0 ; i<rows ; i++)
       {
           for(int j=0  ; j<columns ; j++)
           {
               rowSum = rowSum + array[i][j];
               colSumArr[j] = colSumArr[j] + array[i][j];
               System.out.print(array[i][j] + " , ");
           }
           System.out.println( " average= " + (double)rowSum/columns);
           rowSum = 0;
       }
       System.out.printf("average= ");
       for(int i=0;i<columns;i++){
           if(i!=columns -1)
               System.out.print((double)colSumArr[i]/rows + ", ");
           else
               System.out.print((double)colSumArr[i]/rows);
       }
    }

}
