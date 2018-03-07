public class StudentTest {
    public static void main(String[] args){
        Student me = new Student();
        me.setName("Shaun Dobbs");
        me.setMajor("Computer Science");
        me.setAge(27.5);
        me.setGPA(3.33);
        
        Student you = new Student("Jane Doe", "Information Technology", 18, 3.15);
        
        System.out.println(me.toString());
        System.out.println(you.toString());
        
        Course calcCourse = new Course();
        calcCourse.setName("Calculus 2");
        calcCourse.setSubject("MATH");
        calcCourse.setNumber(2072);
        calcCourse.setCredits(4);
        
        Course csciCourse = new Course ("Intro to Programming", "CSCU", 1301, 3);
        
        System.out.println();
        System.out.println(calcCourse.toString());
        System.out.println(csciCourse.toString());
        
    }
}
