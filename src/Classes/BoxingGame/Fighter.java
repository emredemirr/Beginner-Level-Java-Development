/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */

package Classes.BoxingGame;

public class Fighter
{
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight,int dodge)
    {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe)
    {
        System.out.println(this.name+" -> "+foe.name+" 'e " +this.damage+" hasar vurdu.");
        if (foe.isDodge())
            System.out.println(foe.name+" gelen hasarı blokladı.");

        if (foe.health - this.damage <0)
            return 0;

        return foe.health - this.damage;

    }

    boolean isDodge()
    {
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;
    }

}
