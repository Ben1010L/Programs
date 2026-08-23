public class optionalTime {
    public static void main(String[] args) {
        int seconds = 1678;
        int minutes = seconds / 60;
        int extra_seconds = seconds % 60;
        System.out.println(minutes + " minutes and " + extra_seconds + " seconds");
    }
}
