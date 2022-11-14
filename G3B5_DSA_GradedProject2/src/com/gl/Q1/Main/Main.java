package com.gl.Q1.Main;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import com.gl.Q1.Building.Building;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Building con=new Building();
		Deque<Integer> dq=new LinkedList<Integer>();

		System.out.println("Enter the total number of floors in the building : ");
		int floors=sc.nextInt();

		for(int j=0;j<floors;j++) {
			System.out.println("Enter the floor size given on day "+(j+1)+" : ");
			int ele=sc.nextInt();
			dq.add(ele);
		}
		System.out.println("The order of construction is as follows");
		con.orderOfBuilding(dq);
		sc.close();
	}
}