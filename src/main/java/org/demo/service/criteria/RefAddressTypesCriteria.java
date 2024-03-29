/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service.criteria;

/**
 * Criteria bean used for RefAddressTypes search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class RefAddressTypesCriteria {

    private String addressTypeDescription; 
	// Constructor
	public RefAddressTypesCriteria() {
		// Needed empty constructor for serialization
	}

	public void setAddressTypeDescription(String addressTypeDescription) {this.addressTypeDescription = addressTypeDescription;}
	public String getAddressTypeDescription() {return this.addressTypeDescription;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(addressTypeDescription); 
        return sb.toString();
	}
}
