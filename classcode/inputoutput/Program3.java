import java.util.Scanner;
class Demosac3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.next();

		System.out.println("Enter Your Roll No: ");
		int roll = sc.nextInt();


		System.out.println("Name of Student  " + name);
		System.out.println(name + " Roll No is " + roll);
	}
}

