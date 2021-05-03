
import java.util.Scanner;


public class CampaignManager {
    
    public void makeDiscount(GameManager gameManager){
        Scanner sc = new Scanner(System.in);
        
        gameManager.seeGames();
        System.out.println("Choose a game to make discount");
        int gameNumber = sc.nextInt();
        System.out.println("Enter discount rate : ");
        int discountRate = sc.nextInt();
        gameManager.getGames().get(gameNumber-1).setPrice(gameManager.getGames().get(gameNumber-1).getPrice() - gameManager.getGames().get(gameNumber-1).getPrice()*discountRate/100 );
        System.out.println("New price is : " + gameManager.getGames().get(gameNumber-1).getPrice());
        
        
        
    }
    
}
