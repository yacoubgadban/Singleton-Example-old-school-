
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--------------start----------------");
		
		
		
		Thread th1 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				Cars.getInstance();
				// TODO Auto-generated method stub
				
			}
		});
		

		Thread th2 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				Cars.getInstance();
				// TODO Auto-generated method stub
				
			}
		});
	
		th1.start();
		th2.start();
		
		
	}	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



