import java.util.*;

public class anagram
{
    // instance variables - replace the example below with your own
    private String string1;
    private String string2;
    private boolean bool;

    /**
     * Constructor for objects of class anagram
     */
    public anagram(String string1In, String string2In)
    {
       string1 = string1In;
       string2 = string2In;
       bool = false;
    }

    public boolean isAnagram()
    {
        char[] temp1 = new char[string1.length()];
        char[] temp2 = new char[string2.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        if (string1.length() != string2.length()){
            return bool;
        }
        else{
        for (int i = 0; i < string1.length(); i++){
            temp1[i] = string1.charAt(i);
            temp2[i] = string2.charAt(i);
        }
        int x = 1;
        for (char character : temp1){
            hashMap.put(character, x);
            x= x+1;
        }
        for(char character: temp2){
            if(hashMap.containsKey(character)){
                hashMap.remove(character);
            }
        }
        if (hashMap.isEmpty()){
            bool = true;
        }
            return bool;
    }
}

public static void main(String[] args){
        String string1 = "eassic";
        String string2 = "cassie";
        anagram anagramObj = new anagram(string1,string2);
        boolean bool = anagramObj.isAnagram();
        System.out.println(bool);
    }
}
