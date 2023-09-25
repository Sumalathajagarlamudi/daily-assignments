package Polymorphism;

public class Overloading {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			// overloading
			suma();
			suma(5);
			suma(20,"latha");
			suma("sumalatha");
			
			

		}
		public static void suma() {
			System.out.println("sumalatha");
			
		}

		public static void suma(int s) {
			System.out.println("given number :" +s);
		}
		public static void suma(int a,String name) {
			System.out.println("integer "+a+" name:"+name);
		}
		public static void suma(String name) {
			System.out.println("name :" +name);

			
		
		
	

	}

}
