import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        for (int i = 0; i < n; ++i) {
            sum += Integer.parseInt(br.readLine())-1;
        }
        br.close();
        System.out.println(sum);
    }
}