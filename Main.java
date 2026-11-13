public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model 3", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "Beat", 2023, "4-stroke, SOHC, single-cylinder");
        Truck truck = new Truck("Mitsubishi", "L300", 2024, 4);

        Serviceable[] items = {car, motorcycle, truck};

        System.out.println("--- Service ---");
        for (int i = 0; i < items.length; i++) {
            performService(items[i]);
        }

        Vehicle[] vehicles = {car, motorcycle, truck};

        System.out.println();
        System.out.println("--- Vehicles ---");
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            vehicles[i].move();
            System.out.println();
        }
    }
}