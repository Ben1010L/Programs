package Functions;

public class Even_or_Odd{
    public static void main (String[] args) {
        OddOrEven(5);
    }

    public static void OddOrEven(int number)
    {
        if (number%2==0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }


}

