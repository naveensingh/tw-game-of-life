public class Cell {

    private State state;

    Cell(State state) {
        this.state = state;
    }

    public State changeState() {
        if (state == State.ALIVE) return state = State.DEAD;
        else return state = State.ALIVE;
    }

    public State getState() {
        return state;
    }

    public State getNeighbour(int neighbour) {
        return neighbour > 1 && neighbour < 4 ? State.ALIVE : State.DEAD;
    }

    public enum State {
        DEAD, ALIVE
    }

}