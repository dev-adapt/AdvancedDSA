package leetcode;

public class trappingRainwater {
    static int trap(int[]height){
        if(height==null)return 0;
        int water=0;
        int left[]=new int[height.length];
        int right[]=new int [height.length];
        left[0]=height[0];
        for(int i=1;i<left.length;i++){
            if(left[i-1]<height[i])left[i]=height[i];
            else left[i]=left[i-1];
        }
        right[right.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            if(right[i+1]<height[i])right[i]=height[i];
            else right[i]=right[i+1];
        }
        for(int i=0;i<height.length;i++){
            int currWater=0;
            currWater=Math.min(right[i],left[i])-height[i];
            if(currWater>0)water+=currWater;
        }
        return water;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
