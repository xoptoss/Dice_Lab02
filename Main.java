package yammy.main;

public class Main{
	public static void main(String[] args) {
		for(int i = 1 ; i<26;i++){
			Runnable T1 = new MyThread(i);
			Thread worker = new Thread(T1);
			worker.setName(String.valueOf(i));
			worker.start();
		}

	}
}
