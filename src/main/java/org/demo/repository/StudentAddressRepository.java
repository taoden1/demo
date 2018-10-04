/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:02:34 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.repository;

import org.demo.entity.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for StudentAddress.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface StudentAddressRepository  extends JpaRepository<StudentAddress, Integer> {}