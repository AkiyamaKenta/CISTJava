package lecture02;

public class exercise02_2 {
    public static void main(String[] args) {
        car car = new car();
        gasstation gasstation = new gasstation();

        car.run();// 給油する前
        gasstation.refuel(car);
        car.run();// 給油した後
    }
}
