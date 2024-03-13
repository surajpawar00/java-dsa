class MyThread7 extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo7 {
	public static void main(String [] args){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		MyThread7 obj1 = new MyThread7();
		obj1.start();
		obj1.start();
	}
}

