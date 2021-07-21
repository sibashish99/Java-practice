import java.io.*;
class ThreadJoining extends Thread{
	@Override
	public void run(){
		for (int i = 0; i < 2; i++){
			try{
				Thread.sleep(500);
				System.out.println("Current Thread: "
						+ Thread.currentThread().getName());
			}

			catch(Exception ex){
				System.out.println("Exception has" +
								" been caught" + ex);
			}
			System.out.println(i);
		}
	}
}

class GFG{
	public static void main (String[] args){
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();

	
		t1.start();
		try{
			System.out.println("Current Thread: "
				+ Thread.currentThread().getName());
			t1.join();
		}

		catch(Exception ex){
			System.out.println("Exception has " +
								"been caught" + ex);
		}

		t2.start();

		try{
			System.out.println("Current Thread: "
				+ Thread.currentThread().getName());
			t2.join();
		}

		catch(Exception ex){
			System.out.println("Exception has been" +
									" caught" + ex);
		}

		t3.start();
	}
}
