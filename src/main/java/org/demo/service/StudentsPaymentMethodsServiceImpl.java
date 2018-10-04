/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;



import java.util.List;

import javax.transaction.Transactional;

import org.demo.entity.StudentsPaymentMethods;
import org.demo.repository.StudentsPaymentMethodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentsPaymentMethodsServiceImpl implements StudentsPaymentMethodsService {

	@Autowired
	private StudentsPaymentMethodsRepository studentsPaymentMethodsRepository;

	@Override
	public StudentsPaymentMethods getOne(Integer studentPaymentMethodId) {
		return studentsPaymentMethodsRepository.findById(studentPaymentMethodId).get();
	}

	@Override
	public Boolean delete(Integer studentPaymentMethodId) {
		if (studentsPaymentMethodsRepository.getOne(studentPaymentMethodId) != null) {
			studentsPaymentMethodsRepository.deleteById(studentPaymentMethodId);
			return true;
		}
		return false;
	}

	@Override
	public StudentsPaymentMethods create(StudentsPaymentMethods studentsPaymentMethods) {
		return studentsPaymentMethodsRepository.save(studentsPaymentMethods);
	}

	@Override
	public StudentsPaymentMethods update(StudentsPaymentMethods studentsPaymentMethodsToUpdate) {
						StudentsPaymentMethods studentsPaymentMethods = studentsPaymentMethodsRepository.getOne(studentsPaymentMethodsToUpdate.getStudentPaymentMethodId());
																										
	
				if(studentsPaymentMethodsToUpdate.getBankDetails() !=null) {
			
		}
				if(studentsPaymentMethodsToUpdate.getCardDetails() !=null) {
			
		}
				if(studentsPaymentMethodsToUpdate.getOtherDetails() !=null) {
			
		}
				return studentsPaymentMethodsRepository.save(studentsPaymentMethods);
	}

	@Override
	public Boolean exist(StudentsPaymentMethods studentsPaymentMethods) {
						return studentsPaymentMethodsRepository.existsById(studentsPaymentMethods.getStudentPaymentMethodId());
																									}

	@Override
	public List<StudentsPaymentMethods> findAll() {
		return studentsPaymentMethodsRepository.findAll();
	}

}


