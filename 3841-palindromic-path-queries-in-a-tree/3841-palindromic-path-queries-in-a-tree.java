class Solution {
    private int[][] up;
    private int[] tin, tout, depth;
    private int timer;
    private List<Integer>[] adj;
    private Fenwick bit;

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        int LOG = 32 - Integer.numberOfLeadingZeros(n);

        up = new int[LOG][n];
        tin = new int[n];
        tout = new int[n];
        depth = new int[n];

        timer = 0;
        dfs(0, 0);

        bit = new Fenwick(n + 1);
        char[] chars = s.toCharArray();

        for (int i = 0; i < n; i++) {
            int mask = 1 << (chars[i] - 'a');
            bit.update(tin[i], mask);
            bit.update(tout[i] + 1, mask);
        }

        List<Boolean> result = new ArrayList<>();

        for (String q : queries) {
            String[] p = q.split(" ");

            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);

                int oldMask = 1 << (chars[u] - 'a');
                int newMask = 1 << (c - 'a');
                int change = oldMask ^ newMask;

                bit.update(tin[u], change);
                bit.update(tout[u] + 1, change);

                chars[u] = c;
            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                int ancestor = lca(u, v);

                int mask = bit.query(tin[u])
                         ^ bit.query(tin[v])
                         ^ (1 << (chars[ancestor] - 'a'));

                result.add((mask & (mask - 1)) == 0);
            }
        }

        return result;
    }

    private void dfs(int u, int parent) {
        tin[u] = ++timer;
        up[0][u] = parent;

        for (int j = 1; j < up.length; j++) {
            up[j][u] = up[j - 1][up[j - 1][u]];
        }

        for (int v : adj[u]) {
            if (v == parent) {
                continue;
            }

            depth[v] = depth[u] + 1;
            dfs(v, u);
        }

        tout[u] = timer;
    }

    private int lca(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = 0; j < up.length; j++) {
            if ((diff & (1 << j)) != 0) {
                u = up[j][u];
            }
        }

        if (u == v) {
            return u;
        }

        for (int j = up.length - 1; j >= 0; j--) {
            if (up[j][u] != up[j][v]) {
                u = up[j][u];
                v = up[j][v];
            }
        }

        return up[0][u];
    }

    private static class Fenwick {
        int[] tree;
        int n;

        Fenwick(int n) {
            this.n = n;
            tree = new int[n + 1];
        }

        void update(int index, int value) {
            for (int i = index; i <= n; i += i & -i) {
                tree[i] ^= value;
            }
        }

        int query(int index) {
            int ans = 0;

            for (int i = index; i > 0; i -= i & -i) {
                ans ^= tree[i];
            }

            return ans;
        }
    }
}
