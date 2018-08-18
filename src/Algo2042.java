//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo2042 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        int n, m, k;
//        n = Integer.parseInt(tokenizer.nextToken());
//        m = Integer.parseInt(tokenizer.nextToken());
//        k = Integer.parseInt(tokenizer.nextToken());
//        long[][] num = new long[(int)Math.log(n)+1][];
//        long[] result = new long[k];
//        int index = 0;
//        num[0] = new long[n+1];
//        for (int i = 1; i <= n; ++i) {
//            num[0][i] = Integer.parseInt(br.readLine());
//        }
//        for (int i = 1; i < num.length; ++i) {
//            num[i] = new long[num[i-1].length/2+1];
//            for (int j = 1; j < num[i].length; ++j) {
//                num[i][j] = num[i-1][2*j-1]+num[i-1][2*j];
//            }
//        }
//        for (int i = 0; i < m+k; ++i) {
//            tokenizer = new StringTokenizer(br.readLine());
//            int a, b, c;
//            a = Integer.parseInt(tokenizer.nextToken());
//            b = Integer.parseInt(tokenizer.nextToken());
//            c = Integer.parseInt(tokenizer.nextToken());
//            if (a == 2) {
//                long sum = 0;
//                int len = c-b+1;
//                while (len > 0) {
//                    
//                }
//                result[index++] = sum;
//            } else {
//                long t = c-num[0][b];
//                for (int j = 0; j < num.length; ++j) {
//                    num[j][b] += t;
//                    b = (b+1)/2;
//                }
//            }
//        }
//        br.close();
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        for (int i = 0; i < k; ++i) {
//            bw.write(String.valueOf(result[i]));
//            bw.newLine();
//        }
//        bw.close();
//    }
//}
