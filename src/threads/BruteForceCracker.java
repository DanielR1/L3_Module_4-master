package threads;

// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class BruteForceCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000_000);
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		
		Thread t1 = new Thread(()->{
			for (int i = 0; i < 100000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t2 = new Thread(()->{
			for (int i = 100000000; i < 200000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t3 = new Thread(()->{
			for (int i = 200000000; i < 300000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t4 = new Thread(()->{
			for (int i = 300000000; i < 400000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t5 = new Thread(()->{
			for (int i = 400000000; i < 500000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t6 = new Thread(()->{
			for (int i = 500000000; i < 600000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t7 = new Thread(()->{
			for (int i = 600000000; i < 700000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t8 = new Thread(()->{
			for (int i = 700000000; i < 800000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t9 = new Thread(()->{
			for (int i = 800000000; i < 900000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		Thread t10 = new Thread(()->{
			for (int i = 900000000; i < 1000000000; i++) {
				if(checkCode(i)==true) {
					endTime = System.currentTimeMillis();
				}
			}
		});
		
		startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}
	
	public static boolean checkCode(long p){
		
		if(p == code){
			return true;
		}else{
			return false;
			
		}
	}
}
