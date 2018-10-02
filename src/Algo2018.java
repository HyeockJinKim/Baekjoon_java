//import java.io.*;
//
//public class Algo2018 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        br.close();
//        int sum = 0, len = n/2+2, count = 0;
//        for (int i = 0; i < len; ++i) {
//            sum += i;
//            if (sum > n) {
//                sum = i;
//            } else if (sum == n) {
//                sum = i;
//                ++count;
//            }
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.close();
//    }
//}
