import org.junit.Assert;
import org.junit.Test;

public class LifeOfCellTest {
    @Test
    public void verifyThatCellDiesWithOneNeighbour() {
        Cell teCell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = teCell.getNextState(1);
        Assert.assertEquals(Cell.State.DEAD, teCellState);
    }

    @Test
    public void verifyThatCellDiesWithZeroNeighbour() {
        Cell teCell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = teCell.getNextState(0);
        Assert.assertEquals(Cell.State.DEAD, teCellState);
    }

    @Test
    public void verifyThatCellLivesWithTwoNeighbours() {
        Cell teCell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = teCell.getNextState(2);
        Assert.assertEquals(Cell.State.ALIVE, teCellState);
    }

    @Test
    public void verifyThatCellLivesWithThreeNeighbours() {
        Cell teCell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = teCell.getNextState(3);
        Assert.assertEquals(Cell.State.ALIVE, teCellState);
    }
    @Test
    public void verifyThatCellLivesWithFourNeighbours() {
        Cell teCell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = teCell.getNextState(4);
        Assert.assertEquals(Cell.State.DEAD, teCellState);
    }
    @Test
    public void verifyThatCellLivesWithFiveNeighbours() {
        Cell teCell = new Cell(Cell.State.ALIVE);
        Cell.State teCellState = teCell.getNextState(5);
        Assert.assertEquals(Cell.State.DEAD, teCellState);
    }
    @Test
    public void verifyThatCellBecomesALiveWithThreeNeighbours() {
        Cell teCell = new Cell(Cell.State.DEAD);
        Cell.State teCellState = teCell.getNextState(3);
        Assert.assertEquals(Cell.State.ALIVE, teCellState);
    }
}
