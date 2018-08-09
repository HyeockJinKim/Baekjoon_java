import java.io.*;
import java.util.StringTokenizer;

public class Algo3079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        int[] t = new int[n];
        for (int i = 0; i < n; ++i) {
            t[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.close();
    }
}
