package Introduction_1;
/**
 Variables hold the address of the memory location where the data is stored
 
 There are 3 types of variables in java 
 	1. static variable
 	2. local variables 
 	3. instance variables
 */
/**
local variable: 
	variable declared inside method/body, invisible to other methods of the class can be accessible only within the body.cannot make local variable static.
	Memory allocation : stack
	
instance variable:
	variables declared outside the method, visible to other methods but it's instance specific, cannot be shared among instances.
	Memory allocation: Heap (instance space)
	
static variable:
 	variables declared outside the method and declared static, visible to other methods and can be shared among instances.
 	Memory allocation: Heap (static space)	
*/

public class Variables_2 {
	
	public int height; // instance variable
	static int x ;  // static variable
	
	public void methodTest() {
		int y =20; // local variable 
		System.out.println(y);
	}
	
	public static void main(String []args) {
		Variables_2 var1 = new Variables_2();
		var1.methodTest();
		var1.x = 10;
		var1.height = 50;
		
		Variables_2 var2 = new Variables_2();
		var2.methodTest();
		var2.x = 20;
		var2.height = 60;
		
		System.out.println(var1.height +"   "+ var2.height);
		System.out.println(var1.x +"   "+ var2.x);
	}

}

// Note: static variable  modified in one instance will reflect in all other instances


