package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(7);
        queue.add(6);
        queue.add(9);
        queue.add(1);

        System.out.println(queue);
        queue.remove(2);                             // elementi silir.
        System.out.println(queue.peek());               // 1ci elementi silir.
        System.out.println(queue.poll());               // 1ci elementi qaytarır sonra silir.
        queue.offer(1);                              // elemrnti queue ə əlavə edir.
        System.out.println(queue);
    }
}
