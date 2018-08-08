//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo13277 {
//    private static long[] a, b, result;
//    private static final long SIZE = 1000000000;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        String t1 = tokenizer.nextToken();
//        String t2 = tokenizer.nextToken();
//        br.close();
//        int lt1, lt2;
//        lt1 = t1.length()/9+1;
//        lt2 = t2.length()/9+1;
//        a = new long[lt1];
//        b = new long[lt2];
//        result = new long[lt1+lt2];
//        int s, e;
//        s = t1.length() > 9 ? t1.length()-9 : 0;
//        e = t1.length();
//        for (int i = 0; i < lt1; ++i) {
//            a[i] = Long.parseLong(t1.substring(s, e));
//            e = s;
//            s = s > 9 ? s-9 : 0;
//        }
//        s = t2.length() > 9 ? t2.length()-9 : 0;
//        e = t2.length();
//        for (int i = 0; i < lt1; ++i) {
//            a[i] = Long.parseLong(t2.substring(s, e));
//            e = s;
//            s = s > 9 ? s-9 : 0;
//        }
//        String result = mul(0, a.length, 0, b.length);
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(result);
//        bw.close();
//    }
//
//    private static String mul(int sa, int ea, int sb, int eb) {
//
//        if (sa == ea && sb == eb) {
//            long t = a[sa] * b[sb];
//            result[sa+sb] = t%SIZE;
//            result[sa+sb+1] = t/SIZE;
//        } else if (sa == ea) {
//            int mid = (sb+eb)/2;
//            mul(sa, ea, sb, mid);
//            mul(sa, ea, mid, eb);
//        } else if (sb == eb) {
//
//        } else {
//
//        }
//
//        StringBuilder builder = new StringBuilder();
//        boolean isFirst = true;
//        for (int i = result.length; i >= 0; --i) {
//            if (!isFirst || result[i] != 0) {
//                isFirst = false;
//                builder.append(a[i]);
//            }
//        }
//        return builder.toString();
//    }
//}