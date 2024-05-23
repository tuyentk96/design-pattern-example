package singleton;

public class ClientTest {
    public static void main(String[] args) {
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("John");
        System.out.println("egaer1 = "+eager1.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println("egaer2 = "+eager2.getName());
    }
}
