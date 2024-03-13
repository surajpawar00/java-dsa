class MyThread5 implements Runnable{
	public void run(){
		System.out.println("In Runable ");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo5{
	public static void main(String [] args){
		MyThread5 obj = new MyThread5();
		Thread t = new Thread(obj);
		t.start();
		System.out.println(Thread.currentThread().getName());

	}
}


