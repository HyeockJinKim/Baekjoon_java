import java.io.*;

public class Algo2998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] bin = br.readLine().toCharArray();
        br.close();
        int mod = bin.length%3;
        for (int i = 0; i < mod; ++i) {

        }
        for (int i = bin.length-3; i >= mod; i -= 3) {
            int sum = (bin[i]-'0')*4+(bin[i+1]-'0')*2+(bin[i+2]-'0');

            bw.write();
        }


        bw.close();
    }
}
