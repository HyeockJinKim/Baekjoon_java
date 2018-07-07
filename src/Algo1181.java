import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Algo1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < n; ++i)
            treeSet.add(br.readLine());
        br.close();

        while (!treeSet.isEmpty()) {
            String t = treeSet.stream()
                    .reduce((x, y) -> x.length() <= y.length() ? x : y)
                    .get();
            System.out.println(t);
            treeSet.remove(t);
        }


    }
}