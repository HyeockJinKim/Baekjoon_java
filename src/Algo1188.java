import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo1188 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n, m;
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        if (m < n) {
            int t = m;
            m = n;
            n = t;
        }
        int prev = n;


        for (int i = prev; i >= 2; --i) {
            if (n % i == 0 & m % i == 0) {
                n /= i;
                m /= i;
            }
        }


        System.out.println(prev*(m-1));
    }
}
