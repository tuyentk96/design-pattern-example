package builder_pattern;

public class ClientTest {
    public static void main(String[] args) {
        House house1 = new HouseBuilder()
                .buildWalls(4)
                .buildDoors(2)
                .buildPool(true)
                .build();
        System.out.println(house1);
    }
}
