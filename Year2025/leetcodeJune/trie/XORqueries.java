package Year2025.leetcodeJune.trie;

import java.util.*;;
public class XORqueries{
    class Node {
    Node[] links;

    Node() {
        links = new Node[2];
    }

    boolean containsKey(int ind) {
        return links[ind] != null;
    }

    Node get(int ind) {
        return links[ind];
    }

    void put(int ind, Node node) {
        links[ind] = node;
    }
}

class Trie {
    Node root;

    Trie() {
        root = new Node();
    }

    void insert(int num) {
        Node node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.containsKey(bit)) {
                node.put(bit, new Node());
            }
            node = node.get(bit);
        }
    }

    int findMax(int num) {
        Node node = root;
        int maxNum = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.containsKey(1 - bit)) {
                maxNum |= (1 << i);
                node = node.get(1 - bit);
            } else {
                node = node.get(bit);
            }
        }
        return maxNum;
    }
}

// Custom pair class to hold two elements
class Pair<A, B> {
    public A first;
    public B second;

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }
}
    public int[] maximizeXor(int[] arr, int[][] queries) {
         int[] ans = new int[queries.length];

        ArrayList<Pair<Integer, Pair<Integer, Integer>>> offlineQueries = new ArrayList<>();
        Arrays.sort(arr);

        int index = 0;
        for (int[] q : queries) {
            offlineQueries.add(new Pair<>(q[1], new Pair<>(q[0], index++)));
        }

        offlineQueries.sort(Comparator.comparingInt(p -> p.first));

        int i = 0, n = arr.length;
        Trie trie = new Trie();

        for (Pair<Integer, Pair<Integer, Integer>> query : offlineQueries) {
            while (i < n && arr[i] <= query.first) {
                trie.insert(arr[i]);
                i++;
            }

            if (i != 0) {
                ans[query.second.second] = trie.findMax(query.second.first);
            } else {
                ans[query.second.second] = -1;
            }
        }

        return ans;
    }
}
