import java.time.LocalDateTime;

public class TestThreadThread extends Thread { // creating threads to replace implements Runnable but the function still the same

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + ": This is currently running on the main thread, " + "the id is:" 
						+ Thread.currentThread().getId());
		
		TestThreadThread worker = new TestThreadThread(); //can also be replace with worker.start()
	
		Thread thread = new Thread(worker);
		thread.start();
		
		Thread t2 = new Thread(worker);
		t2.setName("T2");
		t2.setPriority(MIN_PRIORITY);
		t2.start();
		
		Thread t3 = new Thread(worker);
		t3.start();
		
		Thread t4 = new Thread(worker);
		t4.setName("T4");
		t4.setPriority(MAX_PRIORITY);
		t4.start();
		
		Thread t5 = new Thread(worker);
		t5.start();
		
		Thread t6 = new Thread(worker);
		t6.start();
		
		Thread t7 = new Thread(worker);
		t7.start();
	
	
		ldt = LocalDateTime.now();
		System.out.println(ldt + ": Main finished running....");
		
	}

	@Override
	public void run() 
	{
		LocalDateTime ldt = LocalDateTime.now();//to create import java: right click, source, import.
		System.out.println(ldt + ": This is currently running on a separate thread, " + "the id is: " +
							Thread.currentThread().getId()+ ", with Name :" + Thread.currentThread().getName() +
							", with Priority -" + Thread.currentThread().getPriority());
		
		for (int i=0;i<1000;i++) {		
		}
		ldt = LocalDateTime.now();
		System.out.println(ldt + ": Thread with id is: " +
				Thread.currentThread().getId()+ ", with Name :" + Thread.currentThread().getName() +
				"Finish excecuting");
	}

}
