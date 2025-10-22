import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int correctness = 0;

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

    }
}