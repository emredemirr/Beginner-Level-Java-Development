/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */

package Classes.StudentInformationSystem;

public class Console
{
    public static void main(String[] args)
    {

        Teacher teacher1 = new Teacher("Mahmut Hoca","123","History");
        Teacher teacher2 = new Teacher("Kül Yutmaz","123","Math");
        Teacher teacher3 = new Teacher("Emre","123","Physics");

        Course history = new Course("History", "101","History",teacher1);
        history.addTeacher(teacher1);
        Course math = new Course("Math", "102","Math",teacher2);
        math.addTeacher(teacher2);
        Course physics = new Course("Physics", "103","Physics",teacher3);
        physics.addTeacher(teacher3);

        Student student = new Student("Emre","1234","4",history,math,physics);
        student.addBulkExamNote(100,70,50,60,95,15);
        student.printNote();
        student.isPass();




    }
}
