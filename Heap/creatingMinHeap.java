package Heap;
import java.util.*;
public class creatingMinHeap {
    static void swap(List<Integer>heap,int l,int r){
        int temp=heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }

    static void pushUp(List<Integer>heap,int i){
        int parentIdx=(i-1)/2;
        if(i==0|| heap.get(parentIdx)<heap.get(i))return;
        swap(heap,i,parentIdx);
        pushUp(heap, parentIdx);
    }
    static void insertInMinHeap(List<Integer>heap,int element){
        //last me add
        heap.add(element);
        int idx=heap.size()-1;
        pushUp(heap, idx);
    }
    public static void main(String[] args) {
        List<Integer>heap=new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        int element=5;
        insertInMinHeap(heap, element);
        System.out.println(heap);
        int elt=25;
        insertInMinHeap(heap, elt);
        System.out.println(heap);

    }
}
