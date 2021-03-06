import java.io.*;

public class Algo9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        long[] p = new long[101];
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        p[4] = 2;
        p[5] = 2;
        p[6] = 3;
        p[7] = 4;
        p[8] = 5;
        p[9] = 7;
        p[10] = 9;
        for (int i = 11; i <= 100; ++i) {
            p[i] = p[i-5] + p[i-1];
        }
        for (int i = 0; i < t; ++i) {
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(p[n]));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
