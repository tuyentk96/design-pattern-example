package abstract_factory;

public class HighEndDeviceFactory extends ElectronicDeviceAbstractFactory{
    @Override
    Phone getPhone() {
        return new HighEndPhone();
    }

    @Override
    Laptop getLaptop() {
        return new HighEndLaptop();
    }
}
