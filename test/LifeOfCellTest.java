import org.junit.Assert;
import org.junit.Test;

public class LifeOfCellTest {
    @Test
    public void verifyThatCellDiesWithOneNeighbour() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State currentState = cell.getNeighbour(1);
        Cell.State nextState = cell.changeState();
        Assert.assertEquals(currentState, nextState);
    }

    @Test
    public void verifyThatCellDiesWithZeroNeighbour() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State currentState = cell.getNeighbour(0);
        Cell.State nextState = cell.changeState();
        Assert.assertEquals(nextState, currentState);
    }

    @Test
    public void verifyThatCellStaysAliveWithTwoNeighbours() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State currentState = cell.getNeighbour(2);
        Cell.State nextState = cell.changeState();
        Assert.assertNotEquals(nextState, currentState);
    }

    @Test
    public void verifyThatCellStaysAliveWithThreeNeighbours() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State currentState = cell.getNeighbour(3);
        Cell.State nextState = cell.changeState();
        Assert.assertNotEquals(nextState, currentState);
    }

    @Test
    public void verifyThatCellStaysAliveWithFourNeighbours() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State currentState = cell.getNeighbour(4);
        Cell.State nextState = cell.changeState();
        Assert.assertEquals(nextState, currentState);
    }

    @Test
    public void verifyThatCellStaysAliveWithFiveNeighbours() {
        Cell cell = new Cell(Cell.State.ALIVE);
        Cell.State currentState = cell.getNeighbour(5);
        Cell.State nextState = cell.changeState();
        Assert.assertEquals(nextState, currentState);
    }

    @Test
    public void verifyThatDeadCellBecomesAliveWithThreeNeighbours() {
        Cell cell = new Cell(Cell.State.DEAD);
        Cell.State currentState = cell.getNeighbour(3);
        Cell.State nextState = cell.changeState();
        Assert.assertEquals(nextState, currentState);
    }
}
