package InnerClasses;

class  staticinnerclass{
	static class InnerNestedClass{
		public void m1(){
			System.out.println("Static class Method");
		}
	}
	public static void main(String[] args){
		InnerNestedClass inc = new InnerNestedClass();
		inc.m1();
		System.out.println("Outer Main Method");
	}
}

class Test{
	public static void main(String[] args){
		staticinnerclass.InnerNestedClass inc = new staticinnerclass.InnerNestedClass();
		inc.m1();
		System.out.println("Test Main Method");
	}
}

// Cmd to execute 
// javac StaticNestedobject.java
// java Test
// output :- 
// Static class Method
// Test Main Method
