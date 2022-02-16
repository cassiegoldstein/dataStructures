
import java.util.*;

public class reverseLL
{
    public LinkedList reverse(LinkedList headIn)
    {
        LinkedList<Integer> head = headIn;
        LinkedList<Integer> temp = new LinkedList<Integer>();
        int size = head.size();
        int count = size;
        for (int i = 0; i < size; i++){
            temp.add(head.get(count-1));
            count--;
        }
        return temp;
    }
    
    public static void main(){
        reverseLL revObj = new reverseLL();
        LinkedList<Integer> head = new LinkedList<Integer>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        LinkedList<Integer> head2 = revObj.reverse(head);
        System.out.println(head2);
    }
}
