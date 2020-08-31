package com.lionbridge.training.assignment.polymorphism;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

class  Employee
{
    private String name;
    private Date dateOfBirth;
    private int id;
    private int salary;


    public Employee(String name, Date dateOfBirth, int id,int salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
class Employee1 extends Employee
{
    public Employee1(String name, Date dateOfBirth, int id,int salary) {
        super(name, dateOfBirth, id,salary);

    }


}
class Employee2 extends Employee
{

    public Employee2(String name, Date dateOfBirth, int id,int salary) {
        super(name, dateOfBirth, id,salary);
    }
}
public class EmployeeSalary{

        public static void main(String args[])
        {
            Date date = new Date(2000,12,20);
            Employee e1 = new Employee1("",date,3,400);

            Employee e2 = new Employee1("",date,3,400);

            Employee e3 = new Employee1("",date,3,400);

            Employee e4 = new Employee2("",date,3,400);

            Employee e5 = new Employee2("",date,3,400);
            List<Employee> list = new ArrayList<>();
            list.add(e1);
            list.add(e2);
            list.add(e3);
            list.add(e4);

            Date currentDate = new Date();
            for(Employee li : list)
            {
                if(currentDate.getMonth() == e1.getDateOfBirth().getMonth() )
                {
                    System.out.println("Salary "+li.getSalary()+100);
                }
                else
                {
                    System.out.println("Salary"+li.getSalary());
                }
            }


        }

}