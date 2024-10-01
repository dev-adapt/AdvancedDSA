public class sortPeople {
    public static String[] sortPeople1(String[] names, int[] heights) {
       int idx=0;
       int n=names.length;
        while(idx<n){
            int max=Integer.MIN_VALUE;
            int maxIndex=0;
            for(int i=idx;i<n;i++){
                max=Math.max(max, heights[i]);
                if(max==heights[i]){
                    maxIndex=i;
                }
             }
             String temp=names[idx];
             names[idx]=names[maxIndex];
             names[maxIndex]=temp;

             int tempnum=heights[idx];
             heights[idx]=heights[maxIndex];
             heights[maxIndex]=tempnum;
             idx++;
    }
    return names;
    }
    public static void main(String[] args) {
       String[] names = {"Mary","John","Emma"};
       int[] heights = {180,165,170};
       sortPeople1(names, heights);
      for(String i:names)System.out.println(i+" ");
    }
}
