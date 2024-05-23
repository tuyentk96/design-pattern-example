package abstract_factory;

public class ElectronicDeviceFactory {
    public static ElectronicDeviceAbstractFactory getFactory(Segment segment){
        switch (segment){
            case MID_RANGE -> {
                return new MidRangeDeviceFactory();
            }
            case HIGH_END -> {
                return new HighEndDeviceFactory();
            }
            default -> {
                throw new UnsupportedOperationException("This device is unsupported");
            }
        }
    }
}
