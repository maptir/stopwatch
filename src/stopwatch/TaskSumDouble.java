package stopwatch;

public class TaskSumDouble implements Runnable {
	static final int ARRAY_SIZE = 500000;
	int counter;

	public TaskSumDouble(int counter) {
		this.counter = counter;
	}

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

	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter);
	}
}
