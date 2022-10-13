
/*
 *  Link       : https://app.patika.dev/courses/java101
 *  @author    : Emre Demir
 *  Repository : https://github.com/emredemirr/Java101
 */package Classes.SalaryCalculator;

public class Employee
{
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax()
    {
        if (this.salary <= 1000)
        {
            return 0;
        } else {
            return (this.salary * 3 / 100);
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double salaryRaise() {
        int workYears = 2021 - this.hireYear;
        if (workYears < 10) {
            return (this.salary * (5.0/100));
        } else if (workYears < 20) {
            return this.salary * (10.0/100);
        } else {
            return (this.salary * (15.0/100));
        }
    }

    void print()
    {
        System.out.println("Adı: " + this.name
                + "\nMaaşı: " + this.salary
                + "\nİşe Giriş: " + this.hireYear
                + "\nVergi: " + tax()
                + "\nBonus: " + bonus()
                + "\nZam: " + salaryRaise()
                + "\nVergi ve Bonuslar ile birlikte maaş: " + (this.salary + bonus() - tax())
                + "\nNet Maaş: " + (this.salary + salaryRaise()));
    }
}
