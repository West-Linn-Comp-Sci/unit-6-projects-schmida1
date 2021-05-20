public class ArrayTester
{
    public static void main(String[] args)
    {
        int[][] array = {{1, 2, 3, 4, 5}, {213, 57, 127, 3712, 43, 981, 1}, {8, 1, 0, 2}};
        fixArray(array, 0, array[0].length-1, array[0].length);
        fixArray(array, 1, array[1].length-1, array[1][0] + array[1][array[1].length-2]);
        fixArray(array, 2, array[2].length-1, array.length) ;
        print(array);
    }
    
    //Create a method to add the correct value to the array at the correct col, row
    public static void fixArray(int[][] arr, int row, int col, int value)
    {
        arr[row][col] = value;
    }
    
    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
