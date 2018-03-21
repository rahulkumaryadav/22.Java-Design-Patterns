package StplStateDesignPattern;

public class RequiredDocuments implements State {
    @Override
    public void doAction() {
        System.out.println("required documents is submitted");
    }
}
