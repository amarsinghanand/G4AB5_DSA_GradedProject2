package com.gl.iitr.fsd.gp.dsa.skyscraper;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class BuildFloorService {
	public void orderOfConstruction(Integer[] totalFloorSize) {
		System.out.println("\nThe order of floor construction as follows: ");

		int j = 0;
		Integer[] totalFloorSizeSorted = totalFloorSize.clone();
		Arrays.sort(totalFloorSizeSorted, Collections.reverseOrder());

		Stack<Integer> buildingFloorStack = new Stack<Integer>();

		for (int i = 0; i < totalFloorSize.length; i++) {
			// Stack elements loop
			if (totalFloorSize[i] == totalFloorSizeSorted[j]) {
				if (i == totalFloorSize.length - 1) {
					j = i;
				} else {
					j = i + 1;
				}
				System.out.println("Day " + (i + 1) + ":");
				// To print current floor till entire stack is empty and value is greater than
				// the next element in the sorted list
				if (buildingFloorStack != null) {
					System.out.print(totalFloorSize[i] + " ");
					while (!buildingFloorStack.isEmpty()) {
						int val = buildingFloorStack.pop();
						if (val >= totalFloorSizeSorted[j]) {
							System.out.print(val + " ");
						} else {
							buildingFloorStack.push(val);
							j -= buildingFloorStack.size();
							break;
						}
					}
					System.out.println("");
				} else {
					System.out.println(totalFloorSize[i]);
				}
			} else {
				// Adding elements to the stack
				System.out.println("Day " + (i + 1) + ":");
				buildingFloorStack.push(totalFloorSize[i]);
			}
		}
	}
}
