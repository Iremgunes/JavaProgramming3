package day35_Encapsulation.encapsulation;



public class EmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Tatiana", 'F', 28, 10000);

        System.out.println(employee1);

        int another = employee1.getAge();
        System.out.println(another);
        System.out.println(employee1.getAge());

        Employee employee2 = new Employee("Aygun", 'F', 31, 119000);

        employee2.setName("Elvina");
        employee2.setSalary(employee1.getSalary() + 15000);

        System.out.println(employee2);

    }
}
