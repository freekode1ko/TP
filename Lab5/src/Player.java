import java.util.Random;

public class Player 
{
    protected int number;
    protected String name;
    protected int health;
    Random rand = new Random();

    Player(String name) 
    {
        this.name = name;
        this.health = 20;
        this.number = rand.nextInt(12) + 1;
    }

    public boolean checkTheHit(int num) 
    { return this.number == num;}

    public boolean isDead() 
    {return this.health <= 0;}

    void generateNewNumber() 
    {this.number = rand.nextInt(12) + 1; }

    void decreaseHealth() 
    {this.health = this.health - 10; }
}
