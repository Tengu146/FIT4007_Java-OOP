public class Student {
    // Properties
    private String fullname;
    private int age;

    //Constructor
    public Student() {
        this.fullname = " No name";
        this.age = 0;
    }
    public Student(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }
    //Setter-Getter
    public String getFullname() {
        return this.fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    //Other Methods
    public void printStudenInfo(){
        System.out.println("Full Name: " + this.fullname);
        System.out.println("Age: " + this.age);
    }

}
