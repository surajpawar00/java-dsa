class Outer2{
        class Inner2{
                void m1 (){
                        System.out.println("in M1 Inner");
                }
        }
        void m2(){
                System.out.println("in M2 Outer ");
        }
	public static void main(String [] args){
		
		Outer2.Inner2 obj = new Outer2().new Inner2();
		obj.m1();
	}

}

