
public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println(brand + ", " + model + ", " + year);
    }

    int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    }

    public abstract void move();
}
