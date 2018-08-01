//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo2468 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int num = 0;
//        for (int i = 0; i < n; ++i) {
//            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n; ++j) {
//                if (n < Integer.parseInt(tokenizer.nextToken())) {
//                    ++num;
//                }
//            }
//        }
//        br.close();
//
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.format("%d", num));
//        bw.newLine();
//        bw.close();
//    }
//}
