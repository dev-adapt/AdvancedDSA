package QuestionOfTheDay;
//3306
public class countSubstringsContainingEveryVowelAndKconstants {
    class Solution {
        public long countOfSubstrings( String word, int k ) {
    
            int n = word.length();
            char[] arr = word.toCharArray();
    
            long count = 0;
    
            int[] freq = new int[26];
            int con = 0;
    
            int left = 0;
            int start = 0;
            for( int right = 0; right < n; right ++ ) {
                
                if( arr[right] == 'a' || arr[right] == 'e' || arr[right] == 'i' || arr[right] == 'o' || arr[right] == 'u' ) {
                    freq[ arr[right] - 'a' ]++;
                }
                else {
                    con++;
                }
                
                while( con > k ) {
                    if( arr[left] == 'a' || arr[left] == 'e' || arr[left] == 'i' || arr[left] == 'o' || arr[left] == 'u' ) {
                        freq[ arr[left] - 'a' ]--;
                    }
                    else {
                        con--;
                    }
                    left++;
                    start = left;
                }
                
                
                while( freq[0] > 0 && freq[4] > 0 && freq[8] > 0 && freq[14] > 0 && freq[20] > 0 && con == k ) {
                    if( arr[left] == 'a' || arr[left] == 'e' || arr[left] == 'i' || arr[left] == 'o' || arr[left] == 'u' ) {
                        if( freq[ arr[left] - 'a' ] > 1 ) {
                            freq[ arr[left] - 'a' ]--;
                            left++;
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        break;
                    }
                }
                
                if( freq[0] > 0 && freq[4] > 0 && freq[8] > 0 && freq[14] > 0 && freq[20] > 0 && con == k ) {
                    count += left - start + 1;
                }
            }
    
    
            return count;
        }
    }
}
