import java.io.OutputStream;

public class BlackJack 
{
    public static void main(String[] args) 
    {
        int max = 0;
        int[] playerScores = {18,19,26,16,20,23,13,30,15,28};
        for(int current_score=0;playerScores.length>current_score;current_score++){
            if (playerScores[current_score] <21)
            {
               if (playerScores[current_score]>max)
               {
                max = playerScores[current_score];
               }
            }
                
                
        }
        System.out.println("The max num in the array less than 21 was " + max);
    }
}
    