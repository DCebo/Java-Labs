
public class MyThread extends Thread {

	String threadData;
	int numberOfThe = 0;

	public MyThread(String data) {
		this.threadData = data;
	}

	public int WordCount() {
		return this.numberOfThe;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.threadData.length() - 3; i++) {
			if (this.threadData.substring(i, i + 3).equalsIgnoreCase("the")) {
				numberOfThe++;
			}
		}
	}
}
