//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Algo7569 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int m, n, h;
//        String[] mnh = br.readLine().split(" ");
//        m = Integer.parseInt(mnh[0]);
//        n = Integer.parseInt(mnh[1]);
//        h = Integer.parseInt(mnh[2]);
//        int[][][] box = new int[h][m][n];
//        for (int i = 0; i < h; ++i) {
//            for (int j = 0; j < m; ++j) {
//                String[] line = br.readLine().split(" ");
//                for (int k = 0; k < n; ++k) {
//                    box[i][j][k] = Integer.parseInt(line[k]);
//                }
//            }
//        }
//        br.close();
//        Queue<int[][]> queue = new LinkedList<>();
//        for (int i = 0; i < h; ++i) {
//            for (int j = 0; j < m; ++j) {
//                for (int k = 0; k < n; ++k) {
//                    if (box[i][j][k] == 1) {
//
//                    }
//                }
//            }
//        }
//
//
//    }
//}
