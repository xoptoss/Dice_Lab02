package yammy.main;

public class MyThread implements Runnable {
	private final long counter;
	public MyThread(long counter) {
		this.counter = counter;
	}

	public void run(){
		long sum = 0;
		Dice dice = new Dice();
		sum+=dice.roll();
		System.out.println("dice "+counter+" landed on "+sum);
	}
}
