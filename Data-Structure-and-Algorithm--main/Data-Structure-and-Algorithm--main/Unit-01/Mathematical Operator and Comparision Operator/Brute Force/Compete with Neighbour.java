/*Description

You are provided an arrayarrwhich hasnintegers.

You need to find the count of all such integers in array which are larger than its neighbours.

Neighbours of a integer in array are its adjacent integers. Check hint for more understanding.


Input
Input Format :

First line of input contains N which is the number of elements present in the array.

Second line contains N integer which are the elements of the array A.

Constraints :

2 <= N <= 100


Output
Output one integer which is the count of such integers.


Sample Input 1 

8
1 2 3 4 2 1 6 5
Sample Output 1

2
Hint

Output Explanation :

Neighbour of 1 is 2.

Neighbours of 2 are 1 and 3.

Neighbours of 3 are 2 and 4.

Neighbours of 4 are 3 and 2.

Neighbours of 2 are 4 and 1.

Neighbours of 1 are 2 and 6.

Neighbours of 6 are 1 and 5.

Neighbour of 5 is 6.

So in this case, 4 is bigger than both its neighbour 3 and 2.

Similarly 6 is bigger than both its neighbour 5 and 1.

So, the answer is 2.*/
public static void competeWithNeighbour(int N, int A[]){
    //write your code here
     int s = 0; 
    for (int i = 0; i < N; i++){
     int flag = 0;
      if(i+1<N){
        if (A[i] <= A[i+1]){
            flag = 1;}}
        if (i-1 >= 0){
       if (A[i] <= A[i-1]){
           flag = 1;}}
           if (flag == 0){
               s++;}}
     System.out.println(s);}
