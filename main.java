import java.util.Arrays;
import java.util.Scanner;

public class main{

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of elements in array:  ");
    int elements = input.nextInt();
    int[] nums =  new int[elements];
    System.out.println("Enter the integers in the array: ");
    for (int i=0; i<elements; i++){
        nums[i] = input.nextInt();
    }
    maxSubArray maxSub = new maxSubArray(nums);
    int max = maxSub.determineMaxSubArray();
    System.out.println(max);
    } 

}