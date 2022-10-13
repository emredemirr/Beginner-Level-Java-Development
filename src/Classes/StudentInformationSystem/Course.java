/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */package Classes.StudentInformationSystem;

public class Course
{
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int note2;

    Course(String name, String code, String prefix, Teacher teacher)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note =0;
        int note2=0;
    }

    void addTeacher(Teacher teacher)
    {
        if (teacher.branch.equals(this.prefix))
        {
            this.teacher = teacher;
        }
        else
        {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }
    }
    void printTeacher()
    {
        this.teacher.print();
    }
}
