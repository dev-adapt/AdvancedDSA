package leetcodeJUNE;
//409
public class longestPalindrome {

    static int longestPal(String s){
        int bigOdd=0,idx=0;
        int arr[]=new int [123];
 
        for(int i=0;i<s.length();i++){
            int ascii=(int)s.charAt(i);
            arr[ascii]++;
        }
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0 && bigOdd<arr[i]){
                idx=i;
            }
        }
        bigOdd=arr[idx];
        arr[idx]=0;
        for(int i=0;i<123;i++){
            if(arr[i]%2==0)even+=arr[i];
            else odd+=arr[i]-1;
        }

        return even+odd+bigOdd;
    }
    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPal(s));
        
    }
}
