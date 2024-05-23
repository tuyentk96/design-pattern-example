package factory_method;

public class ClientTest {
    public static void main(String[] args) {
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        System.out.println(hardCandy.getCandyName());

        Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY);
        System.out.println(mintyCandy.getCandyName());

    }
}
