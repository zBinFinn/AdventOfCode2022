package day_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day01 {

    public static void main(String[] args) {
        ArrayList<String> inputStrings = new ArrayList<>();

        try {
            File inputFile = new File("src/day_01/input.txt");
            Scanner r = new Scanner(inputFile);
            while (r.hasNextLine()) {
                String data = r.nextLine();
                inputStrings.add(data);
            }
            r.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int totalCalories = 0;
        ArrayList<Integer> allElves = new ArrayList<>();

        for (String s : inputStrings) {
            if (s.equals("")) {
                allElves.add(totalCalories);
                totalCalories = 0;
            } else {
                totalCalories += Integer.parseInt(s);
            }
        }

        Collections.sort(allElves, Collections.reverseOrder());

        System.out.println("#1 - " + allElves.get(0));
        System.out.println("#2 - " + allElves.get(1));
        System.out.println("#3 - " + allElves.get(2));
        System.out.println("");
        System.out.println("Total Calories - " + (allElves.get(0) + allElves.get(1) + allElves.get(2)));




    }
}
