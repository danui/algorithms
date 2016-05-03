package com.danui.algorithms;

import java.util.UUID;
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

    @Test
    public void randomTests() {
        for (int i = 0; i < 20; ++i) {
            String t = UUID.randomUUID().toString();
            String s = UUID.randomUUID().toString();
            char[] tc = t.toCharArray();
            char[] sc = s.toCharArray();
            int vectorResult = EditDistance.solveWithVector(sc, tc);
            int gridResult = EditDistance.solveWithGrid(sc, tc);
            if (vectorResult != gridResult) {
                System.out.println("Vector and Grid Results differ");
                System.out.println("  o s = " + s);
                System.out.println("  o t = " + t);
                System.out.println("  o vectorResult = " + vectorResult);
                System.out.println("  o gridResult = " + gridResult);
                fail("Vector and Grid Results differ for s="+s+" and t="+t);
            }
        }
    }
}
