package com.kiptoo.employeemanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.kiptoo.employeemanager.model.Employee;
import com.kiptoo.employeemanager.service.EmployeeService;

public class EmployeeController {
   
    @Autowired
    private EmployeeService employeeService;
     
    @GetMapping("/")
    public String viewHomePage(Model model){
       model.addAttribute("listEmployees", employeeService);
       return "index";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

     @GetMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

      @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model){
         Employee employee = employeeService.getEmployeeById(id);
         model.addAttribute("employee", employee);
         return "update_employee";
    }
     
     @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id){
        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }

}
