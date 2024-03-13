class SolarSystem{
	SolarSystem(){
		System.out.println("In SolarSystem");
	}
	void rotation(){
		System.out.println(" Rotation Around Sun");
	}
}
class Earth extends SolarSystem{
	Earth (){
		System.out.println(" On Earth");
	}
}
class Humans{
	public static void main (String [] args){
		Earth obj = new Earth();
		obj.rotation();
	}
}

