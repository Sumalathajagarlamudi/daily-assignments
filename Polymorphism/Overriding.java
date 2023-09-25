package Polymorphism;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subbu ob=new Subbu();
		ob.Latha();
		ob.Vishnu();
		
		

	}}
	class Suma{
		public void Latha() {
			System.out.println("this is override");
		}
		public void Vishnu() {
			System.out.println("this is override");
			
			
		}
		
	}
	class Subbu extends Suma{
		public void Latha() {
			System.out.println("this is one more class");
			
		}
		


	}


