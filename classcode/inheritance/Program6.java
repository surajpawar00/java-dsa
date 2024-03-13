class IndiaGov{
	IndiaGov(){
		System.out.println("In India Gov ");
	}

}
class MaharashtraGov extends IndiaGov{
	MaharashtraGov(){
		System.out.println("In MaharashtraGov");
	}

}
class Client6{
	public static void main (String [] args){
		MaharashtraGov obj = new MaharashtraGov();
	}
}

