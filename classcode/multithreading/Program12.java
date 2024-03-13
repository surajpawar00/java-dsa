class MyThread12 extends Thread{
	MyThread12(String str){
		super(str);
	}
	public void run(){
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
class ThreadGroupDemo{
	public static void main(String []main){
		MyThread12 obj = new MyThread12("xyz");
		obj.start();
	}
}


