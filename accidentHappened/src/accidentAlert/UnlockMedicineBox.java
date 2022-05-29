package accidentAlert;
//
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class UnlockMedicineBox {
//
//    private long count = 0;
//
//    private Lock lock = new ReentrantLock();
//
//    public void inc() {
//        try {
//            lock.lock();
//            this.count++;
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public long getCount() {
//        try {
//            lock.lock();
//            return this.count;
//        } finally {
//            lock.unlock();
//        }
//    }
//}

// Java code to illustrate Reentrant Locks
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class worker implements Runnable
{
String name;
ReentrantLock re;
public worker(ReentrantLock rl, String n)
{
	re = rl;
	name = n;
}
public void run()
{
	boolean done = false;
	while (!done)
	{
	//Getting Outer Lock
	boolean ans = re.tryLock();

	// Returns True if lock is free
	if(ans)
	{
		try
		{
		Date d = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
		System.out.println("task name - "+ name
					+ "  lock acquired at "
					+ ft.format(d)
					+ " Doing Locking work");
		Thread.sleep(1500);
        
		// Now the box is lock and no other work can be done. 
		// Meanwhile perform the actions you need to do.
		
		System.out.println("Lock Hold Count - " + re.getHoldCount());
		System.out.println("task name - " + name + " work done");
		System.out.println("");

		done = true;
		}
		catch(InterruptedException e)
		{
		e.printStackTrace();
		}
		finally
		{
		//Outer lock release
		System.out.println("task name - " + name +
					" releasing lock");

		re.unlock();
		System.out.println("Lock Hold Count - " +
					re.getHoldCount());
		}
	}
	else
	{
		System.out.println("task name - " + name +
					" waiting for lock");
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		e.printStackTrace();
		}
	}
	}
}
}

public class UnlockMedicineBox
{
static final int MAX_T = 2;
public void mainmethod()
{
	// Here example of two request is shown. 
	
	ReentrantLock rel = new ReentrantLock();
	ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
	Runnable w1 = new worker(rel, "Lock1");
	Runnable w2 = new worker(rel, "Lock2");
	pool.execute(w1);
	pool.execute(w2);
	pool.shutdown();
}
}
