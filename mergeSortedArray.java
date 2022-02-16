import java.util.*;

class mergeSortedArray {
    
    private int[] nums1;
    private int[] nums2;
    private int m;
    private int n;
    private int nums1Len;
    private int nums2Len;
    
    public mergeSortedArray(int[] nums1In, int nIn, int mIn, int[] nums2In)
    {
      nums1 = nums1In;
      nums2 = nums2In;
      n = nIn;
      m = mIn;
    }
    
    public void merge(){
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++){
            if (nums1[i] != 0){
            pQueue.add(nums1[i]);
        }
        }
        for (int i = 0; i < m; i++){
            if (nums1[i] != 0){
            pQueue.add(nums2[i]);
        }
        }
        for (int i = 0; i < n + m; i++){
            nums1[i] = pQueue.poll();
        }
        System.out.println(Arrays.toString(nums1));
        
    }
    
    
    public static void main(String[] args){
        int n = 3;
        int m = 3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        mergeSortedArray mergeSorted = new mergeSortedArray(nums1, n, m, nums2);
        mergeSorted.merge();
        
    }
}