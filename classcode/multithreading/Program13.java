class MyThread13 extends Thread{
	MyThread13(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemo13{
	public static void main(String []main){
		ThreadGroup pThreadgp = new ThreadGroup("core2web");
		MyThread13 obj1 = new MyThread13(pThreadgp,"c");
		MyThread13 obj2 = new MyThread13(pThreadgp,"python");
		MyThread13 obj3 = new MyThread13(pThreadgp,"java");
		obj1.start();
		obj2.start();
		obj3.start();
	
	}
}


