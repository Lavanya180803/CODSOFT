public class Student {
    private String name;
    private String rollNumber;
    private String grade;
    private String email;

    public Student(String name, String rollNumber, String grade, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.email = email;
    }

    public String getName() { return name; }
    public String getRollNumber() { return rollNumber; }
    public String getGrade() { return grade; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return rollNumber + "," + name + "," + grade + "," + email;
    }

    public static Student fromString(String data) {
        String[] parts = data.split(",");
        return new Student(parts[1], parts[0], parts[2], parts[3]);
    }
}
