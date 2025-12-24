package tns_static;

public class static_demo {
	static int count;
	
	static {
		count=20;
		System.out.println("show the static"+"count assigned"+count);
	}
	
	static void show(){
		System.out.println("method runs in static"+"with count"+count);
	}

	public static void main(String[] args) {
		System.out.println("static in main"+"method"+count);
		show();

	}

}
