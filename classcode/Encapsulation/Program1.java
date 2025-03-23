class Encap{
	private String name  = "";
	private int  age = 0;

	public void setName(String newName){
		this.name = newName;
	}
	public String getName(){
		return name;
	}
        public void setAge(int newAge){
		this.age = newAge;
	}
        public int getAge(){
		return age;
	}	
}
class DemoEncap{
	public static void main(String [] args){
		Encap obj = new Encap();
		obj.setName("Suraj");
		System.out.println(obj.getName());
		
		obj.setAge(22);
		System.out.println(obj.getAge());
	}
}

