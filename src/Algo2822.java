import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Algo2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(1, Collections.reverseOrder());

        for (int i = 0; i < 8; ++i) {
            int t = Integer.parseInt(br.readLine());
            queue.add(t);
        }
        br.close();

        int result = 0;
        int[] temp = new int[5];
        for (int i = 0; i < 5; ++i) {
            temp[i] = queue.poll();
            result += temp[i];
        }
        System.out.println(result);
        for (int i = 0; i < 5; ++i) {
            System.out.print(String.format("%d ", temp[i]));
        }
    }
}
