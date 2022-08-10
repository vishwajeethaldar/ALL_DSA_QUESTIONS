/*
Description

New Year Celebration is coming near and DG is hosting a party for it, To make sure the party goes well she wants order in the party.There are two counters one of ice-cream and other for Cold-drinks.

On ice-cream counter the line was formed in form of Queue and on drinks counter the line was formed in order of Stacks.

She gave the management of the party to NV, NV made a plan to ask the manager following types of query.

Query types:

1 X : Number X enter the Queue.

2 X : Number X enter the Stack.

3: Output whoever is in-front of the queue.

4: Output whoever is on-top of the stack

5: Which person is in-front of queue get out of queue and enters the stack.

Note: If the Queue or Stack is empty then output "-1"


Input
Input Format :

The first line of input will contain Q, which is the number queries.

The next Q lines will different queries based upon query types given.



Constraints :

1<=Q<=10^5

1<=X<=10^9


Output
Output will consist of integers based upon Query types.If Query type is 3 then Output whoever is in-front of the queue, if Query type is 4 Output whoever is on-top of the stack.


Sample Input 1 

7
1 4
2 3
1 2
3
4
5
4
Sample Output 1

4
3
4*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Queue<Integer> qu = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < num; i++) {
            int query_type = sc.nextInt();
            if (query_type == 1) {
            int nm1 = sc.nextInt();
                qu.add(nm1);
            } else if (query_type == 2) {
                int nm2 = sc.nextInt();
                st.push(nm2);
            } else if (query_type == 3) {
                if (qu.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(qu.peek());
                   }
                } else if (query_type == 4) {
                if (st.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(st.peek());
                    }
                  } else {
                int removeNow = qu.remove();
                st.push(removeNow);
            }
            
        }
    }
}
