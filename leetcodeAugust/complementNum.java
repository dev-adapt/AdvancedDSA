package leetcodeAugust;
public class complementNum {
    static int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder(binary);
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                sb.replace(i, i+1,"1");
            }else{
                sb.replace(i, i+1,"0");
            }
        }
        return Integer.parseInt(sb.toString(),2);
        /*
         * sb.toString(): This is the string representation of the number. In this case, it's the binary representation of the input number with all bits flipped (i.e., 0 becomes 1 and 1 becomes 0).

2: This is the radix or base of the number. In this case, it's 2, which means the string is a binary number (base 2).

So, Integer.parseInt(sb.toString(), 2) takes the binary string, interprets it as a binary number, and returns its integer equivalent.
         */
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(findComplement(num));
    }
}
