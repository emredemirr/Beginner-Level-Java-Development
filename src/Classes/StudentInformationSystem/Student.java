/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */

package Classes.StudentInformationSystem;

public class Student
{
    String name;
    String studentNumber;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    Student(String name, String studentNumber, String classes,Course course1,Course course2,Course course3)
    {
        this.name= name;
        this.studentNumber=studentNumber;
        this.classes= classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note2, int note3,int v1,int v2,int v3)
    {
        if (note1>=0 && note1<=100 && v1>=0 && v1<=100)
        {
            this.course1.note = note1;
            this.course1.note2 = v1;
        }
        if (note2>=0 && note2<=100 && v2>=0 && v2<=100)
        {
            this.course2.note = note2;
            this.course2.note2 = v2;
        }
        if (note3>=0 && note3<=100 && v2>=0 && v2<=100)
        {
            this.course3.note = note3;
            this.course3.note2 = v3;
        }
    }

    void isPass()
    {
        this.average = ((this.course1.note * 0.8)+(this.course1.note2*0.2)+
                        (this.course2.note * 0.8)+(this.course2.note2 * 0.2)+
                        (this.course3.note * 0.8)+(this.course3.note2 * 0.2))/3;

        if (this.average>=50)
            System.out.println("Geçti\n"+"Ortalamanız\t: "+this.average);
        else
            System.out.println("Kaldı\n"+"Ortalamanız\t: "+this.average);
    }

    void printNote()
    {
        System.out.println(this.course1.name+" Notu\t:"+this.course1.note);
        System.out.println(this.course2.name+" Notu\t:"+this.course2.note);
        System.out.println(this.course3.name+" Notu\t:"+this.course3.note);
    }
}
