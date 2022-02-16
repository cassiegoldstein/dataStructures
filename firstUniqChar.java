import java.util.*;
public class firstUniqChar
{
    // instance variables - replace the example below with your own
     private String s;
     private int index;

    public firstUniqChar(String string1In)
    {
        s = string1In;
        index = -1;
    }

    public int findFirstUniqChar()
    {
        char[] temp = new char[s.length()];
        ArrayList<Character> tempList = new ArrayList<Character>();
        HashMap<Character, Integer> hashMap = new HashMap<>(); 
        for (int i = 0; i < s.length(); i++){
            temp[i] = s.charAt(i);
        }
        for (char character : temp){
            if (hashMap.containsKey(character)){
                int x = (int) hashMap.get(character);
                hashMap.replace(character, x+1);
            }
            else{
                hashMap.put(character, 1);
            }
        }
        hashMap.values().removeAll(Collections.singleton(2));
        if (hashMap.isEmpty()){
            return index;
        }
        else{
        tempList.addAll(hashMap.keySet());
        ArrayList<Character> temp2 = new ArrayList<Character>();
        for (int i = 0; i < temp.length; i++){
            temp2.add(temp[i]);
        }
        int indexCount = 0;
        for (int i = 0; i < temp.length; i++){
            if (tempList.contains(temp2.get(i))){
                char ascii = temp2.get(i);
                index = (temp2.indexOf(ascii)) + indexCount;
                return index;
            }
            else{
                temp2.remove(i);
                indexCount++;
            }
        }
        System.out.println(tempList);
            return index;
        }
        }
        
    
    
    public static void main(String[] args){
        String string1 = "Cassie";
        firstUniqChar charObj = new firstUniqChar(string1);
        int index = charObj.findFirstUniqChar();
        System.out.println(index);
    }
}
