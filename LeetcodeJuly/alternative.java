//package LeetcodeJuly;
public class alternative {
    public static int numberOfAlternatingGroups(int[] colors) {
        int ans=0;
        int n=colors.length;
        for(int i=1;i<n-1;i++){
            if(colors[i-1]!=colors[i]&&colors[i]!=colors[i+1])ans++;
        }
        if(colors[0]!=colors[n-1]&&colors[0]!=colors[1])ans++;
        if(colors[n-2]!=colors[n-1]&&colors[n-1]!=colors[0])ans++;
        return ans;
    }

    public static void main(String[] args) {
        int colors[]={0,1,0,0,1};
        System.out.println(numberOfAlternatingGroups(colors));
    }
}
