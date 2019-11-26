package Introduction_1;
/**
 * 
Java is a High level language as well as framework.
It is a Application level programming language where as C is a system level programming language.

Major features of JAVA are 
	1.Platform Independent 
		Program can be written on any OS and it's complied .class can be executed on any other OS 
	2.Open source 
	3.Architectural neutral
		It has constant 64 bit architecture.
	4.No explicit pointers 
	5.Garbage collectors 
	6.Secured
	7.Object Oriented
	8.Multi threaded Environment 
	
Basic flow
	.java ---> [compile] ---> .class (byte code) ---> [execute] ---> .obj (MP+OS)
	
Object: It is a runtime entity which holds state and behavior of a class
Class: It is prototype/blueprint from which objects are created

 */
public class Introduction_1 {
		
	public int height; public String color; // properties
	
	public void jump() {
		// jump is a behavior
	}
}

/**
 * here lets consider dog as an object and it's properties are height and color, which also mean has.
 * And behavior nothing "does"
 */

/**
	JVM: It's an abstract machine which has no physical existence. 
		Loads data
		verifies data
		executes data
		provides run time environment 
		
	JRE: JVM + Libraries
	
	JDK: JRE + development tools (javac)
*/