class Match{
	void MatchType(){
		System.out.println("Test / ODI / T20 ");
	}
}
class IPLMatch extends Match{
	void MatchType(){
		System.out.println("T20");
	}
}
class TestMatch extends Match{
	void MatchType(){
		System.out.println("Test");
	}
}
class Client7 {
	public static void main(String [] args){
		Match Type1 = new IPLMatch();
		Type1.MatchType();
		Match Type2 = new TestMatch();
		Type2.MatchType();
	}
}

