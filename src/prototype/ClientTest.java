package prototype;

public class ClientTest {
    public static void main(String[] args) {
        User user1 = new User("Tuyen","tuyentk96ch@gmail.com",28);
        User user2 = user1.clone();

        System.out.println("user1 = "+user1);
        System.out.println("user2 = "+user2);

        System.out.println("-----");
        user1.setAge(25);
        System.out.println("user1 = "+user1);
        System.out.println("user2 = "+user2);
    }
}
