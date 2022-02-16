import java.io.*;
import java.util.*;

public class mergeLinkedList {
     private LinkedList<Integer> list1;
     private LinkedList<Integer> list2;

    /**
     * Constructor for objects of class mergeLinkedList
     */
    public mergeLinkedList(LinkedList<Integer> list1In, LinkedList<Integer> list2In)
    {
        list1 = list1In;
        list2 = list2In;
    }
    
    public LinkedList mergeTwoLists(){
        LinkedList<Integer> temp = new LinkedList<Integer>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < list1.size(); i++){
            pQueue.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++){
            pQueue.add(list2.get(i));
        }
        int size = pQueue.size();
        for (int i = 0; i < size; i++){
            temp.add(pQueue.poll());
        }
             return temp;
        }

    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list2.add(1);
        list2.add(3);
        list2.add(4);
        mergeLinkedList linkedList = new mergeLinkedList(list1,list2);
        LinkedList list = linkedList.mergeTwoLists();
        System.out.println(list);
    }
}
