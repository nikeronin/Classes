package oopPractice;

public class Employee {

    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println(this.work());
    }

    public String work() {
      return "Имя сотрудника: " + name + ", Зарплата: " + salary;
    }
}

