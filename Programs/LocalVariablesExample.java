public class LocalVariablesExample{
	
	public int addNums(int a, int b){
		int result = a+b; //Local Variable -> result
		return result;
	}
	
	//a+b, a-b, a^2, (a+b)^2, a*b sqrt(a*b)
	public int[] statistics(int a, int b){
		int result[] = new int[10]; //Array declaration
		int sum = a+b ;
		int diff = a-b ;
		int prod = a*b ;
		int square = (sum)*(sum) ; 
		result[0] = sum;
		result[1] = diff;
		result[2] = prod;
		result[3] = square; 
		return result;
	}
	
	public static void main(String args[]){
			int empId = 1000; //Local Variable -> empId
			System.out.println("Local Variable :- "+ empId);
			
			LocalVariablesExample object = new LocalVariablesExample();
			int res = object.addNums(10, 20); //Local Variable -> res
			System.out.println("Addition sum is :- "+ res );
	}
}

/*
Class 
	-> Methods/functions
	-> Variable -> instance and static/class-level variables 
	
Syntax :-
class className{
		//instance variables 
		//methods
}

*/