import java.util.Random;

public class Enemy extends Player
{
    Random rand = new Random();

    Enemy(String name) {super(name); }

    public int makeGuess() { return rand.nextInt(12) + 1; }
    
    void displayHit() 
    { System.out.println("You hit " + this.name + " in 10 hp, he still have " + this.health + "HP!");}

    void displayMiss(int num) 
    {
        if (this.number > num) 
            System.out.println("You missed, you need more");
        else 
            System.out.println("You missed, you need less");
    }
}
