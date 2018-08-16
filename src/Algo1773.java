import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Algo1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, c;
        n = Integer.parseInt(tokenizer.nextToken());
        c = Integer.parseInt(tokenizer.nextToken());
        Set<Integer> check = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            int t = Integer.parseInt(br.readLine());
            for (int j = t; j <= c; j += t) {
                check.add(j);
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(check.size()));
        bw.close();
    }
}
