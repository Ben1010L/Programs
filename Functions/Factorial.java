package Functions;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] arg)
    {
        int[] arr = {2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int cnt = 0;
        for(int element: arr){  
            System.out.println(find_factorial(element));
            cnt++;
        }
        //System.out.println(arr);
        

    }

    public static int find_factorial(int item)
    {
        int product = 1;
        for(int i = item; i>0;i--)
        {
            product*=i;
            
        }
        return product;
    }
    
}
