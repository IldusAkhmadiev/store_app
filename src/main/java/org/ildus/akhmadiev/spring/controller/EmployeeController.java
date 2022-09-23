package org.ildus.akhmadiev.spring.controller;

import org.ildus.akhmadiev.spring.service.EmployeeService;
import org.ildus.akhmadiev.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = service.getAllEmployee();
        model.addAttribute("allEmps",allEmployees);
        return "all-employees";
    }
}
