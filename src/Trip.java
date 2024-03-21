import java.time.LocalDate;

public class Trip {
    private Driver driver;
    private Route route;
    private LocalDate startDate;
    private LocalDate endDate;
    private int numOfPassengers;
    private final int id;
    private static int nextId;
    public Trip(Driver driver, Route route, LocalDate startDate, LocalDate endDate, int numOfPassengers) {
        this.driver = driver;
        this.route = route;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numOfPassengers = numOfPassengers;
        id = ++nextId;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                driver +" "+ route +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", numOfPassengers=" + numOfPassengers
                ;
    }
}
