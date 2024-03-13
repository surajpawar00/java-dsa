class MyThread14 extends Thread{
	MyThread14(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemo14{
	public static void main(String []main){
		ThreadGroup pThreadgp = new ThreadGroup("core2web");
		MyThread14 obj1 = new MyThread14(pThreadgp,"c");
		MyThread14 obj2 = new MyThread14(pThreadgp,"python");
		MyThread14 obj3 = new MyThread14(pThreadgp,"java");
		obj1.start();
		obj2.start();
		obj3.start();
		ThreadGroup cThreadgp = new ThreadGroup(pThreadgp,"Incubator");
                MyThread14 obj4 = new MyThread14(cThreadgp,"flutter");
                MyThread14 obj5 = new MyThread14(cThreadgp,"reactjs");
                MyThread14 obj6 = new MyThread14(cThreadgp,"SpringBoot");
		obj4.start();
		obj5.start();
		obj6.start();
	
	}
}


