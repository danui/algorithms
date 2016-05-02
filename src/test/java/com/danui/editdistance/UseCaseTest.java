package com.danui.editdistance;

import org.junit.Test;
import static org.junit.Assert.*;

public class UseCaseTest {

    // Example from https://en.wikipedia.org/wiki/Levenshtein_distance
    @Test
    public void exampleUseCase_1() {
        String s = "kitten";
        String t = "sitting";
        assertEquals(3, EditDistance.solve(s, t));
    }

    // Example from https://en.wikipedia.org/wiki/Levenshtein_distance
    @Test
    public void exampleUseCase_2() {
        String s = "Saturday";
        String t = "Sunday";
        assertEquals(3, EditDistance.solve(s, t));
    }

}
