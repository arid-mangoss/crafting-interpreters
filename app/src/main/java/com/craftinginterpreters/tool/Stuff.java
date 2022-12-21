package com.craftinginterpreters.tool;

import java.util.PriorityQueue;
import java.util.Queue;

public class Stuff {

    public static final class Thing {
        public int i;
        public int j;
    }

    public static void main(String[] args) {
        Queue<Thing> queue = new PriorityQueue<>((a, b) -> a.hashCode() - b.hashCode());

        queue.add(new Thing());
    }
}
