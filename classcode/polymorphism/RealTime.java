class IPL{
	void matchinfo(String team1,String team2){
		System.out.println(team1 + " vs " + team2);
	}
	
	void matchinfo(String team1,String team2,String venue){
		System.out.println(team1 + " vs " + team2+ " At Stadium " + venue);
	}
}
class Fans{
	public static void main(String[] args){
		IPL obj = new IPL();
		obj.matchinfo("csk","Mi");
		obj.matchinfo("csk","mi","Mumbai");
	}
}

		
