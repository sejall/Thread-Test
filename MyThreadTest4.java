class MyThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(1000);
			}
			catch( InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
}
class MyThreadTest4
{
	public static void main(String args[]) throws InterruptedException 
	{
		MyThread t1= new MyThread();
		t1.start();
		while(true)
		{
			System.out.println("bye");
			Thread.sleep(2000);
		}
	}
}