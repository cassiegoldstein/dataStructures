import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Solution {
    
        //properties
        private int[] nums;
        private boolean trueOrFalse;
        
        //constructor method
        public Solution(int[] numsIn){
            nums = numsIn;
            trueOrFalse = true;
        }
    
        public void determineIfTrueOrFalse(){
            Set<Integer> mySet = new HashSet<Integer> ();
            int arraySize = (nums.length);
            System.out.println(arraySize);
            for (int i = 0; i < arraySize; i++){
                mySet.add(nums[i]);
            }
            System.out.println(mySet);
            int setSize = mySet.size();
            if (setSize < arraySize){
                trueOrFalse = true;
            }
            else if (setSize == arraySize){
                trueOrFalse = false;
            }
            else{
                System.out.println("Error");
            }
            
        }
    
        public boolean getTrueOrFalse(){
            System.out.println(trueOrFalse);
            return trueOrFalse;
        }

    }