class MyThread11 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	
	}

}
class ThreadYeildDemo11{
	public  static void main(String[] args){
	
		MyThread11 obj = new MyThread11();
		obj.start();
		obj.yield();
			System.out.println(Thread.currentThread().getName());

	}
}

