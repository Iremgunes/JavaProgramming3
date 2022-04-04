package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(1,0);
        numbers.add(2,45);
        numbers.add(6,50);

        System.out.println(numbers);

        System.out.println(numbers.size());

        Integer lastIndex = numbers.size() - 1 ;
        System.out.println("lastIndex = " + lastIndex);

      int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("---------------------");

        for (int i = 0; i <numbers.size(); i++) {

            System.out.println(numbers.get(i));
        }

        System.out.println("--------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("java");
        list.add("c#");
        list.add("ruby");

        list.set(2, "javaScript");

        System.out.println(list);
        System.out.println("-------------------");

        list.remove(2);
        System.out.println(list);

        ArrayList<String> employees = new ArrayList<>();
        employees.add("suat");
        employees.add("aygun");
        employees.add("olga");
        employees.add("aygun");
        employees.add("neira");
        employees.add("ali");
        employees.add("hulya");
        employees.add("kaloyan");


        System.out.println(employees);
        employees.remove(5);
        System.out.println(employees);
        //employees.remove(-1);
       // System.out.println(employees);

        employees.remove(employees.size() -1);
        System.out.println(employees);

        employees.remove("ali");
        System.out.println(employees);

        employees.remove("irem");
        System.out.println(employees);

        employees.remove("aygun");
        System.out.println(employees);


    }
}
