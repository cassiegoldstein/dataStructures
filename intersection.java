import java.util.*;

public class intersection
{
    // instance variables - replace the example below with your own
    private int[] nums1;
    private int[] nums2;
    private ArrayList<Integer> temp;
    /**
     * Constructor for objects of class intersection
     */
    public intersection(int[] nums1In, int[] nums2In)
    {
        nums1 = nums1In;
        nums2 = nums2In;
        temp = new ArrayList();
        
    }

    public int[] findIntersection()
    {  
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num : nums1)
        {
            if(hashMap.containsKey(num))
            {
                int x = (int) hashMap.get(num);
                hashMap.replace(num,x+1);
            }
            else{
                hashMap.put(num,1);
            }
            System.out.println(hashMap);
        }
        for(int num : nums2)
        {
            if(hashMap.containsKey(num))
            {
                int x = (int) hashMap.get(num);
                if(x==1)
                {
                    hashMap.remove(num);
                }
                else
                {
                    hashMap.replace(num,x-num);
                }
                temp.add(num);
            }
        }
        int[] inter = new int[temp.size()];
        int counter = 0;
        for(int num : temp)
        {
            inter[counter] = num;
            counter++;
        }
        return inter;
    }

    
    public static void main(String[] args){
        int[] nums1 = {1,1,3,4};
        int[] nums2 = {1,0,1};
        intersection intersectionObj = new intersection(nums1,nums2);
        int[] inter = intersectionObj.findIntersection();
        System.out.println(Arrays.toString(inter));
    }
}   