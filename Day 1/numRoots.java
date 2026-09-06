public class numRoots {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 5;
        int discriminant = b * b - 4 * a * c;
        
        if (a > 0) {
            System.out.println("The parabola opens upwards");
        } else if (a < 0) {
            System.out.println("The parabola opens downwards");
        }

        if (discriminant > 0) {
            System.out.println("There are 2 roots");
        } 
        else if(discriminant==0){
            System.out.println("There is 1 root");
        } else {
            System.out.println("There are no real roots");
        }
    }
}

