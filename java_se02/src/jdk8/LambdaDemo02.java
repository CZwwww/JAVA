package jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo02 {
	public static void main(String[] args) {
		List<Employee> employees = 
				Arrays.asList(
						new Employee("����", 18, 9999.99),
						new Employee("����",21,8888.88),
						new Employee("����", 50, 7777.77),
						new Employee("����",16,6666.66),
						new Employee("����", 8, 999.99)
						);
		System.out.println(employees);
		List<Employee> emps = 
						filterEmployee(employees,new FilterEmployeeByAge());
		System.out.println(emps);
		//�����ڲ���
		List<Employee> emps1 = 
				filterEmployee(employees,new MyPredicate<Employee>()
					{
					
					@Override
					public boolean test(Employee t) {
						// TODO Auto-generated method stub
						return t.getAge()<35;
					}
				});
		System.out.println(emps1);
		//Lambda���ʽ
		List<Employee> emps2 = 
				filterEmployee(employees,(t)->t.getAge()<35);
		//���췽ʽ4:ǿ���Stream api
		employees.stream().filter(
				(e)->e.getAge()>=35).forEach(System.out ::println);
	}
	public static List<Employee> filterEmployee01(List<Employee> employees) {
		List<Employee> emps = 
				new ArrayList<>();
		for(Employee emp:employees) {
			 if(emp.getAge()>35) {
				emps.add(emp);
			}
		}
		return emps;
	}
	public static List<Employee> filterEmployee(List<Employee> list,
			MyPredicate<Employee> mp){
		List<Employee> emps = 
				new ArrayList<>();
		for(Employee emp:list) {
			if(mp.test(emp)) {
				emps.add(emp);
			}
		}
		return emps;
	}
}
//�������ģʽ
class FilterEmployeeByAge implements MyPredicate<Employee>{

	@Override
	public boolean test(Employee t) {
		// TODO Auto-generated method stub
		return t.getAge()>35;
	}
	
}