package org.demo.entity;
// Generated Oct 2, 2018 12:02:13 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * StudentRelationships generated by hbm2java
 */
@Entity
@Table(name = "student_relationships", catalog = "studentregistration")
public class StudentRelationships implements java.io.Serializable {

	private StudentRelationshipsId id;
	private ParentsAndGuardians parentsAndGuardians;
	private RefRelationshipTypes refRelationshipTypes;
	private Students students;

	public StudentRelationships() {
	}

	public StudentRelationships(StudentRelationshipsId id, ParentsAndGuardians parentsAndGuardians, Students students) {
		this.id = id;
		this.parentsAndGuardians = parentsAndGuardians;
		this.students = students;
	}

	public StudentRelationships(StudentRelationshipsId id, ParentsAndGuardians parentsAndGuardians,
			RefRelationshipTypes refRelationshipTypes, Students students) {
		this.id = id;
		this.parentsAndGuardians = parentsAndGuardians;
		this.refRelationshipTypes = refRelationshipTypes;
		this.students = students;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "studentId", column = @Column(name = "student_id", nullable = false)),
			@AttributeOverride(name = "personId", column = @Column(name = "person_id", nullable = false)) })
	public StudentRelationshipsId getId() {
		return this.id;
	}

	public void setId(StudentRelationshipsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", nullable = false, insertable = false, updatable = false)
	public ParentsAndGuardians getParentsAndGuardians() {
		return this.parentsAndGuardians;
	}

	public void setParentsAndGuardians(ParentsAndGuardians parentsAndGuardians) {
		this.parentsAndGuardians = parentsAndGuardians;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "relationship_type_code")
	public RefRelationshipTypes getRefRelationshipTypes() {
		return this.refRelationshipTypes;
	}

	public void setRefRelationshipTypes(RefRelationshipTypes refRelationshipTypes) {
		this.refRelationshipTypes = refRelationshipTypes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id", nullable = false, insertable = false, updatable = false)
	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

}
