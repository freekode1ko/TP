import java.util.Random;
import java.util.Scanner;

public class NewGame 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name your hero:");
        String userName = scanner.nextLine();
        
        System.out.println("Name of enemy:");
        String enemyName = scanner.nextLine();
        
        int roll = 0;

        User user = new User(userName);
        Enemy enemy = new Enemy(enemyName);
        boolean game = true;
        
        System.out.println("Test your luck?");
        String Luck = scanner.nextLine();
        
        if (Luck.toLowerCase().equals("yes"))
        {
        	Random rand = new Random();
            while (game == true) 
            {
            	roll = rand.nextInt(12) + 1;
            	System.out.println("You roll dice and get fate number: "+roll);
            	game = Game(roll, user, enemy);
            }
        }
        
        while (game == true) 
        {
        	System.out.println("You roll dice and get fate number: ");
        	roll = scanner.nextInt();
        	game = Game(roll, user, enemy);
        }
    }
    private static boolean Game(int roll, User user, Enemy enemy)
    {
        if (enemy.checkTheHit(roll)) 
        {
            enemy.decreaseHealth();
            if (enemy.isDead()) 
            {
                System.out.println("YOU WIN");
                return false;
            } 
            else 
            {
                enemy.displayHit();
                enemy.generateNewNumber();
            }
        } 
        else enemy.displayMiss(roll);

        roll = enemy.makeGuess();
        if (user.checkTheHit(roll)) 
        {
            user.displayHit();
            user.decreaseHealth();
            if (user.isDead()) 
            {
                System.out.println("YOU DIED");
                return false;
            }
            else user.generateNewNumber();
        }
        else user.displayMiss();
        
        return true;
    }
}
