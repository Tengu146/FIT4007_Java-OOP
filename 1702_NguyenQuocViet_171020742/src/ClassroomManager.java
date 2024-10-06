import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ClassroomManager {
    private List<Room> classroomList;

    public ClassroomManager() {
        this.classroomList = new ArrayList<>();
    }

    public boolean addClassroom(Room classroom) {
        for (Room c : classroomList) {
            if (c.getRoomID().equals(classroom.getRoomID())) {
                System.out.println("Room code already exists!");
                return false;
            }
        }
        classroomList.add(classroom);
        return true;
    }

    public Room searchClassroom(String roomCode) {
        for (Room classroom : classroomList) {
            if (classroom.getRoomID().equals(roomCode)) {
                return classroom;
            }
        }
        return null;
    }

    public void printClassrooms() {
        for (Room classroom : classroomList) {
            System.out.println(classroom);
        }
    }

    public void printStandardClassrooms() {
        for (Room classroom : classroomList) {
            if (classroom.checkStandard()) {
                System.out.println(classroom);
            }
        }
    }

    public void sortAscendingByBuilding() {
        Collections.sort(classroomList, Comparator.comparing(Room::getRoomName));
    }

    public void sortDescendingByArea() {
        Collections.sort(classroomList, Comparator.comparing(Room::getArea).reversed());
    }

    public void sortAscendingByNumLights() {
        Collections.sort(classroomList, Comparator.comparing(Room::getNumLight));
    }

    public void updateNumComputers(String roomCode, int numComputers) {
        Room classroom = searchClassroom(roomCode);
        if (classroom instanceof ComputerLab) {
            ((ComputerLab) classroom).setNumComputers(numComputers);
        } else {
            System.out.println("The classroom is not a computer lab.");
        }
    }

    public void deleteClassroom(String roomCode) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to delete the classroom with code " + roomCode + "? (Y/N)");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            Room classroom = searchClassroom(roomCode);
            if (classroom != null) {
                classroomList.remove(classroom);
                System.out.println("Classroom deleted.");
            } else {
                System.out.println("Classroom not found.");
            }
        } else {
            System.out.println("Delete operation canceled.");
        }
    }

    public int getTotalClassrooms() {
        return classroomList.size();
    }

    public void printClassroomsWith60Computers() {
        for (Room classroom : classroomList) {
            if (classroom instanceof ComputerLab && ((ComputerLab) classroom).getNumComputers() == 60) {
                System.out.println(classroom);
            }
        }
    }
}
