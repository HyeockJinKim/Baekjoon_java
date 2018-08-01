import java.io.*;
import java.util.StringTokenizer;

public class Algo2206 {
    private static int[][] dp;
    private static int[][] map;
    private static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        map = new int[n+2][m+2];
        for (int i = 1; i <= n; ++i) {
            char[] line = br.readLine().toCharArray();
            for (int j = 1; j <= m; ++j) {
                map[i][j] = line[j-1]-'0';
            }
        }
        br.close();
        dp = new int[n+2][m+2];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                dp[i][j] = 10000000;
            }
        }
        dp[1][1] = 1;
        search(1, 1, false);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (dp[n][m] == 10000000) {
            bw.write("-1");
        } else {
            bw.write(String.format("%d", dp[n][m]));
        }
        bw.newLine();
        bw.close();
    }


    private static void search(int i, int j, boolean isCrash) {
        if (i == 0 || j == 0 || i == n+1 || j == m+1)
            return ;
        if (i==n && j ==m)
            return ;
        if (map[i+1][j] == 0 && dp[i][j]+1 < dp[i+1][j]) {
            dp[i+1][j] = dp[i][j] + 1;
            search(i+1, j, isCrash);
        }
        if (map[i-1][j] == 0 && dp[i][j]+1 < dp[i-1][j]) {
            dp[i-1][j] = dp[i][j] + 1;
            search(i-1, j, isCrash);
        }
        if (map[i][j+1] == 0 && dp[i][j]+1 < dp[i][j+1]) {
            dp[i][j+1] = dp[i][j] + 1;
            search(i, j+1, isCrash);
        }
        if (map[i][j-1] == 0 && dp[i][j]+1 < dp[i][j-1]) {
            dp[i][j-1] = dp[i][j] + 1;
            search(i, j-1, isCrash);
        }
        if (!isCrash) {
            if (map[i+1][j] == 1 && dp[i][j]+1 < dp[i+1][j]) {
                dp[i+1][j] = dp[i][j] + 1;
                search(i+1, j, true);
            }
            if (map[i-1][j] == 1 && dp[i][j]+1 < dp[i-1][j]) {
                dp[i-1][j] = dp[i][j] + 1;
                search(i-1, j, true);
            }
            if (map[i][j+1] == 1 && dp[i][j]+1 < dp[i][j+1]) {
                dp[i][j+1] = dp[i][j] + 1;
                search(i, j+1, true);
            }
            if (map[i][j-1] == 1 && dp[i][j]+1 < dp[i][j-1]) {
                dp[i][j-1] = dp[i][j] + 1;
                search(i, j-1, true);
            }
        }
    }
}
