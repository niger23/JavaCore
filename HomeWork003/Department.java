package HomeWork003;


public class Department {
    private Employee[] department;

    public Department() {
        this.department = new Employee[5];
        department[0] = new Leader("John", "Snow", "Snowowich", "director", "12345", 10000, 1970);
        department[1] = new Employee("Kally", "Smith", "Smittowich", "designer", "12346", 11000, 1976);
        department[2] = new Employee("Poll", "Scott", "Ivanowich", "designer", "12347", 12000, 1982);
        department[3] = new Employee("Bill", "Hill", "Petrov", "builder", "12348", 13000, 1993);
        department[4] = new Employee("Alex", "Will", "Rectorich", "manager", "12349", 14000, 2004);
    }

    public Employee[] re() {
        return department;
    }

    public void showAll() {
        System.out.println((char)27 + "[33mОтдел: " + (char)27 + "[0m");
        for (Employee emp : department) {
            System.out.println(emp);
        }
    }

    public void showAllFormat() {
        System.out.println((char)27 + "[33mОтдел: " + (char)27 + "[0m");
        int count = 1;
        for (Employee emp : department) {
            System.out.println(count + " " + emp.showEmployee());
            count++;
        }
    }

    public void upSalary(int age, int howUp) {
        for (Employee emp : department) {
            if (emp.getAge() > age) emp.setSalary(emp.getSalary() + howUp);
        }
    }

    public void aveAge(Employee[] emp) {
        int sum = 0;
        for (int i = 0; i < emp.length; i++) {
            sum += emp[i].getAge();
        }
        System.out.println((char)27 + "[34mСредний возраст в отделе: " + sum / emp.length + (char)27 + "[0m");
    }

    public void aveSalary(Employee[] emp) {
        int sum = 0;
        for (int i = 0; i < emp.length; i++) {
            sum += emp[i].getSalary();
        }
        System.out.println((char)27 + "[34mСредняя зарплата в отделе: " + sum / emp.length + (char)27 + "[0m");
    }
}
