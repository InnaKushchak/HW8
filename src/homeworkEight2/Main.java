package homeworkEight2;

public class Main {

    public static void main(String[] args) {
        EmployeeUtils empUtils = new EmployeeUtils();

        Employee emp1 = new homeworkEight2.Employee("Arnold", 10);
        Employee emp2 = new homeworkEight2.Employee("Phoebe", 20);
        Employee emp3 = new homeworkEight2.Employee("Helga", 30);
        Employee[] employees = {emp1, emp2, emp3};
        System.out.println(EmployeeUtils.findByName("Arnold", employees));
        System.out.println(EmployeeUtils.findByName("Anna", employees));
        System.out.println(empUtils.findBySubName("Ph", employees));
        System.out.println(empUtils.findBySubName("ph", employees));

        Worker wr1 = new Worker("Pete", 10);
        Worker wr2 = new Worker("Tim", 20);
        Worker[] workers = {wr1, wr2};
        System.out.println(empUtils.findMaxSalary(workers));
        System.out.println(empUtils.salarySum(workers));

        Manager man1 = new homeworkEight2.Manager("Joe", 10, 1);
        Manager man2 = new homeworkEight2.Manager("John", 20, 2);
        Manager man3 = new homeworkEight2.Manager("Lee", 30, 3);

        Director dir1 = new Director("Chris", 10, 1);
        Director dir2 = new Director("Kyle", 20, 2);
        Director dir3 = new Director("Jasper", 30, 3);
    }
}