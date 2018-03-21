package StplStateDesignPattern;

public class FileUpload implements State {
    @Override
    public void doAction() {
        System.out.println("file uploaded");
    }
}
