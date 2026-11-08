import java.util.*;

public class MainQ5 {
    interface Comparison {
        int compare(int a, int b);
    }

    static void sort(List<Integer> values, Comparison order) {
        // TODO: sort using order.compare
        
    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>();
        values.add(160);
        values.add(40);
        values.add(120);
        values.add(80);

        Comparison ascending = new Comparison() {
            public int compare(int a, int b) {
                return 0;
            }
        };

        sort(values, ascending);
        System.out.println(values);
    }
}