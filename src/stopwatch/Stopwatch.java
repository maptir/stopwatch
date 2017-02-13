package stopwatch;

import java.util.Scanner;

/**
 * A stopwatch class that can count time elapse from start to stop.
 * 
 * @author Archawin Tirugsapun
 *
 */
public class Stopwatch {
	/** Constant number that can convert nanoseconds to second. */
	private static final double NANOSECONDS = 1.0E-9;
	/** Time that stopwatch start. */
	private long startTime;
	/** Time that stopwatch stop. */
	private long stopTime;
	/** Boolean that can tell stopwatch is start or stop. */
	private boolean running;

	/**
	 * A method that set startTime to that time if stopwatch is not running.
	 */
	public void start() {
		if (!isRunning()) {
			this.startTime = System.nanoTime();
			running = true;
		}
	}

	/**
	 * A method that set stopTime to that time if stopwatch is running.
	 */
	public void stop() {
		if (isRunning()) {
			this.stopTime = System.nanoTime();
			running = false;
		}
	}

	/**
	 * Return elapsed time of stop and start time if stopwatch is not running
	 * but if stopwatch is running it return elapsed time between that time and
	 * the start time.
	 * 
	 * @return elapsed time.
	 */
	public double getElapsed() {
		if (isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		}
		return (stopTime - startTime) * NANOSECONDS;
	}

	/**
	 * Return true if stopwatch is running, false if is not running.
	 * 
	 * @return true if stopwatch is running, false if is not running.
	 */
	public boolean isRunning() {
		return running;
	}

	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();
		Scanner s = new Scanner(System.in);
		System.out.println("Starting task");
		System.out.print("Enter to Start");
		s.nextLine();
		timer.start();
		System.out.print("Enter to Stop");
		s.nextLine();
		timer.stop(); // stop timing the work
		System.out.printf("elapsed = %.6f sec\n", timer.getElapsed());
		if (timer.isRunning())
			System.out.println("timer is still running!");
		else
			System.out.println("timer is stopped");
	}
}
