package com.danui.algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

public class EditDistanceTest {

    // Example from https://en.wikipedia.org/wiki/Levenshtein_distance
    @Test
    public void exampleUseCase_1() throws Exception {
        String t = "kitten";
        String s = "sitting";
        assertEquals(3, EditDistance.solve(s, t));
    }

    // Example from https://en.wikipedia.org/wiki/Levenshtein_distance
    @Test
    public void exampleUseCase_2() throws Exception {
        String t = "Saturday";
        String s = "Sunday";
        assertEquals(3, EditDistance.solve(s, t));
    }

    @Test
    public void exampleUseCase_3() throws Exception {
        String t = "Saturday";
        String s = "Sunday";
        assertEquals(3, EditDistance.solve(
            s.toCharArray(),
            t.toCharArray()));
    }

    @Test
    public void testGridBasedSolver_1() throws Exception {
        String t = "kitten";
        String s = "sitting";
        assertEquals(3, EditDistance.solveWithGrid(
            s.toCharArray(),
            t.toCharArray()));
    }

    @Test
    public void testGridBasedSolver_2() throws Exception {
        String t = "Saturday";
        String s = "Sunday";
        assertEquals(3, EditDistance.solveWithGrid(
            s.toCharArray(),
            t.toCharArray()));
    }

    @Test
    public void testVectorBasedSolver_1() throws Exception {
        String t = "kitten";
        String s = "sitting";
        assertEquals(3, EditDistance.solveWithVector(
            s.toCharArray(),
            t.toCharArray()));
    }

    @Test
    public void testVectorBasedSolver_2() throws Exception {
        String t = "Saturday";
        String s = "Sunday";
        assertEquals(3, EditDistance.solveWithVector(
            s.toCharArray(),
            t.toCharArray()));
    }
}
