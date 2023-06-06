package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.service.DepService;

@RestController
public class DepartmentController {

	@Autowired
    private DepService depService;
    @GetMapping("/departments")
    public List<Department> getAllDepartments(){

        return depService.getDepartmentsList();
    }
    @PostMapping("/departments")
    public Department createDepartment(@RequestBody Department department){
        return depService.createDepartment(department);
    }
    
    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long depId) throws DepNotFoundException {
           
        return depService.getDepartmentById(depId);
    }
    
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long depId) throws DepNotFoundException {
    	
    	depService.deleteDepartmentById(depId); 
        return "department deleted successfully";
    }
    
    @DeleteMapping("/departments/name/{name}")
    public String getDepartmentByNmae(@PathVariable("name") String deptname)   {
    	
    	depService.getDepartmentByName(deptname); 
        return "department deleted successfully";
    }
    
    @PutMapping("/departments/{id}")
    public String updateDepartmentById(@PathVariable("id") Long depId,@RequestBody Department department) {
    	
    	depService.updateDepartment(depId,department); 
        return "department updated successfully";
    }

}
