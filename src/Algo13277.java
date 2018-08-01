//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo13277 {
//    private static long[] a, b;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        String temp = tokenizer.nextToken();
//        int len = temp.length();
//        a = new long[len/9+1];
//        input(temp, len, a);
//
//        temp = tokenizer.nextToken();
//        len = temp.length();
//        b = new long[len/9+1];
//        input(temp, len, b);
//        br.close();
//
//        long[] mul = new long[a.length+b.length];
//        for (int i = 0; i < mul.length; ++i) {
//            mul[i] = -1;
//        }
//
//        long limit = Long.valueOf("1000000000000000000");
//        for (int i = 0; i < a.length; ++i) {
//            for (int j = 0; j < b.length; ++j) {
//                if (mul[i+j] == -1)
//                    mul[i+j] = a[i] * b[j];
//                else
//                    mul[i+j] += a[i] * b[j];
//                if (mul[i+j] >= limit) {
//                    if (mul[i+j+1] == -1)
//                        mul[i+j+1] = mul[i+j]/limit;
//                    else {
//                        mul[i + j + 1] += mul[i + j] / limit;
//                    }
//                    mul[i+j] %= limit;
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = mul.length-1; i >= 0; --i) {
//            if (mul[i] != -1)
//                sb.append(mul[i]);
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.format("%s", sb.toString()));
//        bw.close();
//    }
//
//    private static void input(String temp, int len, long[] b) {
//        int limit = len/9+1;
//        for (int i = 0; i < limit; ++i) {
//            int start, end;
//            start = i*9 < len ? i*9 : len;
//            end = (i+1)*9 < len ? (i+1) * 9 : len;
//            b[i] = Long.parseLong(temp.substring(start, end));
//        }
//    }
//}