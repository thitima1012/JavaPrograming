public class Car {
    /* Attributes */
    public int size;
    public String color;
    public String model;

    /* Main Methods */
    public static void main(String[] args) {
        // moveForward();
        // moveBackward();
        // stop();
        // turnOnLight();
        // turnOffLight();
        Car redCar = new Car();
        redCar.color = "red";
        redCar.model = "Benz";
        redCar.size = 4;

        Car blueCar = new Car();
        blueCar.color = "blue";
        blueCar.model = "Benz";
        blueCar.size = 4;

        System.out.println("Car color:" + redCar.color);
        System.out.println("Car size:" + redCar.size);
        System.out.println("Car model:" + redCar.model);
        redCar.moveForward();
        System.out.println("Car color:" + blueCar.color);
        System.out.println("Car size:" + blueCar.size);
        System.out.println("Car model:" + blueCar.model);
    }
    /* Methods */

    public void moveForward() {
        System.out.println(this.color + " move Forward");
    }

    public void moveBackward() {
        System.out.println(this.color + " move Backward");
    }

    public void stop() {
        System.out.println(this.color + " stop");
    }

    public void turnOnLight() {
        System.out.println(this.color + " turn OnLight");
    }

    public void turnOffLight() {
        System.out.println(this.color + " turn OffLight");
    }
}
