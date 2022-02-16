import java.util.*;
import java.lang.*;

public class maxSubArray
{
    private int[] nums;
    private int numsLength;
    private int maxNum;
    private int sum;
    
    public maxSubArray(int[] numsIn)
    {
        nums = numsIn;
        numsLength = nums.length;
        maxNum = nums[0];
        sum = 0;
        
    }
    
    public int determineMaxSubArray(){
        for (int i = 0; i<numsLength; i++){
            sum += nums[i];
            maxNum = Math.max(sum,maxNum);
        }
        return maxNum;
        }
    }
    
    
