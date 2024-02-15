package Assignment_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Job {
	int start, finish, profit;

	Job(int start, int finish, int profit) {
		this.start = start;
		this.finish = finish;
		this.profit = profit;
	}
}

public class WeightedIntervalScheduling {

	public static int findMaxProfit(List<Job> jobs) {

		Collections.sort(jobs, Comparator.comparingInt(x -> x.start));

		int n = jobs.size();

		if (n == 0) {
			return 0;
		}

		int[] maxProfit = new int[n];

		for (int i = 0; i < n; i++) {

			maxProfit[i] = 0;

			for (int j = 0; j < i; j++) {

				if (jobs.get(j).finish <= jobs.get(i).start && maxProfit[i] < maxProfit[j]) {
					maxProfit[i] = maxProfit[j];
				}
			}

			maxProfit[i] += jobs.get(i).profit;
		}

		return Arrays.stream(maxProfit).max().getAsInt();
	}

	public static void main(String[] args) {
		List<Job> jobs = Arrays.asList(new Job(0, 6, 60), new Job(5, 9, 50), new Job(1, 4, 30), new Job(5, 7, 30),
				new Job(3, 5, 10), new Job(7, 8, 10));

		System.out.println("The maximum profit is " + findMaxProfit(jobs));
	}
}