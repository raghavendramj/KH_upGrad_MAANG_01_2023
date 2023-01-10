public class Welcome{
	//Entry point for JVM -> start the execution -> Single line comments!
	public static void main(String args[]){
		System.out.println("Welcome to Java");
		for(String each: args){
			System.out.println("each :- "+each);
		}
	}
}

/*
Step 1:- Compilation
			javac Welcome.java

Step 2:- Interpretation/Execution
			java Welcome.java
 */