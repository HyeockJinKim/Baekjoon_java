//import java.io.*;
//import java.util.StringTokenizer;
//
//public class Algo13277 {
//    private static long[] a, b;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        String t1 = tokenizer.nextToken();
//        String t2 = tokenizer.nextToken();
//        br.close();
//        String result = mul(0, a.length, 0, b, "");
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(result);
//        bw.close();
//    }
//
//    private static String plus(int a, int b) {
//        long t1, t2;
//        t1 = Long.parseLong(a);
//        t2 = Long.parseLong(a);
//        return String.valueOf(t1*t2);
//    }
//    private static String sub(int a, int b) {
//        long t1, t2;
//        t1 = Long.parseLong(a);
//        t2 = Long.parseLong(a);
//        return String.valueOf(t1*t2);
//    }
//
//    private static String mul(int sa, int ea, int sb, int eb, String plus) {
//        if (!"".equals(plus))
//            c = plus(c, plus);
//        int l1, l2;
//        if (a.length() < c.length()) {
//            String temp = a;
//            a = c;
//            c = temp;
//        }
//        l1 = a.length();
//        l2 = c.length();
//
//        if (l1 <= 9) {
//            long t1, t2;
//            t1 = Long.parseLong(a);
//            t2 = Long.parseLong(c);
//            return String.valueOf(t1*t2);
//        } else if (l2 <= 9) {
//            String bc, ac;
//            String b = a.substring(l1-9);
//            a = a.substring(0, l1-9);
//            int tlen;
//            bc = mul(b, c, plus);
//            tlen = bc.length();
//            ac = mul(a, c, bc.substring(tlen <= 9 ? 0 : tlen-9));
//            return ac+bc;
//        } else {
//            String ac, bd, ab, cd, abcd;
//            String b = a.substring(l1-9);
//            String d = c.substring(l2-9);
//            a = a.substring(0, l1-9);
//            c = c.substring(0, l2-9);
//            int tlen;
//            bd = mul(b, d, "");
//            ac = mul(a, c, "");
//            ab = plus(a, b);
//            cd = plus(c, d);
//            abcd = mul(ab, cd, "");
//
//
//        }
//    }
//}