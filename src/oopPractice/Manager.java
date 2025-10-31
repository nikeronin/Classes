package oopPractice;

public class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    public String work() {
        return "Имя сотрудника: " + name + ", Зарплата: " + salary;
    }

}
