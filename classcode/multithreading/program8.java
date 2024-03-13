class MyThread8 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadSleepDemo8{
	public  static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread());
		MyThread8 obj = new MyThread8();
		obj.start();
		Thread.sleep(1000);
		Thread.currentThread().setName("Core2web");
		System.out.println(Thread.currentThread());
	}
}

