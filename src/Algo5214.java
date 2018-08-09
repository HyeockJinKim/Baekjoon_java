//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Algo5214 {
//    private static int n, k, m;
//    private static ArrayList<int[]>[] g;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(tokenizer.nextToken());
//        k = Integer.parseInt(tokenizer.nextToken());
//        m = Integer.parseInt(tokenizer.nextToken());
//        g = new ArrayList[n+1];
//        for (int i = 1; i <= n; ++i) {
//            g[i] = new ArrayList<>();
//        }
//
//        for (int i = 0; i < m; ++i) {
//            tokenizer = new StringTokenizer(br.readLine());
//            int[] t = new int[k];
//            for (int j = 0; j < k; ++j) {
//                t[j] = Integer.parseInt(tokenizer.nextToken());
//            }
//            for (int j = 0; j < k; ++j) {
//                for (int l = j+1; l < k; ++l) {
//                    g[t[j]].add(new int[]{t[l], 1});
//                    g[t[l]].add(new int[]{t[j], 1});
//                }
//            }
//        }
//        br.close();
//        int result = dijkstra(1, n);
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.valueOf(result));
//        bw.close();
//    }
//
//    private static int dijkstra(int s, int e) {
//        int[] dist = new int[n+1];
//        boolean[] isVisit = new boolean[n+1];
//        for (int i = 0; i <= n; ++i) {
//            dist[i] = 10000000;
//        }
//        dist[s] = 0;
//        while (true) {
//            int index = -1;
//            for (int i = 1; i <= n; ++i) {
//                if (!isVisit[i]) {
//                    if (index == -1 || dist[index] > dist[i]) {
//                        index = i;
//                    }
//                }
//            }
//            if (index == -1)
//                break;
//
//            isVisit[index] = true;
//            int size = g[index].size();
//            for (int i = 0; i < size; ++i) {
//                int[] t = g[index].get(i);
//                dist[t[0]] = dist[t[0]] <= dist[index] + t[1] ? dist[t[0]] : dist[index] + t[1];
//            }
//        }
//        if (dist[e] == 10000000)
//            return -1;
//        return dist[e]+1;
//    }
//
//}
