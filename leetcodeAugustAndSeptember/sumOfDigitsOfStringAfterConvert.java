package leetcodeAugustAndSeptember;
public  class sumOfDigitsOfStringAfterConvert {
    public static int getLucky(String s, int k) {
     
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'a';
            num+=1;
            st.append(num);
        }
        long number=Long.parseLong( st.toString());
        long transform=0;
        for(int i=0;i<k;i++){
            long mid=transform;
           while(number>0){ mid+=number%10;
            number/=10;
        }
       transform=mid;
       number=mid;
        System.out.println(transform+" "+number);
        }
        return (int)transform;
    }
    public static void main(String[] args) {
        String s="leetcode";
        int k=2;
        System.out.println(getLucky(s, k));
    }
}
