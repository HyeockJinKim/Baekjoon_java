//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo2004 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        int n, m;
//        n = Integer.parseInt(tokenizer.nextToken());
//        m = Integer.parseInt(tokenizer.nextToken());
//        br.close();
//        if (m > n-m) {
//            m = n-m;
//        }
//        int c2 = 0, c5 = 0;
//        int t = n-m+1;
//        long v = 2;
//        while (t <= n) {
//            int temp = (int)(t % v);
//            t += temp;
//            if (t <= n) {
//                c2 += (n - temp) / v;
//                v *= 2;
//            }
//        }
//        t = n-m+1;
//        v = 5;
//        System.out.println(c2);
//        while (t <= n) {
//            int temp = (int)(t % v);
//            t += temp;
//            if (t <= n) {
//                c5 += (n - temp) / v ;
//                v *= 5;
//            }
//        }
//        System.out.println(c5);
//
//        t = 2;
//        v = 2;
//        while (t <= m) {
//            int temp = (int)(t % v);
//            t += temp;
//            if (t <= m) {
//                c2 -= (m - temp) / v;
//                v *= 2;
//            }
//        }
//        System.out.println(c2);
//        t = 5;
//        v = 5;
//        while (t <= m) {
//            int temp = (int)(t % v);
//            t += temp;
//            if (t <= m) {
//                c5 -= (m-temp)/v;
//                v *= 5;
//            }
//        }
//        System.out.println(c5);
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.valueOf(c2 <= c5 ? c2 : c5));
//        bw.close();
//    }
//}
