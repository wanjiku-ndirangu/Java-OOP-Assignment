package InnerClasses;

class  methodlocalinnerclass{
 	int x = 10;
 	static int y = 20;
	public void m1(){
		class InnerClass{
			public void printSomething(){
				System.out.println("Value of x = "+x);
				System.out.println("Value of y = "+y);
			}
		}
		InnerClass i = new  InnerClass();
		i.printSomething();
	}

	public static void m2(){
		class InnerClass{
			public void printSomething(){
				// System.out.println("Value of x = "+x); // CE: non-static variable x cannot be referenced from a static context
				System.out.println("Value of y = "+y);
			}
		}
		InnerClass i = new  InnerClass();
		i.printSomething();
	}
	public static void main(String[] args){
methodlocalinnerclass o = new methodlocalinnerclass();
		o.m1();
		o.m2();
		System.out.println("Outer class main method");
	}
}

// Output :- 
// Value of x = 10
// Value of y = 20
// Value of y = 20
// Outer class main method