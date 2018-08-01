import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Algo1325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        TreeMap<Integer, TreeSet<Integer>> treeMap = new TreeMap<>();
        for (int i = 1; i <= n; ++i) {
            treeMap.put(i, new TreeSet<>());
        }
        for (int i = 0; i < m; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            int t1, t2;
            t2 = Integer.parseInt(tokenizer.nextToken());
            t1 = Integer.parseInt(tokenizer.nextToken());
            treeMap.compute(t1, (k, v)-> v).add(t2);
        }
        br.close();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
//                treeMap.compute(j)
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.close();
    }
}
