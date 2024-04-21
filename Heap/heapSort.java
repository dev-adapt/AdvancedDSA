package Heap;
import java.util.*;
public class heapSort {
    static void heapSorting(List<Integer>heap){
        heapify(heap);
        int n=heap.size()-1;
        for(int i=n;i>0;i--){
            swap(heap, 0, i);
            pushDown(heap,0, i-1);
        }
    }
    static void heapify(List<Integer>heap){
        int firstNonLeafNode=((heap.size()-1)-1)/2; //parent=(i-1)/2
        for(int i=firstNonLeafNode;i>=0;i--){
            pushDown(heap, i,heap.size()-1);
        }
    }
    static void pushDown(List<Integer>heap,int i,int n){
      if(i==n)return;
        int lchild=(i*2)+1,rchild=(i*2)+2;
        int biggest=i;
        if(i>=heap.size()-1)return;
        if(lchild<=n&&heap.get(lchild)>heap.get(biggest)){
        biggest=lchild;
        }
        if(rchild<=n&&heap.get(rchild)>heap.get(biggest)){
       biggest=rchild;
        }if(biggest==i)return;
       swap(heap, biggest, i);
       pushDown(heap, biggest,n);
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
        heapSorting(heap);
        System.out.println(heap);
    }
}
