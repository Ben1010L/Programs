import java.util.*;

public class Main {
    interface ReadingTest {
        boolean matches(int reading);
    }

    static List<Integer> filter(List<Integer> readings, ReadingTest test) {
        // TODO: keep readings that match
        List<Integer> result = new ArrayList<>();
        for (int r:readings)
        {
            if (test.matches(r))
            {
                result.add(r);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> readings = new ArrayList<Integer>();
        readings.add(40);
        readings.add(80);
        readings.add(120);
        readings.add(160);

        ReadingTest above100 = new ReadingTest() {
            @Override
            public boolean matches(int r) {
                return r>100;
            }
        };
        ReadingTest even = new ReadingTest() {
            @Override
            public boolean matches(int r) {
                return r%2==0;
            }
        };
        ReadingTest inRange = new ReadingTest() {
            @Override
            public boolean matches(int r) {
                return r>=50 && r<=150;
            }
        };

        System.out.println(filter(readings, above100));
        System.out.println(filter(readings, even));
        System.out.println(filter(readings, inRange));
    }
}