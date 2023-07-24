package hspedu.generic;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericEx02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new MyDate(2000,11,11)));
        employees.add(new Employee("jack",12000,new MyDate(2001,12,12)));
        employees.add(new Employee("tom",50000,new MyDate(1980,10,10)));

        System.out.println(employees);

        System.out.println("对员工进行排序");
        employees.sort(new Comparator<Employee>() {
            @Override
            @SuppressWarnings({"all"})
            public int compare(Employee emp1, Employee emp2) {
                // 先按照name排序 如果name相同，则按照生日日期先后排序
                // 先对传入的参数进行验证
                if(!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = emp1.getName().compareTo(emp2.getName());
                if(i!=0){
                    return i;
                }

                // 如果name相同 比较year
                int yearMinus = emp1.getBirthday().getYear() -emp2.getBirthday().getYear();
                if(yearMinus != 0){
                    return yearMinus;
                }

                int monthMinus = emp1.getBirthday().getMonth()- emp2.getBirthday().getMonth();
                if(monthMinus != 0){
                    return monthMinus;
                }
                return emp1.getBirthday().getDay() - emp2.getBirthday().getDay();

            }
        });

        System.out.println(employees);

    }
}
