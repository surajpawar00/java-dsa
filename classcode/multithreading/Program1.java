class Mythread1 extends Thread{
	public void run(){
		for (int i = 0;i<=10;i++){
			System.out.println("In Run");
		}
	}
}
class ThreadDemo1{
	public static void main(String [] args){
		Mythread1 obj = new Mythread1();
		obj.start();
		for (int i = 0;i<=10; i++){
			System.out.println("In main");
		}
	}
}

