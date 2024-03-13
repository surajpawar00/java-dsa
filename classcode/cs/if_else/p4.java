class demo4{
	public static void main(String[] args){
		float temp = 98.0f;
		if( temp > 98.6){
			System.out.println(" high");
		}
		else if ( temp < 98.0){
			System.out.println("Low");
		}
		else if (temp<=98.6 && temp >= 98.0){
			System.out.println("Normal");
		}
	}
}
