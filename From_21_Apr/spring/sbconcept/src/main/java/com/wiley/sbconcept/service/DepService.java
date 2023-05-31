package com.wiley.sbconcept.service;

import java.util.List;

import com.wiley.sbconcept.model.Department;

public interface DepService {
  
	    public Department createDepartment(Department department);
	    public List<Department> getDepartmentsList();
	    public Department getDepartmentById(Long departmentId);
	    public Department getDepartmentByName(String departmentName);
	    public void deleteDepartmentById(Long departmentId);
	    public Department updateDepartment(Department departmentId, Department department);
	}
