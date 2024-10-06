public class Laboratory extends Room {
    private String specialty;   // Specialty
    private int capacity;       // Capacity
    private boolean hasSink;    // Has sink or not

    public Laboratory(int roomID, String building, double area, int numLights, String specialty, int capacity, boolean hasSink) {
        super(roomID, building, area, numLights);
        this.specialty = specialty;
        this.capacity = capacity;
        this.hasSink = hasSink;
    }

    @Override
    public boolean checkStandard() {
        return super.checkStandard() && hasSink;
    }

    @Override
    public String toString() {
        return super.toString() + ", Laboratory{" +
                "specialty='" + specialty + '\'' +
                ", capacity=" + capacity +
                ", hasSink=" + hasSink +
                '}';
    }
}
