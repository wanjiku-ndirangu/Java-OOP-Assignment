package InnerClasses;

class  anonymousclasses{
	public static void main(String[] args){
		// Method 1;
		Thread t1 = new Thread(){
			public void  run(){
				for (int i=0;i<10 ;i++) {
					System.out.println("Child Thread");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){}
				}
			}
		};
		t1.start();
		//method 2 implements Runnable interface;
		Runnable r =  new  Runnable(){
			public void run(){
				for (int i=0 ;i<10 ;i++ ) {
					System.out.println("Child Runnable");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){}
				}
			}
		};
		Thread t2 = new Thread(r);
		t2.start();
		// Method 2 define inside  arguments
		new Thread(new Runnable(){
			public void run(){
				for (int i=0 ;i<10 ;i++ ) {
					System.out.println("Child Runnable define inside method");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){}
				}
			}
		}).start();

		for (int i=0;i<10 ;i++) {
			System.out.println("Main Thread");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}
