import java.time.LocalDate;

public class Driver {
    private String firstName;
    private String lastName;
    private Car driverCar;
    private LocalDate birthDate;
    private final int id;
    private static int nextId;

    public Driver(String firstName, String lastName, LocalDate birthDate, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        driverCar = car;
        id = ++nextId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return  "Driver name: " + firstName +" "+ lastName +
                ", Car: " + driverCar;
    }
}
