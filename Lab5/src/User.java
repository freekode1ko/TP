public class User extends Player 
{
    User(String name) 
    { super(name); }

    void displayHit() 
    {System.out.println("The enemy hit you! on 10hp, " + this.name + " still have " + (this.health-10) + "HP!");}
    
    void displayMiss() 
    {System.out.println("The enemy missed");}
}
