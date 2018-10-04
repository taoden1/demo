/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.demo.entity.StudentRelationships;
import org.demo.entity.StudentRelationshipsId;
import org.demo.repository.StudentRelationshipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentRelationshipsServiceImpl implements StudentRelationshipsService {

	@Autowired
	private StudentRelationshipsRepository studentRelationshipsRepository;

	@Override
	public StudentRelationships getOne(StudentRelationshipsId studentRelationshipsId) {
		return studentRelationshipsRepository.findById(studentRelationshipsId).get();
	}

	@Override
	public Boolean delete(StudentRelationshipsId studentRelationshipsId) {
		if (studentRelationshipsRepository.getOne(studentRelationshipsId) != null) {
			studentRelationshipsRepository.deleteById(studentRelationshipsId);
			return true;
		}
		return false;
	}

	@Override
	public StudentRelationships create(StudentRelationships studentRelationships) {
		return studentRelationshipsRepository.save(studentRelationships);
	}

	@Override
	public StudentRelationships update(StudentRelationships studentRelationshipsToUpdate) {
		StudentRelationships studentRelationships =  studentRelationshipsRepository.getOne(studentRelationshipsToUpdate.getId());

		return studentRelationshipsRepository.save(studentRelationshipsToUpdate);
	}

	@Override
	public Boolean exist(StudentRelationshipsId studentRelationshipsId) {
		return studentRelationshipsRepository.existsById(studentRelationshipsId);
	}

	@Override
	public List<StudentRelationships> findAll() {
		return studentRelationshipsRepository.findAll();
	}

}
