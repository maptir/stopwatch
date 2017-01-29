package stopwatch;

/**
 * A task that run a stopwatch.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class TaskTimer {
	Stopwatch timer;

	/**
	 * Constructor that create a new stopwatch.
	 */
	public TaskTimer() {
		timer = new Stopwatch();
	}

	/**
	 * Stopwatch will count start and stop time that user run the task.
	 * 
	 * @param task
	 *            is a task that run from another class.
	 */
	public void taskTimer(Runnable task) {
		System.out.print(task);
		timer.start();

		task.run();

		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
