package chapter15.thread;

class MyThread2 implements Runnable{
	@Override
	public void run() {
		int i;
		
		for(i = 0; i<= 200; i++) {
			System.out.println(i+ " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
public class ThreadTest2{

	public static void main(String[] args) {
		System.out.println("Start");
		MyThread runner1 = new MyThread();
		Thread th1 = new Thread(runner1);
		
		MyThread runner2 = new MyThread();
		Thread th2 = new Thread(runner2);
		
		th1.start();
		th2.start();
		
		System.out.println("End");
	}

}
