/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:02:34 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.repository;

import java.util.Date;

import org.demo.entity.StudentClassRegistrations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for StudentClassRegistrations.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface StudentClassRegistrationsRepository  extends JpaRepository<StudentClassRegistrations, Date> {}