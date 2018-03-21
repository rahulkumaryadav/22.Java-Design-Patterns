package StplStateDesignPattern;

public class QuotatonApprovedByHod implements State{
    @Override
    public void doAction() {
        System.out.println("Quotation is approved by hod");
    }
}
