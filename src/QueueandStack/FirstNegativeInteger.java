/**
 * @author Aayush Patel
 * @email aayushpatel1921@gmail.com
 * Q) First negative integer in every window of size k ???
 * Input:-
 * 12, -1, -7, 8, -15, 30, 16, 28
 * 3
 * Output:-
 * -1 -1 -7 -15 -15 0
 *
 * Input:-
 *  12, -1, -7, 8, -15, 30, 16, 28
 *  4
 *  Output:-
 *  -1 -1 -7 -15 -15
 */
package QueueandStack;

import java.util.LinkedList;

public class FirstNegativeInteger {
    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 4;
        int i;
        LinkedList<Integer> queue = new LinkedList<>();
        //Putting the indexes of the array in the queue which contain negative value
        for(i=0; i<k; i++){
            if(arr[i]<0){
                queue.addLast(i);
            }
        }
        //Print the first or front index present inside the queue which contain negative value
        for (;i<arr.length;i++){
            if(!queue.isEmpty()){
                System.out.print(arr[queue.peek()]+ " ");
            }
        //If the arr is like this {12,1,17,-8}  so above code won't get the -ve value then 0 will print
            else {
                System.out.print("0 ");
            }
        //Window will get changed by now so here we check that front element of queue is <= i-k if this
        // condition satisfy then we've to delete front element so we can print other -ve values
            while (!queue.isEmpty() && queue.peek() <= i-k){
                queue.removeFirst();
            }
            if(arr[i]<0){
                queue.addLast(i);
            }
        }

        if (!queue.isEmpty()){
            System.out.print(arr[queue.peek()]+" ");
        }
        else {
            System.out.print("0 ");
        }
    }
}
