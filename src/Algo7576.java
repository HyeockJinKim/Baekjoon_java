//import java.io.*;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class Algo7576 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        int m, n, num = 0;
//        m = Integer.parseInt(tokenizer.nextToken());
//        n = Integer.parseInt(tokenizer.nextToken());
//        int[][] tomato = new int[n][m];
//        Queue<int[]> queue = new LinkedList<>();
//
//        for (int i = 0; i < n; ++i) {
//            tokenizer = new StringTokenizer(br.readLine());
//            for (int j = 0; j < m; ++j) {
//                tomato[i][j] = Integer.parseInt(tokenizer.nextToken());
//                if (tomato[i][j] == 1) {
//                    queue.add(new int[]{i, j, 0});
//                } else if (tomato[i][j] == 0) {
//                    ++num;
//                }
//            }
//        }
//        br.close();
//        int prev = num;
//
//        while (true) {
//            queue
//
//
//            if (prev == num) {
//                break;
//            }
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.close();
//    }
//}
