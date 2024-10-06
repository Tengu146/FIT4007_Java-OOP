public class ComputerLab extends Room {
    private int numComputers; // Number of computers

    public ComputerLab(int roomID, String building, double area, int numLights, int numComputers) {
        super(roomID, building, area, numLights);
        this.numComputers = numComputers;
    }

    public int getNumComputers() {
        return numComputers;
    }

    public void setNumComputers(int numComputers) {
        this.numComputers = numComputers;
    }

    @Override
    public boolean checkStandard() {
        return super.checkStandard() && (getArea() / numComputers >= 1.5);
    }

    @Override
    public String toString() {
        return super.toString() + ", ComputerLab{" +
                "numComputers=" + numComputers +
                '}';
    }
}
