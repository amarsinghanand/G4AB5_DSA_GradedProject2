package com.gl.iitr.fsd.gp.dsa.skyscraper;

import java.util.Scanner;

public class ArchitectMain {
	public static void main(String[] args) {
		int totalFloors;
		Integer[] totalFloorSize;
		System.out.println("Enter the total no. of floors in the building: ");
		Scanner sc = new Scanner(System.in);
		totalFloors = sc.nextInt();
		totalFloorSize = new Integer[totalFloors];

		for (int i = 1; i <= totalFloors; i++) {
			System.out.println("Enter the floor size given on Day " + i + " : ");
			totalFloorSize[i - 1] = sc.nextInt();
		}
		BuildFloorService bfs = new BuildFloorService();
		bfs.orderOfConstruction(totalFloorSize);
	}

}
