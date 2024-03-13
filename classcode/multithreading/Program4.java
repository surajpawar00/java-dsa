class Demo4 extends Thread{
	public void run(){
		System.out.println("Demo" + Thread.currentThread().getName());
	}
}
class MyThread4 extends Thread{
	public void run(){
		System.out.println("MyThread" + Thread.currentThread().getName());
		Demo4 obj = new Demo4();
		obj.start();
	}
}
class ThreadDemo4{
	public static void main(String [] args){
		System.out.println( "ThreadDemo" + Thread.currentThread().getName());
		MyThread4 obj2 = new MyThread4();
		obj2.start();
	}
}

