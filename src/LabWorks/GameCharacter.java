package LabWorks;
import java.util.Random;

public class GameCharacter {
    private int characterId;
    private String name;
    private int level;
    private int health;
    private static int totalCharacters;

    public GameCharacter(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;
        Random random = new Random();
        this.characterId = random.nextInt(900);
        totalCharacters++;
    }

    public int getCharacterId(){
        return this.characterId;
    }

    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }

    public int getHealth(){
        return this.health;
    }

    public static int getTotalCharacters(){
        return totalCharacters;
    }

    public void takeDamage(int damage){
        health -= damage;
        if(health < 0){
            health = 0;
        }
    }

    public void heal(int amount){
        this.health += amount;
    }

    public String getInfo(){
        return Integer.toString(this.characterId)+this.name+Integer.toString(this.level)+Integer.toString(this.health);
    }
}
