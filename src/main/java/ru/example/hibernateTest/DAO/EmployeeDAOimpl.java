package ru.example.hibernateTest.DAO;

import org.springframework.stereotype.Repository;

import ru.example.hibernateTest.entities.Employee;

@Repository
public final class EmployeeDAOimpl extends DAOimpl<Employee> implements EmployeeDAO {

}
