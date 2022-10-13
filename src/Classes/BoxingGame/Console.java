/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */
package Classes.BoxingGame;

public class Console
{
    public static void main(String[] args)
    {
        Fighter fighterOne = new Fighter("Neo",10,120,100,30);
        Fighter fighterTwo = new Fighter("Beatrix",20,85,85,23);

        Match match = new Match(fighterOne,fighterTwo,85,100);
        match.run();
    }
}
