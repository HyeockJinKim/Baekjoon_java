//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Algo1238 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n, m, x;
//        String[] line = br.readLine().split(" ");
//
//        n = Integer.parseInt(line[0]);
//        m = Integer.parseInt(line[1]);
//        x = Integer.parseInt(line[2]);
//
//        int[][] g = new int[n+1][n+1];
//        for (int i = 1; i <= n; ++i) {
//            for (int j = 1; j <= n; ++j) {
//                g[i][j] = 9999999;
//            }
//        }
//
//        for (int i = 0; i < m; ++i) {
//            line = br.readLine().split(" ");
//            int a,b,c;
//            a = Integer.parseInt(line[0]);
//            b = Integer.parseInt(line[1]);
//            c = Integer.parseInt(line[2]);
//            g[a][b] = c;
//        }
//        br.close();
//        for (int i = 1; i <= n; ++i) {
//            for (int j = 1; j <= n; ++j) {
//                for (int k = 1; k <= n; ++k) {
//                    g[j][k] = g[j][k] > g[j][i] + g[i][k] ? g[j][i] + g[i][k] : g[j][k];
//                }
//            }
//        }
//        int max = 0;
//
//        for (int i = 1; i <= n; ++i) {
//            int sum = g[i][x]+g[x][i];
//            if (max < sum) {
//                max = sum;
//            }
//        }
//        System.out.println(max);
//    }
//}
