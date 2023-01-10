public class StaticVariables {
	
		public static int voucherId;
	
		public static void main(String args[]){
			
					boolean isProgramComplete = false;
		
		StaticVariables object1 = new StaticVariables(); 
		StaticVariables object2 = new StaticVariables(); 
		StaticVariables object3 = new StaticVariables();  
		
		System.out.println("1. object1.voucherId :- "+ object1.voucherId);
		System.out.println("1. object2.voucherId :- "+ object2.voucherId);
		System.out.println("1. object3.voucherId :- "+ object3.voucherId); 
		
		object1.voucherId = 245234511;
		System.out.println("\n--------------------------------------------");
		System.out.println("2. object1.voucherId :- "+ object1.voucherId);
		System.out.println("2. object2.voucherId :- "+ object2.voucherId);
		System.out.println("2. object3.voucherId :- "+ object3.voucherId); 
		
		object2.voucherId = 34;
		System.out.println("\n--------------------------------------------");
		System.out.println("3. object1.voucherId :- "+ object1.voucherId);
		System.out.println("3. object2.voucherId :- "+ object2.voucherId);
		System.out.println("3. object3.voucherId :- "+ object3.voucherId); 
		
		
		float floatingNumber = 12.23456f;
		double doubleNumber = 12.12345678901342;
		
		int myNumber = 'R';
		System.out.println("\n\n--------------------------------------------");
		System.out.println("4. myNumber :- "+ myNumber); 
		

		isProgramComplete = true;
		
		char charexample = 'A';
		 	
		}
}

/*
class System{ 
	static PrintWriter out; 
}

class PrintWriter{ 
	void println(String strToPrint); 
}

*/