public class Cell {

    private State state;

    public enum State {
        DEAD, ALIVE
    }

    Cell(State state) {
        this.state = state;
    }

    public State getNextState(int neighbour) {
        return neighbour > 1 && neighbour < 4 ? State.ALIVE : State.DEAD;
    }

}
