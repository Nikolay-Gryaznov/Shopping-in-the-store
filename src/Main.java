import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<String, TreeMap<String, Integer>>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String c = sc.nextLine();
            String s[] = c.split(" ");
            String name = s[0] + " " + s[1];
            String nameProd = s[2];
            Integer stoim = Integer.parseInt(s[3]);
            if (!map.containsKey(name)) {
                map.put(name, new TreeMap<String, Integer>());
            }
            TreeMap<String, Integer> tmp = map.get(name);
            if (!tmp.containsKey(nameProd)) {
                tmp.put(nameProd, 0);
            }
            Integer oldStoim = tmp.get(nameProd);
            tmp.put(nameProd, oldStoim + stoim);
        }
        for (Map.Entry<String, TreeMap<String, Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            TreeMap<String, Integer> value = entry.getValue();

            System.out.print(key + ": ");
            System.out.println();
            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();

                System.out.println("    " + keyProduct + " " + valueProduct);

            }

        }


    }
}
