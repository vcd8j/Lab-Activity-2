public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Toyota";
        vehicle1.model = "Fortuner";
        vehicle1.year = 2020;

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Nissan";
        vehicle2.model = "Navara";
        vehicle2.year = 2023;

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println();

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Honda";
        vehicle3.model = "Civic";
        vehicle3.year = 2010;

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());	
    }   
