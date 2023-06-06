package com.wiley.sbconcept.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.exception.DepNotFoundException;
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
	public Department getDepartmentById(Long departmentId) throws DepNotFoundException {
		 Optional<Department> dep=depRepo.findById(departmentId);
		 if(!dep.isPresent()) {
			 throw new DepNotFoundException("department isn't available");
		 }
		return dep.get();
	}
     
	
	@Override
	public Department getDepartmentByName(String departmentName) {
		// TODO Auto-generated method stub
		return depRepo.findByDepartmentName(departmentName);
	
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		
		depRepo.deleteById(departmentId);
		// TODO Auto-generated method stub

	}

	@Override
	public Department updateDepartment(Long departmentId, Department dep) {
		// TODO Auto-generated method stub
		Department depfromDB=depRepo.findById(departmentId).get();
		if(Objects.nonNull(dep.getDepartmentName()) && !"".equalsIgnoreCase(dep.getDepartmentName())) {
			depfromDB.setDepartmentName(dep.getDepartmentName());
		}
		if(Objects.nonNull(dep.getDepartmentAddress()) && !"".equalsIgnoreCase(dep.getDepartmentAddress())) {
			depfromDB.setDepartmentAddress(dep.getDepartmentAddress());
		}
		if(Objects.nonNull(dep.getDepartmentCode()) && !"".equalsIgnoreCase(dep.getDepartmentCode())) {
			depfromDB.setDepartmentCode(dep.getDepartmentCode());
		}
		 
		return depRepo.save(depfromDB);
		
				}

	

	
}
