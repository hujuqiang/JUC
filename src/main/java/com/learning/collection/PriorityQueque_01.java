package com.learning.collection;

import java.util.PriorityQueue;

public class PriorityQueque_01 {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();

		q.add("c");
		q.add("e");
		q.add("a");
		q.add("d");
		q.add("z");

		for (int i = 0; i < 5; i++) {
			System.out.println(q.poll());
		}
	}

}
