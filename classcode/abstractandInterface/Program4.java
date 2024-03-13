abstract class Meta {
	void Aim (){
		System.out.println("Generate Money ");
	}
	abstract void Source();
}
class Instagram extends Meta {
	void Source(){
		System.out.println("By Advertisement");
	}
}
class Client4{
	public static void main(String [] args){
		Meta obj  = new Instagram();
		obj.Aim();
		obj.Source();
	}
}

