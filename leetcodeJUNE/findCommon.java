package leetcodeJUNE;

import java.util.ArrayList;
import java.util.List;

//1002
public class findCommon {
    static List<String> commonChars(String[] words) {
        int[] res = new int[26];
        for (char c : words[0].toCharArray()) {
            res[c - 'a']++;
        }
        for (int i = 1 ; i < words.length ; i++) {
            String word = words[i];
            int[] tmp = new int[26];
            for (char c : word.toCharArray()) {
                tmp[c - 'a']++;
            }
            for (int j = 0 ; j < 26 ; j ++) {
                res[j] = Math.min(res[j], tmp[j]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0 ; i < res.length ; i ++) {
            while (res[i] -- > 0) { // post decrement operator checks if the value of res[i]>0 and then decreases its value as if there are 2 a res[0] ki value 2 hai to ak baar while check hone ke baad list me add hoga nd res[i] ki value 1 hojaegi or ak or a add hojaega list me
                list.add(((char)(i + 'a')) + "");
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String []words={"bella","label","roller"};
        System.out.println(commonChars(words));
    }
}
