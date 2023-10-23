package ru.example.hibernateTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.example.hibernateTest.DAO.DepartmentDAO;
import ru.example.hibernateTest.DAO.EmployeeDAO;
import ru.example.hibernateTest.configuration.AppConfiguration;
import ru.example.hibernateTest.entities.Employee;

public class OneToMany {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		
//		SessionFactory sessionFactory = context.getBean(SessionFactory.class);
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		DepartmentDAO departmentDAO = context.getBean(DepartmentDAO.class);
		
		try {
			Employee employee = employeeDAO.findById(19);
			System.out.println(employee);
//			Department department1 = Department.builder()
//					.name("IT")
//					.build();
//			
//			Department department2 = Department.builder()
//					.name("HR")
//					.build();
//			
//			Employee employee1 = Employee.builder()
//					.name("Ivan")
//					.build();
//			
//			Employee employee2 = Employee.builder()
//					.name("Sergey")
//					.build();
//			
//			Employee employee3 = Employee.builder()
//					.name("Oleg")
//					.build();
//			
//			Employee employee4 = Employee.builder()
//					.name("Pyotr")
//					.build();
//			
//			department1.addEmployees(employee1, employee2);
//			department2.addEmployees(employee3, employee4);
//			
//			departmentDAO.save(department1);
//			departmentDAO.save(department2);
		} finally {
//			sessionFactory.close();
			context.close();
		}
	}

}
