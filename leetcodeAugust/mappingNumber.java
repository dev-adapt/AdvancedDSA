 package leetcodeAugust;
public class mappingNumber {
    public static int minimumPushes(String word) {
        int count=0;
      char[]arr=word.toCharArray();
      int[]freq=new int[26];
        for(char i:arr){
            int curr=i-'a';
            freq[curr]++;
        }
        

        return count;
    }
    public static void main(String[] args) {
        String word = "aabbccddeeffgghhiiiiii";
        System.out.println(1/8);
        System.out.println(minimumPushes(word));
    }
}