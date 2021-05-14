public static int biggestRow(int[][] nums){
 int numRows = nums.length;
 int numCols = nums[0].length; 
 int[] rowSum = new int[numRows]; 
 int sum = 0;
 for(int i = 0; i < numRows; i++) {
     for(int j =0; j < numCols; j++) {
          sum += nums[i][j]; 
        }
        rowSum[i] = sum; 
    }
int rowMax = rowSum[0];
int maxIndex = 0;
for(int i = 0; i < rowSum.length; i++) {
    if (rowSum[i]> rowMax) {
        rowMax = rowSum[i];
        maxIndex = i; }
}
return maxIndex;
}

}
