
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GamerManager implements IGamer{
    
    ArrayList<Gamer> gamers = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Welcome to gamer platform!");
        System.out.print("First name : ");
        String firstName = sc.nextLine();
        System.out.print("Last name : ");
        String lastName = sc.nextLine();
        System.out.print("Identity number : ");
        String identityNumber = sc.nextLine();
        System.out.print("Birthday : ");
        String birthday = sc.nextLine();
        
        Gamer gamer = new Gamer(firstName, lastName, identityNumber, birthday);
        
        System.out.println("Checking the informations from database.It may take a while.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GamerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Informations are true. Player added to the system.");
        gamers.add(gamer);
        
    }

    @Override
    public void update() {
        seeGamers();
        System.out.println("Which player you do you want to update?");
        int playerNum = sc.nextInt();
        System.out.println("Player selected.Enter new informations.");
        gamers.remove(playerNum-1);
        sc.nextLine();
        System.out.print("First name : ");
        String firstName = sc.nextLine();
        System.out.print("Last name : ");
        String lastName = sc.nextLine();
        System.out.print("Identity number : ");
        String identityNumber = sc.nextLine();
        System.out.print("Birthday : ");
        String birthday = sc.nextLine();
        
        Gamer gamer = new Gamer(firstName, lastName, identityNumber, birthday);
        
        System.out.println("Checking the informations from database.It may take a while.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GamerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Informations are true. Player added to the system.");
        gamers.add(playerNum-1,gamer);
        
        
    }

    @Override
    public void delete() {
        seeGamers();
        System.out.println("Which player do you want to delete?");
        int playerNum = sc.nextInt();
        gamers.remove(playerNum-1);
        System.out.println("Player removed.");
    }
    
    public void seeGamers(){
        int i = 1;
        for(Gamer g : gamers){
            System.out.println(i + ". Player : " + g.getFirstName());
            i++;
        }
        
    }
    
    public void addMoney(Gamer gamer){
        System.out.println("How much do you want to add your wallet?");
        int money = sc.nextInt();
        gamer.setBalance(gamer.getBalance() + money);
        System.out.println("Total balance : " + gamer.getBalance());
        
    }
    
    public void seeLibrary(Gamer gamer){
        for(Game g : gamer.getLibrary()){
            System.out.println(g.getName());
        }
    }
    
}
