public class inheritance {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Hero Honda", "Karizma", "black");
        System.out.println(motorcycle);
        motorcycle.start();

        Car car = new Car("Maruti Suzuki", "Ciaz", "white");
        System.out.println(car);
        car.start();
    }

    private interface Rideable {
        void ride();
    }

    private interface Driveable {
        void drive();
    }

    private static abstract class Vehicle {  //parent class
        
        private final String brand;
        private final String model;
        private final String color;

        protected Vehicle(String brand, String model, String color) {
            this.brand = brand;
            this.model = model;
            this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        protected abstract int getNumberOfWheels();

        public abstract void start();

        @Override
        public String toString() {
            return "Vehicle{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    private static class Motorcycle extends Vehicle implements Rideable {

        protected Motorcycle(String brand, String model, String color) {
            super(brand, model, color);
        }

        @Override
        public void ride() {
            System.out.println("riding ");
        }

        @Override
        protected int getNumberOfWheels() {
            return 2;
        }

        @Override
        public void start() {
            System.out.println("started motorcycle");
            ride();
        }
    }

    private static class Car extends Vehicle implements Driveable {

        protected Car(String brand, String model, String color) {
            super(brand, model, color);
        }

        @Override
        public void drive() {
            System.out.println("driving");
        }

        @Override
        protected int getNumberOfWheels() {
            return 4;
        }

        @Override
        public void start() {
            System.out.println("started car");
            drive();
        }
    }
}