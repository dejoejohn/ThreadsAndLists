package com.training.syncthreads;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	protected List<Integer> arrayList;

	ArrayListDemo() {
		// TODO Auto-generated constructor stub
		this.arrayList = new ArrayList<>();
	}

	public synchronized void addElement(int number) {
		this.arrayList.add(number);
		System.out.println("Adding, " + number);
		notify();
	}

	public synchronized void removeElement() {
		int item = 0;
		if(arrayList.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			item = this.arrayList.remove(this.arrayList.size()-1);
			System.out.println("Removing, " + item);

		}
		
	}

	public static void main(String[] args) {
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		Thread threadAdder = new Thread(new AdderThread(arrayListDemo), "adder");
		Thread threadRemover = new Thread(new RemoverThread(arrayListDemo), "remover");
		threadAdder.start();
		threadRemover.start();
	}
}
