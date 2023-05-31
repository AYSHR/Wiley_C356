package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
