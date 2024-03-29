package day49_Collection;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {


        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,30,40,90));

        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        System.out.println("---------------------------");

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

        linkedList.poll();
        System.out.println("linkedList = " + linkedList);

        arrayDeque.poll();
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println("------------------------------");

        //get() method error verir queue de

        // upcasting yapmamız gerekşyor linkedlistte System.out.println((List)linkedList).get(0));



    }
}
