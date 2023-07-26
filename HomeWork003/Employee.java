package HomeWork003;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String lastname;
    private String patronymic;
    private String position;
    private String phone;
    private int salary;
    private int yearBirth;

    public Employee(String name, String lastname, String patronymic, String position, String phone, int salary, int yearBirth) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.yearBirth = yearBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + (LocalDate.now().getYear() - yearBirth) +
                '}';
    }
    public String showEmployee() {
        return String.format("Full name: %s %s %s;\n" +
                            "Position: %s;\n" +
                            "Phone: %s; \n" +
                            "Salary: %d;\n" +
                            "Age: %d\n", name, lastname, patronymic, position, phone, salary,(LocalDate.now().getYear() - yearBirth));
    }
    public void salaryUP (int value) {
        this.salary += value;
    }


}
