package Heap;
import java.util.*;
public class creatingMaxHeap {
    static void swap(List<Integer>heap,int l,int r){
        int temp=heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    static void pushingUp(List<Integer>heap,int i){
        int parent=(i-1)/2;
        //base case
        if(i==0||heap.get(i)<heap.get(parent))return;
       swap(heap, i, parent);
       //doing recursive work
       pushingUp(heap, parent);
    }
    static void insertionMaxHeap(List<Integer>heap,int element){
        //adding the element at the end
        heap.add(element);
        int idx=heap.size()-1;
        //now lets find its correct position
        pushingUp(heap, idx);
    }
    public static void main(String[] args) {
        List<Integer>heap=new ArrayList<>();
        heap.add(50);
        heap.add(30);
        heap.add(20);
        heap.add(10);
        heap.add(15);
        heap.add(5);
        System.out.println(heap);
        int element=70;
        insertionMaxHeap(heap, element);
        System.out.println(heap);
       
    }
}
