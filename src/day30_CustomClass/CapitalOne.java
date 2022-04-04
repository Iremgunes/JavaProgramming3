package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 25, 2237, 'M', "Developer", 100000, true);
        employee2.setInfo("Anna", 28, 2378,'F',"QA", 85000, true);
        employee3.setInfo("Dvaid", 35, 2290, 'M', "Manager", 45000, false );
        employee4.setInfo("Lina", 45, 2290, 'F', "Manager", 80000, true);
        employee5.setInfo("Kevin", 35, 2298, 'F', "Senior QA", 1100000, true);

        Employee[] employees = {employee1, employee2,employee3,employee4, employee5};

        int countFullTime = 0;

        int countPartTime = 0;

        for (Employee employee : employees ) {

            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

        }


        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);

        double maxSalary = employee1.salary;
        double minSalary = employee1.salary;
        for (Employee each : employees) {
            if(each.salary> maxSalary){
                maxSalary = each.salary;
            }

            if(each.salary < minSalary){
                minSalary = each.salary;
            }
        }
        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);




    }
}
