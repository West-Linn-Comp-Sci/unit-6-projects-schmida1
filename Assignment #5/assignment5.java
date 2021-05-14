import java.util.ArrayList;
public class assignment5
{
    public static void removeZeros(ArrayList<Integer> list) {
        for(int i = 0; i < list.size();i++){
            if(list.get(i)==0)
            list.remove(i);
        }
    }
    public int countLetters(ArrayList<String>list) {
        int count = 0;
        for(String a : list)
        count+= a.length();
        return counter;
    }
    public int findPostion(ArrayList<Integer> list, int keyValure){
        int counter = 0;
       for(int i = 0; i < list.size();i++){
            if(list.get(i) == keyValue)
            counter ++;
        }
        if(counter == 0)
        counter = -1;
        return counter;
    }
    public void parseIntoArrayList(ArrayList<String>list){
        ArrayList<String>list2 = new ArrayList<String>();
        for(int i = 0; i < list.size();i++){
            list2.add(list.get(i));
        }
    }
    public String findMin(ArrayList<Person> list){
        int ageA = list.get(myAge);
         for(int i = 0; i < list.size();i++){
            if(list.get(myAge)>age1) 
            ageA = myAge;
        }
    }
    
}
