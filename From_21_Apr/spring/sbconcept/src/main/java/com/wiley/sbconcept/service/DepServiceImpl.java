package com.wiley.sbconcept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.repository.DepRepo;

@Service
public class DepServiceImpl implements DepService {

	@Autowired
	private DepRepo depRepo;

	@Override
	public Department createDepartment(Department department) {
		// TODO Auto-generated method stub
		return depRepo.save(department);
	}

	@Override
	public List<Department> getDepartmentsList() {
		// TODO Auto-generated method stub
		return depRepo.findAll();
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepartmentByName(String departmentName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Department updateDepartment(Department departmentId, Department department) {
		// TODO Auto-generated method stub
		return null;
	}

}
