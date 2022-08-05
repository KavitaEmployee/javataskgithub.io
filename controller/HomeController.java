package com.Arc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arc.entity.Employee;
import com.Arc.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	private EmployeeService service;
	
    @RequestMapping("/home")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping("/showData")
	public String showData(ModelMap map)
	{
		List<Employee> employees = service.getAllEmployee();
		map.addAttribute("emp", employees);
		return "DisplayData";
	}
	
	@RequestMapping("/deleteData")
	public String deleteData(@RequestParam("id") int id,ModelMap map)
	{
		Employee employee = new Employee();
		employee.setId(id);
		service.deleteData(employee);
		
		List<Employee> employees = service.getAllEmployee();
		map.addAttribute("emp", employees);
		
		return "DisplayData";
	}
	
	@RequestMapping("/updateData")
	public String updateData(@RequestParam("id") int id,ModelMap map)
	{
		Optional<Employee> employee = service.getEmlpoyeeById(id);
		
		if(employee.isPresent())
		{
			Employee employee2 = employee.get();
			map.addAttribute("emp", employee2);
		}
		
		return "updatePage";
	}
	
	@RequestMapping("/UpdateNewData")
	public String updateNewData(@ModelAttribute("emp") Employee employee)
	{
		service.saveData(employee);
		return "home";
	}
}


























