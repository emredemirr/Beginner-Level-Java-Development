package Classes.BoxingGame;

public class Match
{
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight)
    {
        this.f1=f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run()
    {
        if (isCheck())
        {
            while (this.f1.health>0 && this.f2.health>0)
            {
                System.out.println("=========== Yeni Round ===========");
                System.out.println("Beatrix: "+this.f2.health);
                System.out.println("Neo: "+this.f1.health);

                this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }

            }
        }
        else
        {
            System.out.println("Sporcuların Sikleti uymuyor.");
        }

    }
    boolean isCheck()
    {
        return (this.f1.weight>= minWeight && this.f1.weight<= maxWeight) &&(this.f2.weight>= minWeight && this.f2.weight<= maxWeight);
    }
    boolean isWin()
    {
        String style = "\n---------------\n";
        if (this.f1.health == 0)
        {
            System.out.println(style+f2.name + " Kazandı."+style);
            return true;
        }
        if (this.f2.health == 0)
        {
            System.out.println(style+f1.name + " Kazandı."+style);
            return true;
        }
        return false;
    }
}
