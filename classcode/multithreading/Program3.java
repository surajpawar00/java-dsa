class MyThread3 extends Thread{
	public void Run(){
		System.out.println("In Run Method ");
		System.out.println(Thread.currentThread().getName());
	}
	public void Start(){
		System.out.println("In MyThread Start");
		Run();
	}

}
class ThreadDemo3{
	public static void main(String [] args){
		MyThread3 obj = new MyThread3();
		obj.Start();
		System.out.println(Thread.currentThread().getName());
	}
}
