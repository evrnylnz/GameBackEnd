


public class Main {

    public static void main(String[] args) {
        
        GameManager gameManager = new GameManager();
        
        gameManager.addGame();
        gameManager.addGame();
        CampaignManager campaignManager = new CampaignManager();
        
        campaignManager.makeDiscount(gameManager);
        gameManager.addGame();
        gameManager.addGame();
        
        GamerManager gamerManager = new GamerManager();
        gamerManager.add();
        gamerManager.seeGamers();
        
        gamerManager.addMoney(gamerManager.gamers.get(0));
        
        gameManager.buyGame(gamerManager.gamers.get(0));
        
        gamerManager.seeLibrary(gamerManager.gamers.get(0));

    }

}
