
/**
 * This application will read a set of values 1-100 and then a chart is created
 * to show how many values fall into each range
 *
 * Aidan Schmidt
 * 4/29/2021
 */
 
import java.util.Scanner;
public class frequencyChart{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int oneToTen = 0;
        int elevenToTwenty = 0;
        int twentyOneToThirty = 0;
        int thirtyOneToFourty = 0;
        int fourtyOneToFifty = 0;
        int fiftyOneToSixty = 0;
        int sixtyOneToSeventy = 0;
        int seventyOneToEighty = 0;
        int eightyOneToNinety = 0;
        int ninetyOneToHundred = 0;
        
        int length;
        System.out.println("How many numbers are you wanting to enter?");
        length = input.nextInt();
        
        int[] nums = new int [length];
        for(int i = 0; i < length; i++){
            System.out.println("Enter the number you want(1-100)"+(i+1));
            nums[i] = input.nextInt();
            if(nums[i] > 0 && nums[i] < 11){
                oneToTen++;
            }else if(nums[i] > 10 && nums[i] < 21){
                elevenToTwenty++;
            }else if(nums[i] > 20 && nums[i] < 31){
                twentyOneToThirty++;
            }else if(nums[i] > 30 && nums[i] < 41){
                thirtyOneToFourty++;
            }else if(nums[i] > 40 && nums[i] < 51){
                fourtyOneToFifty++;
            }else if(nums[i] > 50 && nums[i] < 61){
                fiftyOneToSixty++;
            }else if(nums[i] > 60 && nums[i] < 71){
                sixtyOneToSeventy++;
            }else if(nums[i] > 70 && nums[i] < 81){
                seventyOneToEighty++;
            }else if(nums[i] > 80 && nums[i] < 91){
                eightyOneToNinety++;
            }else if(nums[i] > 90 && nums[i] < 101){
                ninetyOneToHundred++;
            }
    }
    System.out.println("1-10: "+oneToTen);
    System.out.println("11-20: "+elevenToTwenty);
    System.out.println("21-30: "+twentyOneToThirty);
    System.out.println("31-40: "+thirtyOneToFourty);
    System.out.println("41-50: "+fourtyOneToFifty);
    System.out.println("51-60: "+fiftyOneToSixty);
    System.out.println("61-70: "+sixtyOneToSeventy);
    System.out.println("71-80: "+seventyOneToEighty);
    System.out.println("81-90: "+eightyOneToNinety);
    System.out.println("91-100: "+ninetyOneToHundred);
}
}
