import java.util.*;
import java.io.*;

public class remLinkedListElems
{
    // instance variables - replace the example below with your own
    private LinkedList<Integer> head;
    private int value;

    /**
     * Constructor for objects of class remLinkedListElems
     */
    public remLinkedListElems(LinkedList<Integer> headIn, int valueIn)
    {
        head = headIn;
        value = valueIn;
    }

   
    public LinkedList removeElement()
    {
        LinkedList<Integer> temp = new LinkedList<Integer>();
        int size = head.size();
        for (int i = 0; i < size; i++){
            if (head.get(i) != value){
                temp.add(head.get(i));
            }
        }
        return temp;
    }
    
    public static void main(String[] args){
        LinkedList<Integer> head = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to remove: ");
        int value = scanner.nextInt();
        head.add(1);
        head.add(2);
        head.add(6);
        head.add(3);
        head.add(4);
        head.add(5);
        head.add(6);
        remLinkedListElems remObj = new remLinkedListElems(head, value);
        LinkedList list = remObj.removeElement();
        System.out.println(list);
    }
}
