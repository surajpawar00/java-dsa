import java.util.Scanner;
class Demosac2{
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Dream company name");
		String name = obj.next();
		
		System.out.println(" Enter Your Package");
		int pack = obj.nextInt();

		System.out.println(name);
		System.out.println(pack);
	}
}

