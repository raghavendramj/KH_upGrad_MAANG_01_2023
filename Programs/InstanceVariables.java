public class InstanceVariables {
	
	public String firstName; 
	public int salary;
	
	public void printDetails(){
		firstName = "Virat";
		System.out.println("1. firstName  :- "+ firstName); 
	}
	
	public String details(){
		printDetails(); 
		return "Dummy";
	} 
	
	public static void printNames(InstanceVariables object){
		System.out.println("printNames -----> firstName :- "+ object.firstName); 
	}
	
	//From a static member -> static member without an object
	//From a static member -> to access a non-static member you need an object 
	
	//From a non-static member -> we can access both static and non static member without an object!
	
	public static void main(String args[]){  
	 	
		InstanceVariables object1 = new InstanceVariables(); //Instance of a class -> memory for instance variables
		object1.printDetails(); 
		
		printNames(object1);
		
		System.out.println("2. firstName  :- "+ object1.firstName);  
		InstanceVariables object2 = new InstanceVariables();  
		
		System.out.println("3. firstName  :- "+ object2.firstName);   
		InstanceVariables object3 = new InstanceVariables();  
		
		object2.printDetails(); 
		object3.printDetails(); 
		
		printNames(object2);
		printNames(object3); 
		
		object1.salary = 20;
		object2.salary = 30;
		object3.salary = 40;
		
		System.out.println("1. object1.salary :- "+ object1.salary);
		System.out.println("1. object2.salary :- "+ object2.salary);
		System.out.println("1. object3.salary :- "+ object3.salary); 
		
		object2.salary = 333;
		
		System.out.println("2. object1.salary :- "+ object1.salary);
		System.out.println("2. object2.salary :- "+ object2.salary);
		System.out.println("2. object3.salary :- "+ object3.salary);
		
	} 
}