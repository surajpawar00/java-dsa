class MyThread6 extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo6 {
	public static void main(String [] args){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		MyThread6 obj1 = new MyThread6();
		obj1.start();
		t.setPriority(7);
		MyThread6 obj2 =new MyThread6();
		obj2.start();
	}
}

