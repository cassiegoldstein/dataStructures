import java.util.*;
import java.io.*;

public class MaxPairProduct
{
    // instance variables - replace the example below with your own
    private int[] array;
    private int maxProduct;
    private int arrayLength;

    public MaxPairProduct(int[] arrayIn)
    {
        array = arrayIn;
        maxProduct = -1;
        arrayLength = array.length;
    }

    public int getMaxProduct()
    {
        for (int i = 0; i < arrayLength; i++){
            for (int j = i + 1; j < arrayLength; j++){
                maxProduct = Math.max(maxProduct, (array[i] * array[j]));
            }
        }
           return maxProduct; 
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.println("Enter elements for array: ");
            for (int i = 0; i < length; i++){
                array[i] = input.nextInt();
            }
        MaxPairProduct test = new MaxPairProduct(array);
        int maxProd = test.getMaxProduct();
        System.out.println(maxProd);
        
}
}

