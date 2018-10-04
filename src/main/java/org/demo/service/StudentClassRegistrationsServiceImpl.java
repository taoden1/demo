/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;



import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.demo.entity.StudentClassRegistrations;
import org.demo.repository.StudentClassRegistrationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentClassRegistrationsServiceImpl implements StudentClassRegistrationsService {

	@Autowired
	private StudentClassRegistrationsRepository studentClassRegistrationsRepository;

	@Override
	public StudentClassRegistrations getOne(Date dateOfRegistration) {
		return studentClassRegistrationsRepository.findById(dateOfRegistration).get();
	}

	@Override
	public Boolean delete(Date dateOfRegistration) {
		if (studentClassRegistrationsRepository.getOne(dateOfRegistration) != null) {
			studentClassRegistrationsRepository.deleteById(dateOfRegistration);
			return true;
		}
		return false;
	}

	@Override
	public StudentClassRegistrations create(StudentClassRegistrations studentClassRegistrations) {
		return studentClassRegistrationsRepository.save(studentClassRegistrations);
	}

	@Override
	public StudentClassRegistrations update(StudentClassRegistrations studentClassRegistrationsToUpdate) {
						StudentClassRegistrations studentClassRegistrations = studentClassRegistrationsRepository.getOne(studentClassRegistrationsToUpdate.getDateOfRegistration());
																										
	
				if(studentClassRegistrationsToUpdate.getDateOfFirstClass() !=null) {
			
		}
				if(studentClassRegistrationsToUpdate.getDateOfLastClass() !=null) {
			
		}
				if(studentClassRegistrationsToUpdate.getOtherDetails() !=null) {
			
		}
				return studentClassRegistrationsRepository.save(studentClassRegistrations);
	}

	@Override
	public Boolean exist(StudentClassRegistrations studentClassRegistrations) {
						return studentClassRegistrationsRepository.existsById(studentClassRegistrations.getDateOfRegistration());
																									}

	@Override
	public List<StudentClassRegistrations> findAll() {
		return studentClassRegistrationsRepository.findAll();
	}

}


