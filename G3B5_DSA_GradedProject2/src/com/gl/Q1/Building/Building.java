package com.gl.Q1.Building;

import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class Building {

	public void orderOfBuilding(Deque<Integer> dq) {

		Stack<Integer> st=new Stack<Integer>();
		int dqSize=dq.size();

		int i=1;
	    while(i<=dqSize) {

	     int temp=dq.remove();

	     if(dq.isEmpty()) {
	    	 st.push(temp);
	    	 printStack(st,i,dq);
	    	 break;
	     }

	     if(temp<dq.getFirst()) {
	    	 st.push(temp);
	    	 System.out.println("Day:"+i+" --> ");
	     }

	     if(dq.isEmpty() || temp>=dq.getFirst()){
	    	 st.push(temp);
	    	 printStack(st,i,dq);
	     	}
	     i++;
	    }
	}

	public void printStack(Stack<Integer> st,int day,Deque<Integer> dq) {

		System.out.print("Day:"+day+" --> ");
		while(!st.isEmpty()) {

			if(!hasLargerFloor(dq,st.peek()))
				System.out.print(st.pop()+" ");
			else
				break;
		}
		System.out.println("");
	}

	public boolean hasLargerFloor(Deque<Integer> dq,int num) {
		Iterator<Integer> it=dq.iterator();
		while(!dq.isEmpty() && it.hasNext()) {
			if(it.next()>num)
				return true;
			}
		return false;
	}
}
