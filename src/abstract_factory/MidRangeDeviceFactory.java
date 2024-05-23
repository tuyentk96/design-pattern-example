package abstract_factory;

public class MidRangeDeviceFactory extends ElectronicDeviceAbstractFactory{
    @Override
    Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    Laptop getLaptop() {
        return new MidRangeLaptop();
    }
}
