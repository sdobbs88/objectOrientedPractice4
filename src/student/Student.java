
public class Student {

    private String name;
    private String major;
    private double age;
    private double gpa;

    /**
     * Default no arg constructor
     */
    public Student() {
        name = "John Doe";
        major = "Political Science";
        age = 18;
        gpa = 3.33;
    }

    public Student(String name, String major, double age, double gpa) {
        this.name = name;
        this.major = major;
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }
    public String toString(){
        String output = getName() + " is a " + getAge() + " year old " + getMajor() + " major with a GPA of "
        + getGPA() + ".";
        
        return output;
    }
}
