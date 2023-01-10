import java.util.*;

public class ScannerExample{
	public static void main(String args[]){
		Scanner myobj = new Scanner(System.in); // Create a scanner object
		
		System.out.print("\n Please enter your username :- ");
		String username = myobj.nextLine();
		
		System.out.print("\n Please enter your age :- ");
		int age = myobj.nextInt();
		
		System.out.print("\n Please enter your salary :- ");
		double salary = myobj.nextDouble();
		
		System.out.println("\n Entered Name is :-  "+ username);
		System.out.println("Entered age is :-  "+ age);
		System.out.println("Entered salary is :-  "+ salary);
		
		System.out.printf("Entered name is :- %s with age :- %s, and salary :- %s", username, age, salary);
	}

}