import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassroomManager classroomManager = new ClassroomManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add classroom");
            System.out.println("2. Search for a classroom");
            System.out.println("3. Print list of classrooms");
            System.out.println("4. Print list of standard classrooms");
            System.out.println("5. Sort classrooms by building (ascending)");
            System.out.println("6. Sort classrooms by area (descending)");
            System.out.println("7. Sort classrooms by number of lights (ascending)");
            System.out.println("8. Update number of computers for a computer lab");
            System.out.println("9. Delete a classroom");
            System.out.println("10. Total number of classrooms");
            System.out.println("11. Print list of computer labs with 60 computers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add classroom
                    // Enter data and call the add method
                    break;
                case 2:
                    // Search for classroom
                    // Enter room code and call the search method
                    break;
                case 3:
                    // Print list of classrooms
                    classroomManager.printClassrooms();
                    break;
                case 4:
                    // Print list of standard classrooms
                    classroomManager.printStandardClassrooms();
                    break;
                case 5:
                    // Sort classrooms by building
                    classroomManager.sortAscendingByBuilding();
                    System.out.println("Classrooms sorted by building.");
                    break;
                case 6:
                    // Sort classrooms by area
                    classroomManager.sortDescendingByArea();
                    System.out.println("Classrooms sorted by area.");
                    break;
                case 7:
                    // Sort classrooms by number of lights
                    classroomManager.sortAscendingByNumLights();
                    System.out.println("Classrooms sorted by number of lights.");
                    break;
                case 8:
                    // Update number of computers
                    System.out.print("Enter computer lab code: ");
                    String roomCode = scanner.nextLine();
                    System.out.print("Enter new number of computers: ");
                    int numComputers = scanner.nextInt();
                    classroomManager.updateNumComputers(roomCode, numComputers);
                    break;
                case 9:
                    // Delete classroom
                    System.out.print("Enter classroom code to delete: ");
                    String roomCodeToDelete = scanner.nextLine();
                    classroomManager.deleteClassroom(roomCodeToDelete);
                    break;
                case 10:
                    // Total number of classrooms
                    System.out.println("Total number of classrooms: " + classroomManager.getTotalClassrooms());
                    break;
                case 11:
                    // Print list of computer labs with 60 computers
                    classroomManager.printClassroomsWith60Computers();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
