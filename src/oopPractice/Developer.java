package oopPractice;

public class Developer extends Employee{
    public Developer (String name, int salary) {
        super(name, salary);

    }
    public String work() {
        return "Имя сотрудника: " + name + ", Зарплата: " + salary;
    }

}
