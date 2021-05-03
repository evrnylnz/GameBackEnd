
import java.util.ArrayList;
import java.util.Scanner;


public class GameManager {
    
    private ArrayList<Game> games = new ArrayList<>();
    
    public void addGame(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Game name : ");
        String name = sc.nextLine();
        System.out.print("Game price : ");
        double price = sc.nextDouble();
        Game game = new Game(name, price);
        
        games.add(game);
        
    }
    public void seeGames(){
        int i = 1;
        for(Game g : games){
            System.out.println(i+". Game"+"\nName : "+ g.getName() + "\nPrice : " + g.getPrice());
            i++;
        }
    }
    
    public void buyGame(Gamer gamer){
        Scanner sc = new Scanner(System.in);
        seeGames();
        System.out.println("Which game do you want to buy ?");
        int gameNumber = sc.nextInt();
        
        if(gamer.getBalance() >= games.get(gameNumber-1).getPrice()){
            System.out.println("Purchase successful.");
            gamer.getLibrary().add(games.get(gameNumber-1));
            System.out.println("Current balance : " + gamer.getBalance());
        }
        else{
            System.out.println("Balance is not enough.");
        }
        
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    
}
