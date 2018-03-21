package StplStateDesignPattern;

public class QuoteContext implements State{

    private State quoteState;

    public void setState(State state) {
        this.quoteState=state;
    }

    public State getState() {
        return this.quoteState;
    }

    @Override
    public void doAction() {
        this.quoteState.doAction();
    }



}
