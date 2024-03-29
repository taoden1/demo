/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service.criteria;

/**
 * Criteria bean used for StudentsPaymentMethods search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class StudentsPaymentMethodsCriteria {

    private String bankDetails; 
    private String cardDetails; 
    private String otherDetails; 
	// Constructor
	public StudentsPaymentMethodsCriteria() {
		// Needed empty constructor for serialization
	}

	public void setBankDetails(String bankDetails) {this.bankDetails = bankDetails;}
	public String getBankDetails() {return this.bankDetails;}
	public void setCardDetails(String cardDetails) {this.cardDetails = cardDetails;}
	public String getCardDetails() {return this.cardDetails;}
	public void setOtherDetails(String otherDetails) {this.otherDetails = otherDetails;}
	public String getOtherDetails() {return this.otherDetails;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(bankDetails); 
		sb.append("|"); 
		sb.append(cardDetails); 
		sb.append("|"); 
		sb.append(otherDetails); 
        return sb.toString();
	}
}
