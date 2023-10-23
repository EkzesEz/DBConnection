package ru.example.hibernateTest.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ru.example.hibernateTest.entities.Department;
import ru.example.hibernateTest.entities.Employee;

@Configuration
@ComponentScan("ru.impuls.hibernateTest")
public class AppConfiguration {
	@Bean
	@Scope("prototype")
	public Session sessionBean(){
		SessionFactory sessionFactory = new org.hibernate.cfg.Configuration()
				.configure()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
				.buildSessionFactory();
		return sessionFactory.openSession();
	}
}
