import java.io.*;

public class Algo3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%.6f", Math.PI*r*r));
        bw.newLine();
        bw.write(String.format("%.6f", 2.0*r*r));
        bw.close();
    }
}
