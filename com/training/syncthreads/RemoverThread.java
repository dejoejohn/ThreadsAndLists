package com.training.syncthreads;

public class RemoverThread implements Runnable {
	protected ArrayListDemo arrayListDemo;

	public RemoverThread(ArrayListDemo arrayListDemo) {
		this.arrayListDemo = arrayListDemo;

	}

	@Override
	public void run() {
		for(int counter = 0; counter < 10; counter ++){
			this.arrayListDemo.removeElement();

		}
	}

}
