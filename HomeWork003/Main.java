package HomeWork003;

public class Main {
    public static void App() {
        Department department = new Department();
        System.out.println((char)27 + "[32mИсходные данные!" + (char)27 + "[0m");
        department.showAllFormat();
        department.showAll();
        System.out.println((char)27 + "[32mДанные после повышения зарплаты на 5к, для сотрудников 45+" + (char)27 + "[0m");
        department.upSalary(45,5000);
        department.showAll();
        System.out.println((char)27 + "[32mДанные после повышения зарплаты на 5к, для сотрудников 45+ и не руководителям " + (char)27 + "[0m");
        Leader.upper(department.re(), 45,5000);
        department.showAll();
        department.aveAge(department.re());
        department.aveSalary(department.re());
    }
}
