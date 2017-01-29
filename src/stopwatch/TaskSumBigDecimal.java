package stopwatch;

import java.math.BigDecimal;

/**
 * A task that add double to an array of BigDecimal.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class TaskSumBigDecimal implements Runnable {
	/** Size of BigDecimal array. */
	static final int ARRAY_SIZE = 500000;
	/** A number of BigDecimal that user want to add. */
	int counter;

	/**
	 * Constructor that set number of BigDecimal.
	 * 
	 * @param counter
	 *            maximum number of BigDecimal that user want to add.
	 */
	public TaskSumBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * Add a number 1 to ARRAY_SIZE and then find sum of all number by add
	 * method from BigDecimal class.
	 */
	public void run() {
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		BigDecimal sum = new BigDecimal(0.0);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
		System.out.println("sum = " + sum);
	}

	/**
	 * Return the string information from this task.
	 * 
	 * @return the string information from this task.
	 */
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter);
	}
}
