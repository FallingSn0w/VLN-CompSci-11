import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Create ArrayLists to hold Student and Teacher class objects, along with one to hold courses.
private static ArrayList<Student> studentList = new ArrayList<Student>();
private static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
private static ArrayList<String> courseList = new ArrayList<>();
//Line to simplify printed results.
public static String line = ("========");
//Method "Runner" is recursive, and is the main user interface.
public static String Runner(){
    String line = ("========");
    //Prompts user to provide an input.
    System.out.println("To add Students to this school, type \"AddStudents\" ");
    System.out.println("To add teachers to this school, type \"AddTeachers\"");
    System.out.println("To remove a student, type \"DelStudent\"");
    System.out.println("To remove a teacher, type \"DelTeacher\"");
    System.out.println("To print all students of this school, type \"PrintStudentList\"");
    System.out.println("To print all teachers of this school, type \"PrintTeacherList\"");
    System.out.println("To print all courses this school provides, type \"PrintCourseList\"");
    System.out.println(line.repeat(10));
    //Scanner to receive user input.
    Scanner scan = new Scanner(System.in);
    String input  = scan.nextLine();
    //Depending on the input, the computer decides which method to use, if the input is not recognized, the code repeats.
    if(input.equals("AddStudents")){School.AddStudents(studentList);}
    if(input.equals("AddTeachers")){School.AddTeachers(teacherList);}
    if(input.equals("DelStudent")){School.DelStudent(studentList);}
    if(input.equals("DelTeacher")){School.DelTeacher(teacherList);}
    if(input.equals("PrintStudentList")){School.PrintStudentList(studentList);}
    if(input.equals("PrintTeacherList")){School.PrintTeacherList(teacherList);}
    if(input.equals("PrintCourseList")){School.PrintCourseList(courseList);}
    System.out.println(line.repeat(10));
    //Method returns itself.
return Runner();
}
public static void main(String[]args){
    //getting school information through methods from the School class.
    School aSchool = new School("","",0);
    School newSchool = new School(aSchool.getSchoolName(), aSchool.getSchoolType(), aSchool.getWorldWideRank());
    System.out.println(line.repeat(10));
    //Method call "Runner", to start the loop.
    Runner();
}
}
