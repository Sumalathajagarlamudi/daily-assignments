package Constructor;

public  class Constructordemo {
	int a;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructordemo obj=new Constructordemo(100, "suma");//  whenever we have create an obj it  automatically will be executed
		System.out.println(obj.name);
		System.out.println(obj.a);
		
		
		

	}
	public Constructordemo(int y, String x) {// method should be same as cls name 
		this.a=y;
		this.name=x;// local
	}

}
