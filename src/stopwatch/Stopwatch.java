package stopwatch;

import java.util.Scanner;

public class Stopwatch {
	private static final double NANOSECONDS = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean running;

	public Stopwatch() {
		running = false;
	}

	public void start() {
		if (running) {
			return;
		}
		this.startTime = System.nanoTime();
		running = true;
	}

	public void stop() {
		if (running) {
			this.stopTime = System.nanoTime();
		}
		running = false;
	}

	public double getElapsed() {
		if (running) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		}
		return (stopTime - startTime) * NANOSECONDS;
	}

	public boolean isRunning() {
		if (running) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Stopwatch timer = new Stopwatch();
		Scanner s = new Scanner(System.in);
		System.out.println("Starting task");
		System.out.print("Enter to Start : ");
		s.nextLine();
		timer.start();
		System.out.print("Enter to Stop : ");
		s.nextLine();
		timer.stop(); // stop timing the work
		System.out.printf("elapsed = %.6f sec\n", timer.getElapsed());
		if (timer.isRunning())
			System.out.println("timer is still running!");
		else
			System.out.println("timer is stopped");
	}
}
