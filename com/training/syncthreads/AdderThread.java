package com.training.syncthreads;

public class AdderThread implements Runnable {
	protected ArrayListDemo arrayListDemo;

	public AdderThread(ArrayListDemo arrayListDemo) {
		this.arrayListDemo = arrayListDemo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int counter = 0; counter < 10; counter++){
			this.arrayListDemo.addElement(counter);
		}
	}

}
