/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:02:34 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service;

import java.util.Date;
import java.util.List;

import org.demo.entity.StudentClassRegistrations;

public interface StudentClassRegistrationsService {

	public StudentClassRegistrations getOne(Date dateOfRegistration);

	public List<StudentClassRegistrations> findAll();

	public Boolean delete(Date dateOfRegistration);

	public StudentClassRegistrations create(StudentClassRegistrations studentClassRegistrations);

	public StudentClassRegistrations update(StudentClassRegistrations studentClassRegistrations);

	public Boolean exist(StudentClassRegistrations studentClassRegistrations);
}
