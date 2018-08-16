import java.io.*;
import java.util.StringTokenizer;

public class Algo6591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int n, k;
            n = Integer.parseInt(tokenizer.nextToken());
            k = Integer.parseInt(tokenizer.nextToken());
            if (n == 0) {
                break;
            }
            for (int i = 2; i < n; ++i) {
                if (!check[i]) {
                    for (int j = i*i; j < n; j += i) {
                        check[j] = true;
                    }
                }
            }

        }
        br.close();
        bw.close();
    }
}
