import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algo15982 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] a = new int[10];

        Map<ArrayList<Integer>, Integer> map = new HashMap<>();
        map.put(list, 2);
        map.remove(null);
        System.out.println(Arrays.hashCode(a));
        System.out.println(map.get(list));
        System.out.println();
        list.add(2);
        a[0] = 10;
        System.out.println("asdf".hashCode());
        System.out.println(map.get(list));
        System.out.println(map.keySet());
    }


}