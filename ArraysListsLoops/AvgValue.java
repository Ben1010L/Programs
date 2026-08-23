public class AvgValue {
    public static void main() {
        double[] array = {1.0, 2.0, 3.0};
        double avg = array[0];
        for (int i=1; i < array.length; i++) {
            avg += array[i];
        }
        avg /= array.length;
        System.out.println("The average value in the array is: " + avg);
    }
}
