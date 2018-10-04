/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service.criteria;

/**
 * Criteria bean used for ParentsAndGuardians search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class ParentsAndGuardiansCriteria {

    private String gender; 
    private String firstName; 
    private String middleName; 
    private String lastName; 
    private String cellMobileNumber; 
    private String emailAddress; 
    private String otherDetails; 
	// Constructor
	public ParentsAndGuardiansCriteria() {
		// Needed empty constructor for serialization
	}

	public void setGender(String gender) {this.gender = gender;}
	public String getGender() {return this.gender;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getFirstName() {return this.firstName;}
	public void setMiddleName(String middleName) {this.middleName = middleName;}
	public String getMiddleName() {return this.middleName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public String getLastName() {return this.lastName;}
	public void setCellMobileNumber(String cellMobileNumber) {this.cellMobileNumber = cellMobileNumber;}
	public String getCellMobileNumber() {return this.cellMobileNumber;}
	public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}
	public String getEmailAddress() {return this.emailAddress;}
	public void setOtherDetails(String otherDetails) {this.otherDetails = otherDetails;}
	public String getOtherDetails() {return this.otherDetails;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(gender); 
		sb.append("|"); 
		sb.append(firstName); 
		sb.append("|"); 
		sb.append(middleName); 
		sb.append("|"); 
		sb.append(lastName); 
		sb.append("|"); 
		sb.append(cellMobileNumber); 
		sb.append("|"); 
		sb.append(emailAddress); 
		sb.append("|"); 
		sb.append(otherDetails); 
        return sb.toString();
	}
}
