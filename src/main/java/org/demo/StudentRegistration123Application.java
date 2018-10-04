package org.demo;

import org.demo.entity.Addresses;
import org.demo.entity.ParentsAndGuardians;
import org.demo.entity.PropertyOwners;
import org.demo.entity.RefRelationshipTypes;
import org.demo.entity.StudentRelationships;
import org.demo.entity.StudentRelationshipsId;
import org.demo.entity.Students;
import org.demo.service.AddressesService;
import org.demo.service.AddressesServiceImpl;
import org.demo.service.ParentsAndGuardiansService;
import org.demo.service.PropertyOwnersServiceImpl;
import org.demo.service.RefRelationshipTypesService;
import org.demo.service.StudentRelationshipsService;
import org.demo.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentRegistration123Application implements CommandLineRunner{
	@Autowired
	PropertyOwnersServiceImpl pro;
	@Autowired
	AddressesService add;
	@Autowired
	ParentsAndGuardiansService ser;
	@Autowired
	StudentRelationshipsService relationshipsService;
	@Autowired
	RefRelationshipTypesService refRelationshipTypesService;
	@Autowired
	StudentsService studentsService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(StudentRegistration123Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Addresses own = new Addresses();
//		own.setLandlordName("Quan");
//		pro.create(own);
//Addresses addresses = add.getOne(1);
//		
//		ParentsAndGuardians parent = ser.getOne(1);
//		Students stu = studentsService.getOne(1);
		
		RefRelationshipTypes ref = refRelationshipTypesService.getOne(3);
		
		StudentRelationshipsId studentRelationshipsId = new StudentRelationshipsId();
		studentRelationshipsId.setStudentId(2);
		studentRelationshipsId.setPersonId(2);
		
		System.out.println(studentRelationshipsId);
		
		StudentRelationships relation = new StudentRelationships();
		
		relation.setRefRelationshipTypes(ref);
		relation.setId(studentRelationshipsId);
		relationshipsService.update(relation);
		
//		relation.setParentsAndGuardians(parent);
//		relation.setStudents(stu);
//		relation.setRefRelationshipTypes(ref);
		
//		
//		parent.setAddresses(addresses);
//		parent.setGender("Nam");
//		ser.create(parent);
	//	StudentRelationships st = new StudentRelationships();
		
		
		
		
		
	}
}
