package Heap;
import java.util.*;
public class deletionMaxHeap {
    static void deletionMax(List<Integer>heap){
        //in case of deletion the first elt will get deleted
        int last=heap.size()-1;
        swap(heap, 0,last);
        heap.remove(last);
        pushDown(heap, 0);
    }
    static void pushDown(List<Integer>heap,int i){
        int last=heap.size()-1;
        int lchild=(i*2)+1,rchild=(i*2)+2;
        if(i>=heap.size()-1)return;
        if(lchild>=last&&heap.get(lchild)>heap.get(i)){
        swap(heap, lchild, i);
        pushDown(heap, lchild);
        }
        if(rchild>=last&&heap.get(rchild)>heap.get(i)){
        swap(heap, rchild, i);
        pushDown(heap, rchild);
        }
        
    }
    static void swap(List<Integer>heap,int l,int r){
        int temp=heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
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
    deletionMax(heap);
    System.out.println(heap);
    }
}
