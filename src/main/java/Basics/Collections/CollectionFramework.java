package Basics.Collections;

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args)
    {
//        hashMap();

//        array();
//        priorityQueue();
        set();

    }

    public static void set() {
        Set<String> x = new HashSet<>();

        x.add("ad");
        x.add("ad2");

        List<String> y =  new ArrayList<String>(x);

        System.out.println(y.get(1));
    }

    private static void hashMap() {
        Map<String, String> x = new HashMap<>();

//        yes is posible to use null has key
        //Diamont operator <T>
        x.put(null, "algo");
        x.put(null, null);

        System.out.println(x);
        System.out.println(x.get(null));
    }

    public static void priorityQueue() {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        pQueue.forEach(System.out::println);

        System.out.println(pQueue);
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container

        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        // Printing the top element again
        System.out.println(pQueue.peek());
    }

    public static void dequeue() {

    }

    public static void array() {
        List<Integer> x = new ArrayList<>();

        x.add(0);
        x.add(1);
        x.add(2);

        for (int i =0; i <x.size(); i++) {
            System.out.println(i);
            System.out.println(x.get(i));
        }
    }
}
