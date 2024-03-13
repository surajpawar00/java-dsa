class Mythread2	extends Thread{
	public void run(){
		for (int i = 0;i<=10;i++){
			System.out.println("In Run");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
			}
		}
	}
}
class ThreadDemo2{
	public static void main(String [] args)throws InterruptedException{
		Mythread2 obj = new Mythread2();
		obj.start();
		for (int i = 0;i<=10; i++){
			System.out.println("In main");
			Thread.sleep(1000);
		}
	}
}

