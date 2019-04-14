package tund7_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Fighter fighterOne = new Fighter("Juku", FighterTypes.HERO);
        Fighter fighterTwo = new Fighter("Suvi", FighterTypes.WARR);
        Fighter fighterThree = new Fighter("Mari", FighterTypes.ARMS);
        Fighter fighterFour = new Fighter("Tori", FighterTypes.HERO);
        Fighter fighterFive = new Fighter("Muru", FighterTypes.WARR);

        fighterOne.fighterSetQuickness(85);
        fighterTwo.setQuickness(22);
        fighterThree.setQuickness(33);
        fighterFour.setQuickness(90);

        Fighter[] fighterArray = {fighterOne, fighterTwo, fighterThree, fighterFour, fighterFive};

        for (Fighter c : fighterArray){
            c.fighterSetQuickness(22);
            System.out.print(c);
            c.setQuickness(40);
            System.out.println(" > " + c.getQuickness());
        }

        System.out.println(" ");

        List<Fighter> fighter = Arrays.asList(fighterArray);

        String phrase = fighter
                .stream()
                .filter(p -> p.getQuickness() >= 135)
                .map(p -> p.getName())
                .collect(Collectors.joining(" ja ", "", " quickness on >= 135"));
        System.out.println(phrase);

        fighter.stream()
                .reduce((p1, p2) -> p1.fighterGetQuickness() > p2.fighterGetQuickness() ? p1 : p2)
                .ifPresent(System.out::println);

        fighter.stream()
                .map(s -> s.getQuickness())
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);

        System.out.println(" ");

        fighter.stream()
                .filter(s -> s.getName().endsWith("i"))
                .map(s -> s.getName().toUpperCase())
                .sorted()
                .forEach(System.out::println);

        PrintWriter pw = new PrintWriter(new FileWriter("Fighter2.txt"));
        fighter.stream().map(s -> s.toString()).forEach(pw::println);
        pw.close();

        System.out.println(
                Files.readAllLines(Paths.get("Fighter2.txt")).stream().sorted((s1, s2) -> Integer.parseInt(s1.substring(s1.length()-3, s1.length()))-Integer.parseInt(s2.substring(s2.length()-3, s2.length()))).collect(Collectors.toList())
        );

        Files.readAllLines(Paths.get("Fighter2.txt")).stream().sorted((s1, s2) -> Integer.parseInt(s1.substring(s1.length()-3, s1.length()))-Integer.parseInt(s2.substring(s2.length()-3, s2.length()))).forEach(System.out::println);
    }
}
