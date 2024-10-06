public class Student {
    // Private attributes
    private int Id;
    private String fullName;
    private float theoryScore;
    private float practiceScore;

    // Default constructor
    public Student() {
        this.Id = 0;
        this.fullName = "";
        this.theoryScore = 0.0f;
        this.practiceScore = 0.0f;
    }

    // Constructor
    public Student(int studentId, String fullName, float theoryScore, float practiceScore) {
        this.Id = Id;
        this.fullName = fullName;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }

    // Getters and Setters
    public int getId() {
        return Id;
    }

    public void setId(int studentId) {
        this.Id = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(float practiceScore) {
        this.practiceScore = practiceScore;
    }

    public float calculateAverageScore() {
        return (theoryScore + practiceScore) / 2;
    }

    public String toString() {
        return String.format("%-10d %-30s %5.2f %5.2f %5.2f", Id, fullName, theoryScore, practiceScore, calculateAverageScore());
    }
}