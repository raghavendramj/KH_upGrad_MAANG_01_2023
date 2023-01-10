public class OperatorsInJava{
	public static void main(String args[]){
		int a = 10;
		int b = 23;
		a = a + b;
		System.out.println("1. Solution :- "+ a); 
		a += b;
		System.out.println("2. Solution :- "+ a); 
		
		int value = 10; 
		if(value> 5 || value < 10){
			System.out.println("value is inside the range!"); 
		} else { 
			System.out.println("value is out of range!"); 
		}
		
		
		int testValue = 12;  
		System.out.println("testValue is  :- "+ testValue++); 
		System.out.println("testValue is  :- "+ testValue); 
		
		int testValue2 = 15;  
		System.out.println("testValue2 is  :- "+ (++testValue2)); 
		System.out.println("testValue2 is  :- "+ testValue2); 
		
	}
}