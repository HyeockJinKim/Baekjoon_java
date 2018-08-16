//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo1600 {
//    private static int[][] map;
//    private static boolean isSuccess;
//    private static int k, w, h;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        k = Integer.parseInt(br.readLine());
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        w = Integer.parseInt(tokenizer.nextToken());
//        h = Integer.parseInt(tokenizer.nextToken());
//        map = new int[h][w];
//        for (int i = 0; i < h; ++i) {
//            tokenizer = new StringTokenizer(br.readLine());
//            for (int j = 0; j < w; ++j) {
//                map[i][j] = Integer.parseInt(tokenizer.nextToken());
//            }
//        }
//        br.close();
//
//        int result = dfs(0, 0, k,  new boolean[h][w]);
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        if (isSuccess)
//            bw.write(String.valueOf(result-1));
//        else
//            bw.write("-1");
//        bw.close();
//    }
//
//    private static int dfs(int i, int j, int count, boolean[][] isCheck) {
//        if (isCheck[i][j]){
//            return 0;
//        }
//        if (i == h-1 && j == w-1) {
//            isSuccess = true;
//            return 1;
//        }
//        isCheck[i][j] = true;
//
//        int result = Integer.MAX_VALUE;
//        if (count > 0) {
//            if (i > 1) {
//                if (j > 0 && map[i - 2][j - 1] != 1) {
//                    int t = dfs(i - 2, j - 1, count - 1, isCheck);
//                    if (t > 0)
//                        result = result <= t ? result : t;
//                }
//                if (j < w - 1 && map[i - 2][j + 1] != 1) {
//                    int t = dfs(i - 2, j + 1, count - 1, isCheck);
//                    if (t > 0)
//                        result = result <= t ? result : t;
//                }
//            }
//            if (j > 1) {
//                if (i > 0 && map[i - 1][j - 2] != 1) {
//                    int t = dfs(i - 1, j - 2, count - 1, isCheck);
//                    if (t > 0)
//                        result = result <= t ? result : t;
//                }
//                if (i < h - 1 && map[i + 1][j - 2] != 1) {
//                    int t = dfs(i + 1, j - 2, count - 1, isCheck);
//                    if (t > 0)
//                        result = result <= t ? result : t;
//                }
//            }
//            if (i < h - 2) {
//                if (j > 0 && map[i + 2][j - 1] != 1) {
//                    int t = dfs(i + 2, j - 1, count - 1, isCheck);
//                    if (t > 0)
//                        result = result <= t ? result : t;
//                }
//                if (j < w - 1 && map[i + 2][j + 1] != 1) {
//                    int t = dfs(i + 2, j + 1, count - 1, isCheck);
//                    if (t > 0)
//                        result = result <= t ? result : t;
//                }
//            }
//            if (j < w - 2) {
//                if (i > 0 && map[i - 1][j + 2] != 1) {
//                    int t = dfs(i - 1, j + 2, count - 1, isCheck);
//                    if (t > 0)
//                        result = result <= t ? result : t;
//                }
//                if (i < h - 1 && map[i + 1][j + 2] != 1) {
//                    int t = dfs(i + 1, j + 2, count - 1, isCheck);
//                    if (t > 0)
//                        result = result <= t ? result : t;
//                }
//            }
//        }
//
//        if (i > 0 && map[i-1][j] != 1) {
//            int t = dfs(i-1, j, count, isCheck);
//            if (t > 0)
//                result = result <= t ? result : t;
//        }
//        if (j > 0 && map[i][j-1] != 1) {
//            int t = dfs(i, j-1, count, isCheck);
//            if (t > 0)
//                result = result <= t ? result : t;
//        }
//        if (i < h-1 && map[i+1][j] != 1) {
//            int t = dfs(i+1, j, count, isCheck);
//            if (t > 0)
//                result = result <= t ? result : t;
//        }
//        if (j < w-1 && map[i][j+1] != 1) {
//            int t = dfs(i, j+1, count, isCheck);
//            if (t > 0)
//                result = result <= t ? result : t;
//        }
//        isCheck[i][j] = false;
//        if (result == Integer.MAX_VALUE) {
//            return 0;
//        }
//        if (result > 0) {
//            return result + 1;
//        }
//        return 0;
//    }
//}
