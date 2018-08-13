import java.io.*;
import java.util.StringTokenizer;

public class Algo1780 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                map[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.close();
    }

    private static int[] search(int is, int ie, int js, int je) {
        
    }
}
