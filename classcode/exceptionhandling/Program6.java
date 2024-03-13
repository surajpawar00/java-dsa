//NumberFormatException:
import java.io.*;
class Demo6{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
	}
}
/*Exception in thread "main" java.lang.NumberFormatException: Cannot parse null string
        at java.base/java.lang.Integer.parseInt(Integer.java:630)
        at java.base/java.lang.Integer.parseInt(Integer.java:786)
        at Demo6.main(Program6.java:5)*/

