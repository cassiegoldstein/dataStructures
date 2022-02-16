
/**
 * @Cassie Goldstein
 * @02/03/2022
 */

import java.util.Arrays;

public class incrementArray
{
    private int[] array;
    
    public incrementArray(int[] arrayIn)
    {
        array = arrayIn;
    }

    public void increment()
    {
        for (int i = 0; i < array.length; i++){
                int elem = array[i];
                elem += 1;
                array[i] = elem;
            }
            System.out.println(Arrays.toString(array));
    }
}
