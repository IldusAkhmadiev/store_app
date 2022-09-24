package org.ildus.akhmadiev.spring.controller;

import org.ildus.akhmadiev.spring.service.EmployeeService;
import org.ildus.akhmadiev.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/addEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employee-info";
    }

    @RequestMapping("saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        service.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("updateInfo")
    public String updateEmployee(@RequestParam("empId") int id,Model model ) {
        Employee employee = service.getEmployee(id);
        model.addAttribute("employee",employee);
        return "employee-info";
    }

    @RequestMapping("deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {
        service.deleteEmployee(id);
        return "redirect:/";
    }
}
