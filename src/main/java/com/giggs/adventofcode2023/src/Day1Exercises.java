package com.giggs.adventofcode2023.src;

import com.giggs.adventofcode2023.utils.AdventStringUtils;
import lombok.Data;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Data
public class Day1Exercises {

    private static final String EXERCISE1_NAME = "Advent of Code 2023 - Day 1 - Exercise 1";
    private static final String EXERCISE2_NAME = "Advent of Code 2023 - Day 1 - Exercise 2";
    private static final String EXERCISE_INPUT_PATH = "src/main/resources/";
    private static final String EXERCISE_INPUT_FILE = "2023-Day1.txt";
    //private static final String EXERCISE_INPUT_FILE = "2023-Day1-test.txt";

    public static void launchExercise1()  {

        System.out.println(EXERCISE1_NAME);

        try {
            Path path = Paths.get(Day1Exercises.class.getClassLoader()
                    .getResource(EXERCISE_INPUT_FILE).toURI());

            Stream<String> lines = Files.lines(path);
            var total = lines.mapToInt(AdventStringUtils::decodeFirstAndLastDigit).sum();
            lines.close();
            System.out.println("Résultat : " + total);


        } catch (IOException e) {
            System.out.println("IOException in Exercise 1 : "+e.toString());
        } catch (URISyntaxException e) {
            System.out.println("URISyntaxException in Exercise 1 : "+e.toString());
        }


    }

    public static void launchExercise2()  {

        System.out.println(EXERCISE2_NAME);

        try {
            Path path = Paths.get(Day1Exercises.class.getClassLoader()
                    .getResource(EXERCISE_INPUT_FILE).toURI());

            Stream<String> lines = Files.lines(path);
            var total = lines.mapToInt(AdventStringUtils::decodeFirstAndLastDigitWithLitteral).sum();
            lines.close();
            System.out.println("Résultat : " + total);


        } catch (IOException e) {
            System.out.println("IOException in Exercise 1 : "+e.toString());
        } catch (URISyntaxException e) {
            System.out.println("URISyntaxException in Exercise 1 : "+e.toString());
        }


    }



}
