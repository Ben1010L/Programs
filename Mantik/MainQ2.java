import java.util.*;
import java.util.ArrayList;
public class MainQ2 {
    interface Transformer {
        int apply(int value);
    }

    static List<Integer> map(List<Integer> readings, Transformer transformer) {
        // TODO: apply to every element
        ArrayList <Integer> result = new ArrayList<>();
        for (int i: readings){
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> readings = new ArrayList<Integer>();
        readings.add(40);
        readings.add(80);
        readings.add(120);
        readings.add(160);

        Transformer doubled = new Transformer() {
            public int apply(int value) {
                return value*2;
            }
        };  

        System.out.println(map(readings, doubled));
    }
}