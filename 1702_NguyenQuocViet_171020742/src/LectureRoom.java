public class LectureRoom extends Room {
    private boolean hasProjector;

    public LectureRoom(int roomID, String building, double area, int numLights, boolean hasProjector) {
        super(roomID, building, area, numLights);
        this.hasProjector = hasProjector;
    }

    @Override
    public boolean checkStandard() {
        return super.checkStandard() && (hasProjector || getNumLight() > 0);
    }

    @Override
    public String toString() {
        return super.toString() + ", LectureRoom{" +
                "hasProjector=" + hasProjector +
                '}';
    }
}
