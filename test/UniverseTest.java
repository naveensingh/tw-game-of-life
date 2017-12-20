import org.junit.Assert;
import org.junit.Test;

public class UniverseTest {
    @Test
    public void verifyIfUniverseExists() {
        Universe universe = new Universe(5);
        String pattern_type = "Generic pattern";

        final int[][] pattern = {};
        Cell[][] actualUniverse = universe.build(pattern, pattern_type);

        final int[][] expectedPattern = {};
        Cell[][] expectedUniverse = universe.rebuild(expectedPattern, pattern_type);

        Assert.assertTrue(universe.isStable(actualUniverse, expectedUniverse));
    }

    @Test
    public void verifyIfBlockPatternUniverseExists() {
        Universe universe = new Universe(5);
        String pattern_type = "Block pattern";

        final int[][] pattern = {{1, 1}, {1, 2}, {2, 1}, {2, 2}};
        Cell[][] actualUniverse = universe.build(pattern, pattern_type);

        final int[][] expectedPattern = {{1, 1}, {1, 2}, {2, 1}, {2, 2}};
        Cell[][] expectedUniverse = universe.rebuild(expectedPattern, pattern_type);

        Assert.assertTrue(universe.isStable(actualUniverse, expectedUniverse));
    }

    @Test
    public void verifyIfBoatPatternUniverseExists() {
        Universe universe = new Universe(5);
        String pattern_type = "Boat pattern";

        final int[][] pattern = {{0, 1}, {1, 0}, {2, 1}, {0, 2}, {1, 2}};
        Cell[][] actualUniverse = universe.build(pattern, pattern_type);

        final int[][] expectedPattern = {{0, 1}, {1, 0}, {2, 1}, {0, 2}, {1, 2}};
        Cell[][] expectedUniverse = universe.rebuild(expectedPattern, pattern_type);

        Assert.assertTrue(universe.isStable(actualUniverse, expectedUniverse));
    }

    @Test
    public void verifyIfBlinkerPatternUniverseExists() {
        Universe universe = new Universe(5);
        String pattern_type = "Blinker pattern";

        final int[][] pattern = {{1, 1}, {1, 0}, {1, 2}};
        Cell[][] actualUniverse = universe.build(pattern, pattern_type);

        final int[][] expectedPattern = {{1, 1}, {1, 0}, {1, 2}};
        Cell[][] expectedUniverse = universe.rebuild(expectedPattern, pattern_type);

        Assert.assertTrue(universe.isStable(actualUniverse, expectedUniverse));
    }

    @Test
    public void verifyIfToadPatternUniverseExists() {
        Universe universe = new Universe(5);
        String pattern_type = "Toad pattern";

        final int[][] pattern = {{1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {2, 4}};
        Cell[][] actualUniverse = universe.build(pattern, pattern_type);

        final int[][] expectedPattern = {{1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {2, 4}};
        Cell[][] expectedUniverse = universe.rebuild(expectedPattern, pattern_type);

        Assert.assertTrue(universe.isStable(actualUniverse, expectedUniverse));
    }
}
