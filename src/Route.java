public class Route {

    private final int id;
    private static int nextId;
    private String source;
    private String destination;

    public Route(String source, String destination) {
        this.source = source;
        this.destination = destination;
        id = ++nextId;
    }

    public String getFrom() {
        return source;
    }

    public void setFrom(String from) {
        this.source = from;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "source: " + source +
                ", destination: " + destination
                ;
    }
}
