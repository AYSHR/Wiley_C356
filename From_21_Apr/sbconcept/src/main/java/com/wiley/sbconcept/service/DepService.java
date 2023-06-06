package com.wiley.sbconcept.service;

import java.util.List;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Department;

public interface DepService {
  
	    public Department createDepartment(Department department);
	    public List<Department> getDepartmentsList();
	    public Department getDepartmentById(Long departmentId) throws DepNotFoundException;
	    public Department getDepartmentByName(String deptname);
	    public void deleteDepartmentById(Long departmentId)throws DepNotFoundException;
		public Department updateDepartment(Long departmentId, Department dep);

}
