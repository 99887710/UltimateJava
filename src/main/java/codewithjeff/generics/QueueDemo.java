package codewithjeff.generics;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

//        queue.add(1);
//        queue.add(2);
            queue.poll();
        System.out.println(queue);
    }
}
