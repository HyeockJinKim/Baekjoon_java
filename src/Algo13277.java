//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo13277 {
//    private static String a, b;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        a = tokenizer.nextToken();
//        b = tokenizer.nextToken();
//        br.close();
//        String result = mul(a, b, "");
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(result);
//        bw.close();
//    }
//
//    private static String plus(String a, String b) {
//        long t1, t2;
//        t1 = Long.parseLong(a);
//        t2 = Long.parseLong(a);
//        return String.valueOf(t1*t2);
//    }
//
//    private static String mul(String a, String b, String plus) {
//        if (!"".equals(plus))
//            b = plus(b, plus);
//        String t1, t2, t3, t4;
//        int l1, l2;
//        l1 = a.length();
//        l2 = b.length();
//
//        if (l1 <= 9) {
//            t1 = null;
//            t2 = a;
//        } else {
//            int t = a.length()-9;
//            t1 = a.substring(0, t);
//            t2 = a.substring(t);
//        }
//        if (l2 < 9) {
//            t3 = null;
//            t4 = b;
//        } else {
//            int t = b.length()-9;
//            t3 = b.substring(0, t);
//            t4 = b.substring(t);
//        }
//        if (t1 != null && t3 != null) {
//
//        } else if (t1 != null) {
//            String t = mul(t2, t4, plus);
//            int len = t.length() > 9 ? t.length()-9 : 0;
//            return mul(t1, t4, t.substring(0, len));
//        } else if (t3 != null) {
//            String t = mul(t2, t4, plus);
//            int len = t.length() > 9 ? t.length()-9 : 0;
//            return mul(t3, t2, t.substring(0, len));
//        } else {
//            return String.valueOf(Long.parseLong(t2) * Long.parseLong(t4));
//        }
//
//    }
//}