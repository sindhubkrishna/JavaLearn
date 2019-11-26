package Introduction_1;

public class ControlStatements_4 {
	
	int x= 5;
	// If condition
	public void ifMethod() {
	
		// If condition 
		if(x == 5) {
			System.out.println("equals to five");
		}
		
		// IF - else condition
		if(x==5) {
			System.out.println("equals to five");
		}else {
			System.out.println("not equals to five");
		}
		
		// IF-else-IF ladder
		if(x<5) {
			System.out.println("not equals to five");
		}else if (x>5) {
			System.out.println("not equals to five");
		}
		else {
			System.out.println("equals to five");
		}
		
		// nested If
		if(x <6) {
			if(x==5) {
				System.out.println("equals to five");
			}else {
				System.out.println("not equals to five");
			}
		}
	}
	
	// Java Switch statement
    public void switchMethod() {
    	switch(x) {
    	case 5:
    		break; // if break is not present then it is switch fall through, execute all other cases after the condition met
    	case 4:
    		System.out.println("not equal to 5");
    	default:
    		System.out.println("default run");
    	}
    }
    
    // For Loop
    public void loopMethod() {
    	
    	int y =1;
    	/**
    	 * for loop
    	 */
    	// simple for loop
    	for(int i =0; i<=10; i++) {
    		System.out.println(i);
    	}
    	// enhanced for loop/ for each loop
    	int arr[] = {1,2,3,4,5};
    	for(int i: arr) {
    		System.out.println(i);
    	}
    	// nested for loop
    	for(int i: arr) {
    		for(int j: arr) {
        		System.out.println(j);
        	}
    	}
    	// labeled for loop
    	aa:  
            for(int i=1;i<=3;i++){  
                bb:  
                    for(int j=1;j<=3;j++){  
                        if(i==2&&j==2){  
                            break bb;  
                        }  
                        System.out.println(i+" "+j);  
                    }  
            }  
    	// infinitive for loop
    	/*for(;;) {
    		System.out.println("Infinite for loop");
    	}*/
    	   	
    	/**
    	 * while loop
    	 */
    	// simple while loop
    	while(y<5) {
    		System.out.println(y);
    		y++;
    	}
    	// do while loop
    	do {
    		System.out.println(y);
    		y++;
    	}while(y<10);
    	// infinitive while loop
    	while(true) {
    		System.out.println("infinitive while loop");
    	}
    }
	
    // break exit from the loop
    // continue skip the current execution and continue to next
}
