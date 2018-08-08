import java.io.*;
import java.util.StringTokenizer;

public class Algo1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        long min, max;
        min = Long.parseLong(tokenizer.nextToken());
        max = Long.parseLong(tokenizer.nextToken());
        br.close();
        int len = (int)(max-min);
        boolean[] dp = new boolean[len+1];
        long t = 4;
        int t2 = (int)(t-min%t);
        int sq = (int)Math.sqrt(max);
        for (int i = 2; i <= sq; ++i) {
            for (int j = t2 ; j <= len; j += t) {
                if (j < 0)
                    break;
                dp[j] = true;
            }
            t = (i+1)*(i+1);
            t2 = (int)(t- min%t);
        }
        int count = 0;
        for (int i = 1; i <= len; ++i) {
            if (!dp[i]) {
                ++count;
            }

        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.close();
    }
}
