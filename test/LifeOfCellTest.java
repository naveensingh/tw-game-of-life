import org.junit.Assert;
import org.junit.Test;

public class LifeOfCellTest {
    @Test
    public void verifyThatCellDiesWithOneNeighbour() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = cell.getNextState(1);
        Assert.assertEquals(Cell.State.DEAD, teCellState);
    }

    @Test
    public void verifyThatCellDiesWithZeroNeighbour() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = cell.getNextState(0);
        Assert.assertEquals(Cell.State.DEAD, teCellState);
    }

    @Test
    public void verifyThatCellLivesWithTwoNeighbours() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = cell.getNextState(2);
        Assert.assertEquals(Cell.State.ALIVE, teCellState);
    }

    @Test
    public void verifyThatCellLivesWithThreeNeighbours() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = cell.getNextState(3);
        Assert.assertEquals(Cell.State.ALIVE, teCellState);
    }
    @Test
    public void verifyThatCellLivesWithFourNeighbours() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = cell.getNextState(4);
        Assert.assertEquals(Cell.State.DEAD, teCellState);
    }
    @Test
    public void verifyThatCellLivesWithFiveNeighbours() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = cell.getNextState(5);
        Assert.assertEquals(Cell.State.DEAD, teCellState);
    }
    @Test
    public void verifyThatCellBecomesALiveWithThreeNeighbours() {
        Cell cell = new Cell(Cell.State.DEAD);
        Cell.State teCellState = cell.getNextState(3);
        Assert.assertEquals(Cell.State.ALIVE, teCellState);
    }
}
