package com.yogi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	Linear Search: Given an integer array and an element x, 
		find if element is present in array or not. 
		If element is present, then print index of its first occurrence. 
		Else print -1.
	 
	Input:
	First line contains an integer, the number of test cases ‘T’. Each test case should be an integer. Size of the array ‘N’ in the second line. In the third line, input the integer elements of the array in a single line separated by space. Element X should be inputted in the fourth line, i.e., after entering the elements of array. Repeat the above steps second line onwards for multiple test cases.
	
	Output:
	Print the output in a separate line returning the index of the element X. If the element is not present, then print -1.
	
	Constraints:
	1 <= T <= 100
	1 <= N <= 100
	1 <= Arr[i] <= 100
*/

public class Problem1 {

	public static void main(String args[]) {
		System.out.println("START");
		int inputArray[] = new int[100];
		int noOfTestCases = 0;
		StringBuffer outputBuffer = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			// Number of test cases
			noOfTestCases = Integer.parseInt(br.readLine());

			for (int i = noOfTestCases; i > 0; i--) {
				// Input size of the array
				int n = 0;
				int searchElement = 0;
				n = Integer.parseInt(br.readLine());

				String inputLine = "";
				inputLine = br.readLine();

				String inputElements[] = inputLine.trim().split("\\s+");

				for (int j = 0; j <= n; j++) {
					inputArray[j] = Integer.parseInt(inputElements[j]);
				}

				// Input element to be searched.
				searchElement = Integer.parseInt(br.readLine());

				outputBuffer.append(search(inputArray, n, searchElement) + "\n");
			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("NumberFormatEXception in main method.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOEXception in main method.");
			e.printStackTrace();
		}

		System.out.println(outputBuffer);
		System.out.println("END");
	}

	public static String search(int[] inputArray, int n, int searchElement) {

		for (int i = 0; i <= n; i++) {
			if (inputArray[i] == searchElement) {
				return new Integer(i).toString();
			}
		}

		return new String("-1");

	}
}
