// package Heap;

// import java.util.*;

// public class heapifyMIN{
//     static void heapify(List<Integer>heap){
        
//     }
//     static void pushDown(List<Integer>heap,int i){
//         int last=heap.size()-1;
//         int lchild=(i*2)+1,rchild=(i*2)+2;
//         if(i>=heap.size()-1)return;
//         if(lchild<=last&&heap.get(lchild)<heap.get(i)){
//         swap(heap, lchild, i);
//         pushDown(heap, lchild);
//         }
//         if(rchild<=last&&heap.get(rchild)<heap.get(i)){
//         swap(heap, rchild, i);
//         pushDown(heap, rchild);
//         }
        
//     }
//     static void swap(List<Integer>heap,int l,int r){
//         int temp=heap.get(l);
//         heap.set(l, heap.get(r));
//         heap.set(r, temp);
//     }
//     public static void main(String[] args) {
//         List<Integer>heap=new ArrayList<>();

//     }
//  }