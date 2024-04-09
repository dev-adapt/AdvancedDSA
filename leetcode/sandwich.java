package leetcode;
import java.util.*;
public class sandwich {
 /*
  *    static int countStudents(int[] students, int[] sandwiches) {
        int count[] = {0, 0}, n = students.length, k;
        for (int a: students)
            count[a]++;
        for (k = 0; k < n && count[sandwiches[k]] > 0; ++k)
            count[sandwiches[k]]--;
        return n - k;
    }
  */
  static int countStudents(int[] students, int[] sandwiches) {
    Deque<Integer> sandwichesStack = new LinkedList<>();
    Queue<Integer> studentsQueue = new LinkedList<>();
    for (int i = sandwiches.length - 1; i >= 0; i--) {
        sandwichesStack.push(sandwiches[i]);
    }
    for (int j : students) {
        studentsQueue.add(j);
    }

    int counter = 0;
    while (!sandwichesStack.isEmpty()) {
        int student = studentsQueue.remove();
        if (sandwichesStack.peek() == student) {
            sandwichesStack.pop();
            counter = 0;
        } else {
            studentsQueue.offer(student); //using offer rather than add bcz it adds elt in the queue without throwing exceptions and returns false in case if the stack sixe is full
            counter++;
            if (counter == studentsQueue.size()) {
                return counter;
            }
        }
    }

    return 0;
}

    public static void main(String[] args) {
        int[]student={1,1,0,0};
        int[]sandwiches={0,1,0,1};
        System.out.println(countStudents(student,sandwiches));
    }
}
