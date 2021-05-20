public class Array2DExplorer{
public static void main(String[] args) {
        int array [][] = {  {2,7,0,9},
                            {0,8,5,2},
                            {8,6,4,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: {");
        int [] row = exp.minRowPractice(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("}\n\n");

        

        System.out.print("Test colMax: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}\n\n");

        System.out.print("Test allRowSum: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}\n\n");

        

        System.out.print("Test averageCol: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}\n\n");


        

        System.out.print("Test smallEven: ");
        System.out.println(exp.smallEven(array)+"\n\n");

        

        System.out.print("Test biggestRow: ");
        System.out.println(exp.biggestRow(array)+"\n\n");

       
    }
}
