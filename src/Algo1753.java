//import java.io.*;
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class Algo1753 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        int v, e, k;
//        v = Integer.parseInt(tokenizer.nextToken());
//        e = Integer.parseInt(tokenizer.nextToken());
//        k = Integer.parseInt(br.readLine());
//        ArrayList<int[]> g = new ArrayList<>();
//        for (int i = 0; i < e; ++i) {
//            tokenizer = new StringTokenizer(br.readLine());
//            int t1, t2 ,t3;
//            t1 = Integer.parseInt(tokenizer.nextToken());
//            t2 = Integer.parseInt(tokenizer.nextToken());
//            t3 = Integer.parseInt(tokenizer.nextToken());
//            g.add(new int[]{t1, t2, t3});
//        }
//
//        for (int i = 1; i <= v; ++i) {
//            for (int j = 1; j <= v; ++j) {
//                for (int l = 1; l <= v; ++l) {
//                    g[j][l] = g[j][l] <= g[j][i] + g[i][l] ? g[j][l] : g[j][i] + g[i][l];
//                }
//            }
//        }
//        br.close();
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 1; i <= v; ++i) {
//            if (g[k][i] == MAX_VALUE) {
//                bw.write("INF");
//            } else {
//                bw.write(String.valueOf(g[k][i]));
//            }
//            bw.newLine();
//        }
//        bw.close();
//    }
//
//}
