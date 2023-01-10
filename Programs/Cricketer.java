public class Cricketer{
	
	public int id;
	public String name;
	
	public void getPlayerDetails(){
		
	}
	
	public static void main(String args[]){  
		Cricketer object1 = new Cricketer();
		System.out.println("cricketer -> id :- "+ object1.id);
		System.out.println("cricketer -> name :- "+ object1.name);		
		
		object1.id = 123;
		object1.name = "Sachin";
		
		System.out.println("cricketer -> id :- "+ object1.id);
		System.out.println("cricketer -> name :- "+ object1.name);	
	}
}

/*
Class
	-> 2 members(methods and properties(variables))
	-> method
		-> static 
		-> non-static method
		
Rules
	-> From a static member 
			without an object -> only static member can be invoked
			with an object -> only non-static member can be invoked
*/