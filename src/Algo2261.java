//import java.io.*;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Algo2261 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] xy = new int[n][2];
//        for (int i = 0; i < n; ++i) {
//            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//            xy[i][0] = Integer.parseInt(tokenizer.nextToken());
//            xy[i][1] = Integer.parseInt(tokenizer.nextToken());
//        }
//        br.close();
//        Arrays.sort(xy, (x1, x2) -> {
//            if (x1[0] > x2[0]) {
//                return 1;
//            } else if (x1[0] < x2[0]) {
//                return -1;
//            } else {
//                if (x1[1] > x2[1]) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        });
//        for (int i = 0; i < n; ++i) {
//            System.out.println(Arrays.toString(xy[i]));
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.close();
//    }
//
//    private static int dist(int s, int e) {
//
//    }
//}
