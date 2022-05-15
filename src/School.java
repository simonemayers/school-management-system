import java.util.ArrayList;
import java.util.List;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList <Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }
    public static void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }
    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneySpent += moneySpent;
        totalMoneyEarned -= moneySpent;
    }

}
