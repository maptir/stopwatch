package stopwatch;

/**
 * A task that add chars to a string.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class TaskAppendToString implements Runnable {
	/** A number of chars that user want to add. */
	int count;

	/**
	 * Constructor that set number of chars.
	 * 
	 * @param count
	 *            maximum number of chars that user want to add.
	 */
	public TaskAppendToString(int count) {
		this.count = count;
	}

	/**
	 * Add char 'a' to a string result by count from user input.
	 */
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

	/**
	 * Return the string information from this task.
	 * 
	 * @return the string information from this task.
	 */
	public String toString() {
		return String.format("Append %,d chars to String\n", count);
	}
}
