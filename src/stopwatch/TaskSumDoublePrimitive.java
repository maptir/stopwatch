package stopwatch;

/**
 * A task that add double to an array of double.
 * 
 * @author Archawin Tirugsapun
 *
 */

public class TaskSumDoublePrimitive implements Runnable {
	/** Size of double array. */
	static final int ARRAY_SIZE = 500000;
	/** A number of double that user want to add. */
	int counter;

	/**
	 * Constructor that set number of double.
	 * 
	 * @param counter
	 *            maximum number of double that user want to add.
	 */
	public TaskSumDoublePrimitive(int counter) {
		this.counter = counter;
	}

	/**
	 * Add a number 1 to ARRAY_SIZE and then find sum of all number.
	 */
	public void run() {
		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		double sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
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
		return String.format("Sum array of double primitives with count=%,d\n", counter);
	}
}
