import java.util.ArrayList;

import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) 
    {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=2;i<=50;i++)
        {
            list.add(i);
        }
        
        //System.out.println(list);

        while(list.size()>0)
        {
            int prime = list.get(0);
            System.out.println(prime);
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println("Index "+i);
                if (list.get(i) % prime == 0) {
                    list.remove(i);
                }
            }
        }
       // System.out.println(list);

    }
}
