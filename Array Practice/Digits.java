/**
 * Write a description of class Digits here.
 *
 * @author Aidan Schmidt
 * May 28 2021
 */
import java.util.*;
public class Digits { 
private ArrayList<Integer> digitList = new ArrayList<>(); 
    public Digits(int num) { 
    while (num > 0) {
      digitList.add(num % 10);
      num = num / 10;
    }
        Collections.reverse(digitList);
    } 
    
  public boolean isStrictlyIncreasing() {
  int temp = 0;
    for (int i : digitList){
      if (digitList.get(i) > temp){
        temp = digitList.get(i);
      }else{
        return false;
        }
    }
      return true;
    } 
}
