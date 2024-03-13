import java.io.*;
class Demobuf{
	public static void main(String arg [])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		String name = br.readLine();
		System.out.println("Enter Roll No: ");
		int roll = Integer.parseInt(br.readLine());
		System.out.println(name);
		System.out.println(roll);
	}
}

