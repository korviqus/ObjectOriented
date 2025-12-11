package LabWorks;

public class PLayerTest {
    public static void main(String[] args){
        GameCharacter newCharacter = new GameCharacter("Warrior",1,100);
        newCharacter.takeDamage(30);
        newCharacter.heal(10);

        System.out.println(newCharacter.getHealth());
        System.out.println(newCharacter.getLevel());
        System.out.println(newCharacter.getInfo());

        GameCharacter secondCharacter = new GameCharacter("Mage",3,80);

        System.out.println(GameCharacter.getTotalCharacters());
    }
}
