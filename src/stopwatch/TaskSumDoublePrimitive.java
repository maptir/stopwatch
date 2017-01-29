package stopwatch;

public class TaskSumDoublePrimitive implements Runnable {
	static final int ARRAY_SIZE = 500000;
	int counter;

	public TaskSumDoublePrimitive(int counter) {
		this.counter = counter;
	}

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
	
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d\n", counter);
	}
}
