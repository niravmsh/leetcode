package org.varin.algorithms;

import java.util.Arrays;
import java.util.TreeMap;

public class MaximumProfitJobScheduling {
	private class Job implements Comparable<Job> {
		int startTime, endTime, profit;

		Job(int startTime, int endTime, int profit) {
			this.startTime = startTime;
			this.endTime = endTime;
			this.profit = profit;
		}

		@Override
		public int compareTo(Job o) {
			return this.endTime - o.endTime;
		}
	}

	public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

		Job[] jobs = new Job[startTime.length];

		for (int i = 0; i < startTime.length; i++) {
			jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
		}

		Arrays.sort(jobs);

		TreeMap<Integer, Integer> profitMap = new TreeMap<>();
		profitMap.put(0, 0);

		for (Job job : jobs) {
			int result = job.profit + profitMap.floorEntry(job.startTime).getValue();
			if (result > profitMap.lastEntry().getValue()) {
				profitMap.put(job.endTime, result);
			}
		}

		return profitMap.lastEntry().getValue();

	}
}
