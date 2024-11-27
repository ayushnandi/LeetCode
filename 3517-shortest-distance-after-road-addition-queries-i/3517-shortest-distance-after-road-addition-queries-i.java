class Solution {
   public int bfs(List<Integer>[] adj, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        dist[0] = 0;
        q.add(0);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int it : adj[node]) {
                if (dist[node] + 1 < dist[it]) {
                    dist[it] = dist[node] + 1;
                    q.add(it);
                }
            }
        }

        return dist[n - 1];
    }

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<Integer>[] adj = new ArrayList[n];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            if (i + 1 < n) {
                adj[i].add(i + 1);
            }
        }
        for (int[] query :queries) {
            adj[query[0]].add(query[1]);
            int shortest = bfs(adj, n);
            if (shortest == Integer.MAX_VALUE) {
                ans.add(-1);
            } else {
                ans.add(shortest);
            }
        }
        int[] result =new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}