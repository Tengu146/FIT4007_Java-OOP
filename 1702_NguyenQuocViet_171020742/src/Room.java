public class Room {
    private int roomID;
    private String roomName;
    private double area;
    private int numLight;

    public Room() {
    }

    public Room(int roomID, String roomName, double area, int numLight) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.area = area;
        this.numLight = numLight;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getNumLight() {
        return numLight;
    }

    public void setNumLight(int numLight) {
        this.numLight = numLight;
    }

    public boolean checkStandard() {
        double averageLight = area / numLight;
        return averageLight <= 10;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "roomCode='" + roomID + '\'' +
                ", building='" + roomName + '\'' +
                ", area=" + area +
                ", numLights=" + numLight +
                '}';
    }
}
