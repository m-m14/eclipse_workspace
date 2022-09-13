package learningInheritance;

public class Inheritance {

	class vehicle {
		protected String brand = "nissan";
		
		public void honk() {
			System.out.println("tuut tuut");
		}
	}
	class car extends vehicle{
		private String model = "tiida";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car mycar = new car();
	}

}
