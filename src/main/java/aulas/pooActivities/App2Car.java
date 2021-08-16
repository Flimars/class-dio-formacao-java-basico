package aulas.pooActivities;

public class App2Car {
    public static void main(String[] args) {

        Car herbie = new Car();
        Car deLorean = new Car("DMC", "DeLorean DMC-12", 1981);

        herbie.doorIn();
        herbie.doorIn();
        herbie.doorIn();
        deLorean.doorIn(2);

        System.out.println("Inform the number of passengers on the Herbie: " + herbie.getNumberPassengers());
        System.out.println("Inform the number of passengers on the DeLorean DMC-12: " + deLorean.getNumberPassengers());

        herbie.doorIn();
        herbie.doorIn();
        deLorean.doorExit(1);

        System.out.println("Inform the number of passengers: " + herbie.getNumberPassengers());
        System.out.println("Inform the number of passengers of DeLorean DMC-12: " + deLorean.getNumberPassengers());

    }
}


