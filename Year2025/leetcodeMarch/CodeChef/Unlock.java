// package CodeChef;
// import java.util.*;

// public class Unlock {
//     static class Pair {
//         int up;
//         int down;

//         public Pair(int up, int down) {
//             this.up = up;
//             this.down = down;
//         }
//     }

//     public static void main(String[] args) {
//         HashMap<Integer, Pair> mp = new HashMap<>();

//         mp.put(1, new Pair(2, 9));
//         mp.put(2, new Pair(3, 1));
//         mp.put(3, new Pair(4, 2));
//         mp.put(4, new Pair(5, 3));
//         mp.put(5, new Pair(6, 4));
//         mp.put(6, new Pair(7, 5));
//         mp.put(7, new Pair(8, 6));
//         mp.put(8, new Pair(9, 7));
//         mp.put(9, new Pair(1, 8));

//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();

//         for (int t = 0; t < T; t++) {
//             int N = sc.nextInt();
//             int K = sc.nextInt();

//             int[] incorrect = new int[N];
//             for (int i = 0; i < N; i++) {
//                 incorrect[i] = sc.nextInt();
//             }

//             int[] correct = new int[N];
//             for (int i = 0; i < N; i++) {
//                 correct[i] = sc.nextInt();
//             }
// 			if (check( incorrect, correct, K, mp)) {
				
// 			}
//         }
//     }

//     static boolean check(int[] incorrect, int[] correct, int K, HashMap<Integer, Pair> mp) {
//        // boolean flag = false;
//         int i = 0;
//         while (i < K) {
//             if (incorrect[i] != correct[i]) {
//                 if (!mp.containsKey(incorrect[i])) return false;

//                 int up = mp.get(incorrect[i]).up;
//                 int down = mp.get(incorrect[i]).down;

//                 int moves1 = Math.abs(correct[i] - up);
//                 int moves2 = Math.abs(correct[i] - down);

//                 i += Math.min(moves1, moves2);

//                 if (i >= K) return false;
//             }
//         }
//         return true;
//     }
// }
package CodeChef;

import java.util.*;


public class Unlock
{
    class Pair {
		int up;
		int down;
	
	   public Pair(int up, int down) {
		   this.up =up;
		   this.down = down;
	   }
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		HasMap<Integer,Pair<Integer, Integer>>mp=new HasMap<>();
		
		mp.put(1,new Pair<>(2,9));
		mp.put(2,new Pair<>(3,1));
		mp.put(3,new Pair<>(4,2));
		mp.put(4, new Pair(5, 3));
        mp.put(5, new Pair(6, 4));
        mp.put(6, new Pair(7, 5));
        mp.put(7, new Pair(8, 6));
        mp.put(8, new Pair(9, 7));
        mp.put(9, new Pair(1, 8));
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		 
		for(int i=0;i<T;i++){
		    	int N = sc.nextInt();
		    	int K = sc.nextInt();
		    	
		    	int incorrect[]=new int[N];
		    	for(int j=0;j<N;j++){
		    	    incorrect[j]=sc.nextInt();
		    	}
		    	
		    	int correct[]=new int[N];
		    	for(int j=0;j<N;j++){
		    	    correct[j]=sc.nextInt();
		    	}
		    	
		    
		}

	}
	static boolean check(int[]incorrect,int[]correct,int K,	HasMap<Integer,Pair<Integer, Integer>>mp,int N){
	    boolean flag=false;
	    int i=0;
	    while(i<K){
	       for(int i=0;i<N;i++)  { if(incorrect[i]!=correct[i]){
	             int up= mp.get(incorrect[i]).up;
	             int down= mp.get(incorrect[i]).down;
	            
	            if(correct[i]>up && correct[i]>down) {
	             int moves1=correct[i]-up;
	             int moves2=correct[i]-down;
	             if(moves1<moves2){
	                 i+=moves1;
	             }else i+=moves2;
	       
	                
	            }else if(correct[i]<up && correct[i]<down){
	                int moves1=up-correct[i];
	                int moves2=down-correct[i];
	                if(moves1<moves2) i+=moves1;
	                else i+=moves2;
	            }
	            else if(correct[i]<up && correct[i]>down){
	                int moves1=up-correct[i];
	                int moves2=correct[i]-down;
	                if(moves1<moves2) i+=moves1;
	                else i+=moves2;
	            } else if(correct[i]>up && correct[i]<down){
	                int moves1=correct[i]-up;
	                int moves2=down-correct[i];
	                if(moves1<moves2) i+=moves1;
	                else i+=moves2;
	            }
	            if(i>=K)return false;
			}
	        }
	        return true;
	    }
	}

}
// import java.util.*;

// class Codechef {
//     public static class Pair {
//         public int up;
//         public int down;

//         public Pair(int up, int down) {
//             this.up = up;
//             this.down = down;
//         }
//     }

//     public static void main(String[] args) throws java.lang.Exception {
//         // Create movement rules
//         HashMap<Integer, Pair> mp = new HashMap<>();
//         mp.put(1, new Pair(2, 9));
//         mp.put(2, new Pair(3, 1));
//         mp.put(3, new Pair(4, 2));
//         mp.put(4, new Pair(5, 3));
//         mp.put(5, new Pair(6, 4));
//         mp.put(6, new Pair(7, 5));
//         mp.put(7, new Pair(8, 6));
//         mp.put(8, new Pair(9, 7));
//         mp.put(9, new Pair(1, 8));

//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt(); // Number of test cases

//         while (T-- > 0) {
//             int N = sc.nextInt();
//             int K = sc.nextInt();

//             int[] incorrect = new int[N];
//             for (int i = 0; i < N; i++) {
//                 incorrect[i] = sc.nextInt();
//             }

//             int[] correct = new int[N];
//             for (int i = 0; i < N; i++) {
//                 correct[i] = sc.nextInt();
//             }

//             if (canUnlock(incorrect, correct, K, mp, N)) {
//                 System.out.println("Yes");
//             } else {
//                 System.out.println("No");
//             }
//         }
//         sc.close();
//     }

//     static boolean canUnlock(int[] incorrect, int[] correct, int K, HashMap<Integer, Pair> mp, int N) {
//         int totalMoves = 0;

//         for (int i = 0; i < N; i++) {
//             if (incorrect[i] == correct[i]) {
//                 continue; // No movement needed
//             }

//             if (!mp.containsKey(incorrect[i])) {
//                 return false; // Impossible to move
//             }

//             int up = mp.get(incorrect[i]).up;
//             int down = mp.get(incorrect[i]).down;

//             // If the target is either 'up' or 'down', it's reachable
//             if (correct[i] != up && correct[i] != down) {
//                  if(correct[i]>up && correct[i]>down) {
// 	             int moves1=correct[i]-up;
// 	             int moves2=correct[i]-down;
// 	             if(moves1<moves2){
// 	                 i+=moves1;
// 	             }else i+=moves2;
	       
	                
// 	            }else if(correct[i]<up && correct[i]<down){
// 	                int moves1=up-correct[i];
// 	                int moves2=down-correct[i];
// 	                if(moves1<moves2) i+=moves1;
// 	                else i+=moves2;
// 	            }
// 	            else if(correct[i]<up && correct[i]>down){
// 	                int moves1=up-correct[i];
// 	                int moves2=correct[i]-down;
// 	                if(moves1<moves2) i+=moves1;
// 	                else i+=moves2;
// 	            } else if(correct[i]>up && correct[i]<down){
// 	                int moves1=correct[i]-up;
// 	                int moves2=down-correct[i];
// 	                if(moves1<moves2) i+=moves1;
// 	                else i+=moves2;
// 	            }
// 	            if(i>=K)return false;
//             }

//             int moves1 = Math.abs(correct[i] - up);
//             int moves2 = Math.abs(correct[i] - down);
//             totalMoves += Math.min(moves1, moves2);

//             if (totalMoves > K) {
//                 return false;
//             }
//         }
//         return totalMoves <= K;
//     }
// }