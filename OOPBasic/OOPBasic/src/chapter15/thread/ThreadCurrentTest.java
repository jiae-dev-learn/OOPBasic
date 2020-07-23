package chapter15.thread;

class MyCurrnetThread implements Runnable{
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

public class ThreadCurrentTest {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("end");		
	}
}
