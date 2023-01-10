public class StaticAndNonStaticMembers{
	
	int number; //instance variable
	
	public static void methodStatic(StaticAndNonStaticMembers object){
		System.out.println("methodStatic -> "+ object.number);
	}
	
	public void methodNonStatic(){
		number = 25;
		System.out.println("methodNonStatic -> "+ number);
	}
	
	public static void main(String args[]){
		StaticAndNonStaticMembers object1 = new StaticAndNonStaticMembers();
		methodStatic(object1); 
		object1.methodNonStatic(); 
		System.out.println("main -> "+ object1.number);
	}
}

	//From a static member -> static member without an object
	//From a static member -> to access a non-static member you need an object 