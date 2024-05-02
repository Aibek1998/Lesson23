public class Car {
    public Car() {

    }


    public static void close() throws Exception {
        System.out.println("Maшина жабылып атат");

    }
    public static void driver () {
        System.out.println("Машина журуп атат");

    }

    @Override
    public String toString() {
        return "Car : ";
    }
}

