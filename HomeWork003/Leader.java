package HomeWork003;

public class Leader extends Employee{
    public Leader(String name, String lastname, String patronymic, String position, String phone, int salary, int yearBirth) {
        super(name, lastname, patronymic, position, phone, salary, yearBirth);
    }
    public static void upper(Employee[] emp, int age, int value) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age & !(emp[i] instanceof Leader)) {
                emp[i].salaryUP(value);
            }
        }
    }
}
