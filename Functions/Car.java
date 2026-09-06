package Functions;


public class Car {
    public static void main (String[] args)
    {
        double gal = 13.2;
        double efficency = 31;
        double mile_range = FindMileRange(gal, efficency);
        double km_range = mile_range* 1.609;
        System.out.println("Km range "+ km_range);
    }
    public static double FindMileRange(double gal, double efficency)
    {
        double range = gal*efficency;
        return range;
    }
}
