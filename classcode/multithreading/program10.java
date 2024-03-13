class MyThread10 extends Thread{
	static Thread nmmain = null;
	public void run(){
		try{
			nmmain.join();
		}catch(InterruptedException obj22){

		}

		for(int i = 0;i<= 10 ;i++){
		System.out.println("Thread 0 ");
		}
	}

}
class ThreadDemo10{
	public  static void main(String[] args)throws InterruptedException{
	        MyThread10.nmmain = Thread.currentThread();
		MyThread10 obj = new MyThread10();
		obj.start();
		obj.join();
		for(int i = 0 ;i<=10;i++){
			System.out.println("main");
		}

	}
}

