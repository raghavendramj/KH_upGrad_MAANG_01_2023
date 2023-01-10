public class VariableExample{
	//-2,147,483,648 to 2,147,483,647
	public static void main(String args[]){
		int number = 12;
		System.out.println("1. Value is :- "+number );
		number = 45; //number -> 12 -> 45
		System.out.println("2. Value is :- "+number );
		
		System.out.println("\n-------------------------------------------");
		String name = "Sachin";
		System.out.println("1. String Value is :- "+name );
		name = "Ganguly";
		System.out.println("2. String Value is :- "+name );
		
		System.out.println("\n-------------------------------------------");
		char test = 'A';
		System.out.println("1. Char Value is :- "+test );
		test = 'V';
		System.out.println("2. Char Value is :- "+test );
	}
}