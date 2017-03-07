package stopwatch;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();

		TaskAppendToString task1 = new TaskAppendToString(50000);
		TaskAppendToString task2 = new TaskAppendToString(100000);
		TaskAppendToStringBuilder task3 = new TaskAppendToStringBuilder(100000);

		int counter = 1000000000;
		TaskSumDoublePrimitive task4 = new TaskSumDoublePrimitive(counter);
		TaskSumDouble task5 = new TaskSumDouble(counter);
		TaskSumBigDecimal task6 = new TaskSumBigDecimal(counter);

		timer.measureAndPrint(task1);
		timer.measureAndPrint(task2);
		timer.measureAndPrint(task3);
		timer.measureAndPrint(task4);
		timer.measureAndPrint(task5);
		timer.measureAndPrint(task6);

	}
}