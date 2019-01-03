package com.yogi;

public class DSStack {

	public static void main(String args[]) {
		System.out.println("START");
		StackImpl si = new StackImpl(10);
		System.out.println("*****");
		si.push("one");
		si.display();
		System.out.println("*****");
		si.push("two");
		si.display();
		System.out.println("*****");
		si.pop();
		si.display();
		System.out.println("END");
	}
	
}
