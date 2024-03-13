class MyThread9 extends Thread{
	public void run(){
		for(int i = 0;i<= 10 ;i++){
		System.out.println("Thread 0 ");
		}
	}

}
class ThreadJoinDemo9{
	public  static void main(String[] args)throws InterruptedException{
	
		MyThread9 obj = new MyThread9();
		obj.start();
		obj.join();
		for(int i = 0 ;i<=10;i++){
			System.out.println("main");
		}

	}
}

