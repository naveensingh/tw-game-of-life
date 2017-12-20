public class Universe {

    private final int dimension;
    private Cell[][] grid;

    Universe(int dimension) {
        this.dimension = dimension;
        this.grid = new Cell[dimension][dimension];
    }

    public Cell[][] build(int[][] pattern, String pattern_type) {
        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                grid[row][col] = new Cell(Cell.State.DEAD);
            }
        }
        if (pattern.length > 0) {
            for (int[] singlePattern : pattern) {
                final int row = singlePattern[0];
                final int col = singlePattern[1];
                grid[row][col].changeState();
            }
        }
        printUniverse(pattern_type);
        return grid;
    }

    private String printUniverse(String pattern_type) {
        StringBuilder universe = new StringBuilder();
        System.out.println("\n" + pattern_type + " Universe: \n");
        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                universe.append(grid[row][col].getState().equals(Cell.State.ALIVE) ? " X " : " - ");
            }
            universe.append("\n");
        }
        System.out.println(universe);
        return universe.toString();
    }


    public Cell[][] rebuild(int[][] expectedPattern, String pattern_type) {
        this.grid = new Cell[dimension][dimension];
        return build(expectedPattern, "Expected " + pattern_type);
    }


    public boolean isStable(Cell[][] previousGeneration, Cell[][] nextGeneration) {
        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                if (!previousGeneration[row][col].getState().equals(nextGeneration[row][col].getState())) return false;
            }
        }
        return true;
    }
}
