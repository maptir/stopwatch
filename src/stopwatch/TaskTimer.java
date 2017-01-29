package stopwatch;

public class TaskTimer {
	Stopwatch timer;

	public void taskTimer(Runnable task) {
		timer = new Stopwatch();
		
		System.out.print(task);
		timer.start();

		task.run();

		timer.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
