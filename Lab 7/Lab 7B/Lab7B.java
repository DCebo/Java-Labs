import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class Lab7B {

	public static void main(String[] args) {
		// String[] fullFile = new String90;
		String fullFile = "";
		int lineAmount = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("alice.txt"));

			String st = br.readLine();
			// int counter = 0;
			while (st != null) {
				// fullFile[couter] = st;
				fullFile += st;
				// System.out.println(st);
				st = br.readLine();
				lineAmount++;
				// counter++;
			}
			br.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("Num of processors: " + processors);

		ForkJoinPool forkJoinPool = new ForkJoinPool(processors);

		int x = fullFile.length() / 8;
		int count = 0;
		int stoppingPointForLastThread = 0;

		int divisionOfWork = (lineAmount * 40) / processors;
		// FORKJOIN
		AtomicInteger wordCount = new AtomicInteger(0);
		for (int i = 0; i < processors; i++) {
			DataParallelThread t = new DataParallelThread(
					fullFile.substring(divisionOfWork * i, divisionOfWork + (divisionOfWork * i)));

			wordCount.getAndAdd(forkJoinPool.invoke(t).get());
		}
		System.out.println("Word count of \"the\" is: " + wordCount);

		// THREAD
		MyThread[] threads = new MyThread[processors];
		for (int i = 0; i < processors; i++) {
			MyThread t = new MyThread(fullFile.substring(divisionOfWork * i, divisionOfWork + (divisionOfWork * i)));

			t.run();
			threads[i] = t;
		}

		int wordCount2 = 0;
		for (int i = 0; i < processors; i++) {
			wordCount2 += threads[i].WordCount();
		}
		System.out.println("Word count of \"the\" is: " + wordCount2);
	}

}
