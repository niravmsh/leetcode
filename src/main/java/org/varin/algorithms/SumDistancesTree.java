package org.varin.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDistancesTree {
	int[] ans, count;
	List<Integer>[] graph;
	int N;

	public int[] sumOfDistancesInTree(int N, int[][] edges) {
		this.N = N;
		graph = new List[N];
		ans = new int[N];
		count = new int[N];
		Arrays.fill(count, 1);

		for (int i = 0; i < N; ++i)
			graph[i] = new ArrayList<Integer>();
		for (int[] edge : edges) {
			graph[edge[0]].add(edge[1]);
			graph[edge[1]].add(edge[0]);
		}
		postOrder(0, -1);
		preOrder(0, -1);
		return ans;
	}

	public void postOrder(int node, int parent) {
		for (int child : graph[node])
			if (child != parent) {
				postOrder(child, node);
				count[node] += count[child];
				ans[node] += ans[child] + count[child];
			}
	}

	public void preOrder(int node, int parent) {
		for (int child : graph[node])
			if (child != parent) {
				ans[child] = ans[node] - count[child] + N - count[child];
				preOrder(child, node);
			}
	}
}
