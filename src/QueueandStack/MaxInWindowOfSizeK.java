/**
 * @author Aayush Patel
 * @email aayushpatel1921@gmail.com
 * Input:-
 * 7
 * 12 1 78 90 57 89 56
 * 3
 *
 * Output:-
 * 78 90 90 90 89
 */
package QueueandStack;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxInWindowOfSizeK {
    public static void printMax(int[] arr, int k){
        Deque<Integer> q = new LinkedList<>(); // to achieve the functionality of dequeue in Java we used LinkedList
        int i;
        //first window of size k
        for (i=0;i<k;i++){
            while (!q.isEmpty()&&arr[i]>arr[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        //Next window
        for (;i< arr.length;i++){
            //shows ans from the previous window or give the first value present in dequeue
            System.out.print(arr[q.getFirst()]+" ");
            //Current Window
            while (!q.isEmpty()&&q.getFirst()<=i-k){
                q.removeFirst();
            }

            while (!q.isEmpty()&&arr[i]>arr[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        //Print the ans foe the last window
        System.out.print(arr[q.getFirst()]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new  int[n];
        for (int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        printMax(arr,k);
    }
}
