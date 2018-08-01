//import java.io.*;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class Algo1238 {
//    private static int n, m, x;
//    private static int[][] g;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(tokenizer.nextToken());
//        m = Integer.parseInt(tokenizer.nextToken());
//        x = Integer.parseInt(tokenizer.nextToken());
//
//        g = new int[n+1][n+1];
//
//
//        for (int i = 0; i < m; ++i) {
//            tokenizer = new StringTokenizer(br.readLine());
//            int a, b, c;
//            a = Integer.parseInt(tokenizer.nextToken());
//            b = Integer.parseInt(tokenizer.nextToken());
//            c = Integer.parseInt(tokenizer.nextToken());
//            g[a][b] = c;
//        }
//        br.close();
//
//        int max = 0;
//        for (int i = 1; i <= n; ++i) {
//            int dist = dijkstra(i, x);
//            max = max >= dist ? max : dist;
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.format("%d", max));
//        bw.newLine();
//        bw.close();
//    }
//
//    private static int dijkstra(int src, int dst) {
//        boolean[] isVisit = new boolean[n+1];
//        int[] dist = new int[n+1];
//        for (int i = 1; i <= n; ++i) {
//            dist[i] = 1000000000;
//        }
//
//        for (int i = 1; i <= n; ++i) {
//            if (g[src][i] != 0)
//                dist[i] = g[src][i];
//        }
//        dist[src] = 0;
//        isVisit[src] = true;
//
//        for (int i = 1; i <= n; ++i) {
//            int min = Integer.MAX_VALUE;
//            int minIndex = src;
//            for (int j = 1; j <= n; ++j) {
//                if (min > dist[j] && !isVisit[j]) {
//                    min = dist[j];
//                    minIndex = j;
//                }
//            }
//            isVisit[minIndex] = true;
//
//            for (int j = 1; j <= n; ++j) {
//                if (!isVisit[j]) {
//                    if (min + g[minIndex][j] < dist[j]) {
//                        dist[j] = min+g[minIndex][j];
//                    }
//                }
//            }
//        }
//        return dist[dst];
//    }
//}
