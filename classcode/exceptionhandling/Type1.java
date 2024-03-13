//Compiletime exception 
import java.io.*;
class Type1{
	public static void main(String [] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
	}
}
/*Type1.java:6: error: unreported exception IOException; must be caught or declared to be thrown
                String str = br.readLine();
                                        ^
1 error*/

