public class Course {
    String name;
    String subject;
    int number, credits;
    
    Course(){
        name = "College Algebra";
        subject = "MATH";
        number = 1101;
        credits = 4;
    }
    
    Course(String name, String subject, int number, int credits){
        this.name = name;
        this.subject = subject;
        this.number = number;
        this.credits = credits;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public int getCredits(){
        return credits;
    }
    public String toString(){
        String output = getName() + " is a " + getSubject() + " course. The number is " + getNumber() +
        " and it is " + getCredits() + " credits.";
        
        return output;
    }
    
}
