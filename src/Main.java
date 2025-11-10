import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(read());
/*
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));

        WordMatch b = new WordMatch("aaaabb");
        System.out.println(b.scoreGuess("a"));
        System.out.println(b.scoreGuess("aa"));
        System.out.println(b.scoreGuess("aaa"));
        System.out.println(b.scoreGuess("aabb"));
        System.out.println(b.scoreGuess("c"));

        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
        */
    }
    public static int read() throws FileNotFoundException{
        int cGuesses = 0;
        File f = new File("src/Guesses.txt");
        Scanner s = new Scanner(f);
        while (s.hasNextLine()){
            String word = s.next();
            String arg1 = s.next();
            String arg2 = s.next();
            WordMatch q = new WordMatch(word);
            cGuesses += q.scoreGuess(q.findBetterGuess(arg1,arg2));
        }
    return cGuesses;
    }
}