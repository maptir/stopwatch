package stopwatch;

/**
 * A task that add chars to a StringBuilder.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class TaskAppendToStringBuilder implements Runnable {
	/** A number of chars that user want to add. */
	int count;

	/**
	 * Constructor that set number of chars.
	 * 
	 * @param count
	 *            maximum number of chars that user want to add.
	 */
	public TaskAppendToStringBuilder(int count) {
		this.count = count;
	}

	/**
	 * Add char 'a' to a StringBuilder by count from user input.
	 */
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

	/**
	 * Return the string information from this task.
	 * 
	 * @return the string information from this task.
	 */
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", count);
	}
}
