import java.util.*;

public class MainQ3 {
    interface ReadingTest {
        boolean matches(int reading);
    }

    static List<Integer> filter(ArrayList<Integer> readings, ReadingTest test) {
        // TODO: keep readings that match
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i : readings){
            if (test.matches(i)){
                temp.add(i);
            }
        }

        return temp;

    }

    static ReadingTest greaterThan(int threshold) {
            return new ReadingTest() {
                public boolean matches(int reading){
                    return reading > threshold ;
                }
            };
        }

    public static void main(String[] args) {
        ArrayList <Integer> readings = new ArrayList<Integer>();
        readings.add(40);
        readings.add(80);
        readings.add(120);
        readings.add(160);
        readings.add(600);


        System.out.println(filter(readings, greaterThan(100)));
        System.out.println(filter(readings, greaterThan(500)));
    }
}