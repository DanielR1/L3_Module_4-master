package threads;


public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	public static void main(String[] args) {
		printNumbers(50); 
	}
	static void printNumbers(int i) {
		if(i>0) {
			Thread a = new Thread(()->printNumbers(i-1));
			a.start();
		}
		System.out.println("Hello from Thread "+i);
	}
}
