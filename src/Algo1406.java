import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 /* Time Over */
public class Algo1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length; ++i) {
            sb.append(word[i]);
        }
        int cursor = word.length;
        int len = word.length;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; ++i) {
            String cmd = br.readLine();
            switch (cmd.charAt(0)) {
                case 'L':
                    cursor = cursor > 0 ? cursor-1 : cursor;
                    break;
                case 'D':
                    cursor = cursor != len ? cursor+1 : cursor;
                    break;
                case 'B':
                    if (cursor > 0) {
                        sb.delete(cursor-1, cursor);
                        --cursor;
                        --len;
                    }
                    break;
                case 'P':
                    char[] next = cmd.split(" ")[1].toCharArray();
                    for (int j = 0; j < next.length; ++j) {
                        sb.insert(cursor++, next[j]);
                        ++len;
                    }
                    break;
            }
        }
        br.close();
        System.out.println(sb.toString());

    }
}