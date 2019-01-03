package com.yogi;

public class StackImpl {

	private int index ;
	private String[] stackObject;
	private int size;

	public StackImpl(int size) {
		this.size = size;
		this.index = -1;
		this.stackObject = new String[size];
	}

	public boolean push(String inputItem) {
		if (index + 1 >= size) {
			System.out.println("Cannot push into stack. ** Stack overflow **");
			return false;
		}

		index++;
		stackObject[index] = inputItem;

		return true;

	}

	public String pop() {
		if (index <= -1) {
			System.out.println("Cannot pop from stack. ** Stack underflow **");
			return "";
		}

		String returnItem = stackObject[index];
		index--;
		return returnItem ;
	}
	
	public void display() {
		for(int i=0; i<=index; i++) {
			System.out.println(stackObject[i]);
		}
	}

}
