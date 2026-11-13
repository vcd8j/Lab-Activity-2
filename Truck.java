public class Truck extends Vehicle implements Serviceable {

    private int numberofWheels;

    public Truck(String brand, String model, int year, int numbofWheels) {
        super(brand, model, year);
        this.numberofWheels = numbofWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of wheels: " + numberofWheels);
    }

    @Override
    public void move() {
        System.out.println("The truck is transporting heavy materials.");
    }

    @Override
    public void service() {
        System.out.println("Truck: check tires, engine, and cargo loading system.");
    }
}
