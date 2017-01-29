package stopwatch;

public class TaskAppendToStringBuilder implements Runnable {
	int count;

	public TaskAppendToStringBuilder(int count) {
		this.count = count;
	}

	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		String result = builder.toString();
		System.out.println("final string length = " + result.length());
	}

	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", count);
	}
}
