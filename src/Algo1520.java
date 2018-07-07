import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Cancel
public class Algo1520 {
    static int m, n;
    static int[][] map, counts;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);
        counts = new int[m+2][n+2];
        map = new int[m+2][n+2];
        for (int i = 1; i <= m; ++i) {
            int j = 1;
            for (String s1: br.readLine().split(" ")) {
                map[i][j++] = Integer.parseInt(s1);
            }
        }
        br.close();
        System.out.println(dfs(1, 1));
    }

    private static int dfs(int i, int j) {
        if (i == m && j == n) return 1;
        if (map[i][j] < 1) return 0;
        counts[i][j] = 0;
        if (map[i][j] > map[i+1][j])
            counts[i][j] += dfs(i+1, j);
        if (map[i][j] > map[i][j+1])
            counts[i][j] += dfs(i, j+1);
        if (map[i][j] > map[i-1][j])
            counts[i][j] += dfs(i-1, j);
        if (map[i][j] > map[i][j-1])
            counts[i][j] += dfs(i, j-1);
        return counts[i][j];
    }

}
