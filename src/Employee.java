import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Employee {
    Employee worker1;
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double baseSalary;
    double salaryRaise;

    Employee(String name,double salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.baseSalary = salary;
    }

    void tax(){

    //    this.worker1 = worker1;
        if(this.salary>1000) {
            tax = this.salary * 0.03;
            this.salary -= tax;
        }
    }

    void bonus(){
    //    this.worker1 = worker1;
        if(this.workHours>40) {
            bonus = this.workHours - 40;
            bonus *=30;
            this.salary += bonus;

        }
    }

    void raiseSalary(){
        Date nowDate = new Date();
        DateFormat df = new SimpleDateFormat("yyyy");
        int workYear = Integer.parseInt(df.format(nowDate));
        workYear -= this.hireYear;


        if (workYear<10)this.salaryRaise = this.salary * 0.05;
        else if(workYear>9 && workYear<20)this.salaryRaise = this.salary * 0.10;
        else if(workYear > 19)this.salaryRaise = this.salary * 0.15;


    }
    void toStr(){
        System.out.println("Adı Soyadı \t\t\t\t\t\t\t:" + this.name);
        System.out.println("Maaşı \t\t\t\t\t\t\t\t:" + this.baseSalary);
        System.out.println("Haftalık Çalışma Saati \t\t\t\t:" + this.workHours);
        System.out.println("Vergi \t\t\t\t\t\t\t\t:" + this.tax);
        System.out.println("Bonus \t\t\t\t\t\t\t\t:" + this.bonus);
        System.out.println("Maaş artışı \t\t\t\t\t\t:" + this.salaryRaise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + this.salary);
        System.out.println("Toplam Maaş \t\t\t\t\t\t:" + (this.salary + this.salaryRaise));
    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev