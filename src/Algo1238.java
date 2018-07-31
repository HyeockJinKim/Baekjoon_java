import java.io.*;
import java.util.StringTokenizer;

public class Algo1238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, x;
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        x = Integer.parseInt(tokenizer.nextToken());

        int[][] g = new int[n+1][n+1];
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= n; ++j) {
                g[i][j] = 1000000000;
            }
        }

        for (int i = 0; i < m; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            int a, b, c;
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
            c = Integer.parseInt(tokenizer.nextToken());
            g[a][b] = c;
        }
        br.close();

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                for (int k = 1; k <= n; ++k) {
                        int t = g[j][i] + g[i][k];
                        g[j][k] = g[j][k] > t ? t : g[j][k];
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; ++i) {
            int sum = g[i][x] + g[x][i];
            max = max >= sum ? max : sum;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", max));
        bw.newLine();
        bw.close();
    }
}
