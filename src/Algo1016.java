//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo1016 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        long min, max;
//        min = Long.parseLong(tokenizer.nextToken());
//        max = Long.parseLong(tokenizer.nextToken());
//        br.close();
//        int len = (int)(max-min);
//        boolean[] dp = new boolean[len+1];
//        int t = 4;
//        for (int i = 2; t <= max; ++i) {
//            t = (i+1)*(i+1);
//            int t2 = t + (int)(min%t);
//            for (int j = t ; j < max; j += t) {
//
//            }
//
//        }
//        for (int i = 0; i <= len; ++i) {
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.close();
//    }
//}
