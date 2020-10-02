import java.util.Random;
public class Lab1 {
    public static void main(String[] args) throws InterruptedException 
    {
    	while(true) 
    	{
	    	Thread Count = new Thread(new Counter());
	    	Count.start();
	    	if (Counter.RandNum % 2 == 0) 
	    	{
	    		Thread Even = new Thread(new EThread(Counter.RandNum));
	    		Even.start(); Even.join();
	    	}
	    	else 
	    	{
	    		Thread Odd = new Thread(new OThread(Counter.RandNum));
	    		Odd.start(); Odd.join();
	    	}
	    	Count.join();
    	}
    }
}

class Counter implements Runnable 
{
	public static int RandNum;
    public void run() 
    {
    	Random randomNum = new Random();
    		RandNum=randomNum.nextInt();
    		
    		try {Thread.sleep(1000);} 
    		catch (InterruptedException e) 
    		{e.printStackTrace();}
    }
}

class EThread implements Runnable {
    int Counter;
    EThread(int Counter) 
    {this.Counter = Counter;}
    
    public void run() 
    {
        System.out.println("Square of "+Counter+ " is " + Math.pow(Counter, 3));
    }
}

class OThread implements Runnable {
    int Counter;
    OThread(int Counter) 
    {this.Counter = Counter;}
    
    public void run() 
    {
        System.out.println("Cube of "+Counter+ " is " + Math.pow(Counter, 3));
    }
}