import java.util.ArrayList;
class Course {
    private String name;
    private int credits;
    private double grade;
    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public double getGrade() {
        return grade;
    }
    public int getCredits() {
        return credits;
    }
}
class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = new ArrayList();
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void removeCourse(Course course) {
        courses.remove(course);
    }
    public ArrayList getCourses() {
        return courses;
    }
    public double getGPA() {
        double total = 0;
        int count = 0;
//        for (Course course : courses) {
//            total += course.getGrade();
//            count++;
//        }
        for (int i = 0; i < courses.size(); i++) {
            total+=courses.get(i).getGrade();
            count++;
        }
        return total / count;
    }
}


public class Complexy_work {
    public static void main(String[] args) {
        Course cs101=new Course("Computer science 101",4);
        Student alice= new Student("Alice",1234);
        cs101.setGrade(3.7);
        alice.addCourse(cs101);
        System.out.println(alice.getGPA());


    }
}
