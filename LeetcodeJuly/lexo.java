public class lexo {
    // public static String getSmallestString(String s) {
    //     int maxIdx=Integer.MIN_VALUE;
    //     for(int i=1;i<s.length();i++){
    //       int prev=s.charAt(i-1)-48;
    //       int curr=s.charAt(i)-48;
    //       if(curr>prev){maxIdx=i;
    //        break;
    //         }
    //     }
    //     StringBuilder sb=new StringBuilder(s);
    //     char switching=sb.charAt(maxIdx-1);
       
       
    //     return s;
    // }  
    //char[] chars = s.toCharArray();
//     char[] chars = s.toCharArray();
//     int n = chars.length;
        
  
//     for (int i = 0; i < n - 1; i++) {
//         char current = chars[i];
//         char next = chars[i + 1];
        
//         // Check if current and next have the same parity
//         if (isSameParity(current, next)) {
//             char temp = chars[i];
//             chars[i] = chars[i + 1];
//             chars[i + 1] = temp;
//             break; 
//         }
//     }
    
//     return new String(chars);
// }

// private static boolean isSameParity(char a, char b) {
  
//     int digitA = a - '0';
//     int digitB = b - '0';
//     return (digitA % 2 == 0 && digitB % 2 == 0) || (digitA % 2 != 0 && digitB % 2 != 0);
// }
public static String findLexSmallestString(String s) {
    char[] chars = s.toCharArray();
    int n = chars.length;
    
    // Iterate through the string to find the first valid pair of adjacent digits
    for (int i = 0; i < n - 1; i++) {
        char current = chars[i];
        char next = chars[i + 1];
        
        // Check if current and next have the same parity
        if (isSameParity(current, next)) {
            // Swap them to get the lexicographically smallest string
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
            return new String(chars); // Return the modified string
        }
    }
    
    // If no swap was made, return the original string
    return new String(chars);
}

// Helper function to check if two digits have the same parity
private static boolean isSameParity(char a, char b) {
    // Convert char to integer
    int digitA = a - '0';
    int digitB = b - '0';
    
    // Check if both digits are odd or both are even
    return (digitA % 2 == 0 && digitB % 2 == 0) || (digitA % 2 != 0 && digitB % 2 != 0);
}
    public static void main(String[] args) {
        String s="13";
        System.out.println(findLexSmallestString(s));
    }
}
