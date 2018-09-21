import java.io.*;

public class Algo1562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int[][] dp = new int[n+1][10];
        if (n >= 10)
            dp[10][9] = 1;
        for (int i = 11; i <= n; ++i) {
            dp[i][0] = dp[i-1][1];
            dp[i][9] = dp[i-1][8];
            for (int j = 1; j < 9; ++j) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%1000000000;
            }
        }
        int num = 0;
        for (int i = 0; i <= 9; ++i) {
            num = (num+dp[n][i])%1000000000;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num));
        bw.close();
    }
}
