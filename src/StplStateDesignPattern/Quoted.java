package StplStateDesignPattern;

public class Quoted implements State {
    @Override
    public void doAction() {
        System.out.println(" service is Quoted");
    }
}
