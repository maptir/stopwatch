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

		timer.taskTimer(task1);
		timer.taskTimer(task2);
		timer.taskTimer(task3);
		timer.taskTimer(task4);
		timer.taskTimer(task5);
		timer.taskTimer(task6);

	}
}