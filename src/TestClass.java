import java.time.LocalDate;
public class TestClass {
    public static void main(String[] args) {
        Car car = new Car("Camry", "ABC123", "4T1G11AK6MU442552", 27_263);
        Driver driver = new Driver("Oleg","Koksiuk", LocalDate.of(2004,12,16), car);
        Route route = new Route("Zhytomir","Zhazhkiv");
        Trip trip = new Trip(driver,route,LocalDate.of(2024,3,21),LocalDate.of(2024,4,15),7);
        System.out.println(trip);
    }
}
