public class Employee{
	
	public int empId;
	public String empName;
	
	//Rules for creating Java constructor
	//---------------------------------------
	//Constructor name must be the same as its class name
	//A Constructor must have no explicit return type
	//Constructor cannot be abstract, static, final, and synchronized
	
	//Default Constructor
	public Employee(){
		System.out.println("This is default constructor");
		System.out.println("constructors are generally used to initialize the object!");
	}
	//Parameterized Constructor
	public Employee(int id, String name){
		this.empId = id;
		this.empName = name;
		System.out.println("This is Parameterized constructor");
		System.out.println("constructors are generally used to initialize the object with the help of parameters!!");
	} 
	
	public static void main(String args[]){
		Employee employee1 = new Employee(); // A way to create new object in java
		//Employee -> Reference type
		//employee1 -> Reference variable 
		//new -> Is used to fetch the memory from the heap
		//Employee() -> consturctor -> It initializes your object
		
		Employee player1 = new Employee(1, "Messi"); // A way to create new object in java
		Employee player2 = new Employee(1, "Mbappe"); // A way to create new object in java
	}
}