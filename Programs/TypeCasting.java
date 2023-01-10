public class TypeCasting{
	public static void main(String args[]){
		double pi = 3.1427;
		//int piValue = pi; // This will throw error! -> expecting implicit downcasting
		
		int piValue = (int) pi; //Explicit downcasting -> removal of decimal portion
		double test = piValue; //Implicit upcasting
		System.out.println("Integer value of pi :- "+ piValue);
		
		int a =10;
		double b = 20.122;
		
		int c = (int)(a+b);
	}
}