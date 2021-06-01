package lecture02;

public class gasstation {
    void refuel(car car) {
        car.fuel = 20;
        System.out.println("給油したことによりfuelが" + car.fuel + "増えました。");
}
}
