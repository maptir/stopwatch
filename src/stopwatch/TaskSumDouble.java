package stopwatch;

/**
 * A task that add double to an array of Double.
 * 
 * @author Archawin Tirugsapun
 *
 */

public class TaskSumDouble implements Runnable {
	/** Size of Double array. */
	static final int ARRAY_SIZE = 500000;
	/** A number of Double that user want to add. */
	int counter;

	/**
	 * Constructor that set number of Double.
	 * 
	 * @param counter
	 *            maximum number of Double that user want to add.
	 */
	public TaskSumDouble(int counter) {
		this.counter = counter;
	}

	/**
	 * Add a number 1 to ARRAY_SIZE and then find sum of all number.
	 */
	public void run() {
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = " + sum);

	}

	/**
	 * Return the string information from this task.
	 * 
	 * @return the string information from this task.
	 */
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter);
	}
}
