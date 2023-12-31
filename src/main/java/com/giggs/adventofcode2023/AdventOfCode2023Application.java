package com.giggs.adventofcode2023;

import com.giggs.adventofcode2023.src.Day1Exercises;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdventOfCode2023Application {

	public static void main(String[] args) {

		SpringApplication.run(AdventOfCode2023Application.class, args);
		Day1Exercises.launchExercise2();

	}

}
