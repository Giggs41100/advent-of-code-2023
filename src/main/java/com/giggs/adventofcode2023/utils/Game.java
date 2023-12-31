package com.giggs.adventofcode2023.utils;

import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class Game {

    int id;

    Set<Map<Color, Integer>> gameSet;

    public static Game parseAsGame(String s) {
        for (int i = 0; i < s.length() -1; i++) {
            var sub = s.substring(0, i);
            if (sub.contains("Game")) {
            } else if (sub.contains(":")) {
                this.setId(sub.substring(sub.indexOf(" ")), sub.indexOf(":"));
            }
        }
    }
}
