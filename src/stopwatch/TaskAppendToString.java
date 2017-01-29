package stopwatch;

public class TaskAppendToString implements Runnable {
	int count;

	public TaskAppendToString(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
		System.out.println("final string length = " + result.length());
	}

	public String toString() {
		return String.format("Append %,d chars to String\n", count);
	}
}
