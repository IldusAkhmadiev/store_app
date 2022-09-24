package org.ildus.akhmadiev.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.ildus.akhmadiev.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory factory;

    @Override
    public List<Employee> getAllEmployees() {

        Session session = factory.getCurrentSession();

        Query<Employee> from_employee = session.createQuery("from Employee ", Employee.class);

        List<Employee> resultList = from_employee.getResultList();

        return resultList;

    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = factory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session =  factory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }
}
