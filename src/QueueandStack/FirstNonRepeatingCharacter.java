/**
 * @author Aayush Patel
 * @email aayushpatel1921@gmail.com
 * Q) First non repeating character in a stream of charaters ???
 * Input:-
 * c b a b c a d b d
 * Output:-
 * c c c c a -1 d d -1
 */
package QueueandStack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        //Character will be the key and Integer will be the value of the corresponding character
        HashMap<Character, Integer> map = new HashMap<>();
        //Queue is the interface here and we're using implementation of a LinkedList as a Queue
        Queue<Character> queue = new LinkedList<>();

        // this . character denote the end of the stream
        while (ch!='.'){
            queue.add(ch);
            //check frequency map
            if(map.containsKey(ch)){
                int oldval = map.get(ch);
                oldval=oldval+1;
                map.put(ch,oldval);
            }
            else {
                map.put(ch,1);
            }

            // Check first non repeating character
            while (!queue.isEmpty()){
                char firstchar = queue.peek();
                //check the freq is 1 or not
                if(map.get(firstchar)==1){
                    System.out.println(firstchar);
                    break;
                }
                // if it doesn't have the freq of 1 then remove the element from queue
                else {
                    queue.poll();
                }
            }

            //if there's no non repeating character in the queue
            if(queue.isEmpty()){
                System.out.println("-1");
            }
            //take the character by this line until and unless user terminate the program by . character
            ch = sc.next().charAt(0);
        }
    }
}
