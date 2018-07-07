import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo1068 {
    static boolean[] nodes;
    static int n;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        count = 0;
        br.readLine();
        nodes = new boolean[n];
        int remover = Integer.parseInt(br.readLine());
        br.close();

        remove(remover);
        search(0);
        System.out.println(count);
    }

    private static void search(int index) {
        if (n <= index) return;
        boolean isLeaf = true;
        int next = 2*index+1;
        if (next < n) {
            if (!nodes[next]) {
                isLeaf = false;
                search(next);
            }
        }
        if (++next < n) {
            if (!nodes[next]) {
                isLeaf = false;
                search(next);
            }
        }
        if (isLeaf) {
            ++count;
        }
    }

    private static void remove(int index) {
        if (n <= index) return;
        nodes[index] = true;
        remove(2*index+1);
        remove(2*index+2);
    }
}
