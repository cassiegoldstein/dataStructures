import java.util.Arrays;
import java.util.Scanner;

public class twoSum
{
    private int[] nums;
    private int target;
    private int[] index;
    
    public twoSum(int[] numsIn, int targetIn)
    {
      nums = numsIn;
      target = targetIn;
      index = new int[2];
    }
    
    public int[] determineTwoSum(){
        for(int i=0; i<nums.length; i++){
            for (int j = 0; j<nums.length; j++){
                int x = nums[i];
                int y = nums[j];
                int toTest = x + y;
                if (toTest == target){
                    index[0] = x;
                    index[1] = y;
                }
                }
            }
            return index;
        }
    }
