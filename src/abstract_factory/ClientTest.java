package abstract_factory;

public class ClientTest {
    public static void main(String[] args) {
        ElectronicDeviceAbstractFactory highEndFactory = ElectronicDeviceFactory.getFactory(Segment.HIGH_END);
        Laptop highEndLaptop = highEndFactory.getLaptop();
        Phone highEndPhone = highEndFactory.getPhone();
        System.out.println("High-end Device: ");
        System.out.println(highEndLaptop.getSegment());
        System.out.println(highEndPhone.getSegment());

        ElectronicDeviceAbstractFactory midRangeFactory = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);
        Laptop midRangeLaptop = midRangeFactory.getLaptop();
        Phone midRangePhone = midRangeFactory.getPhone();
        System.out.println("Mid-range Device: ");
        System.out.println(midRangeLaptop.getSegment());
        System.out.println(midRangePhone.getSegment());
    }
}
