/*
 * Created on 2018-10-02 ( Date ISO 2018-10-02 - Time 12:09:08 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.demo.service.criteria;

/**
 * Criteria bean used for Classes search.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
public class ClassesCriteria {

    private String className; 
    private String classDescription; 
	// Constructor
	public ClassesCriteria() {
		// Needed empty constructor for serialization
	}

	public void setClassName(String className) {this.className = className;}
	public String getClassName() {return this.className;}
	public void setClassDescription(String classDescription) {this.classDescription = classDescription;}
	public String getClassDescription() {return this.classDescription;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(className); 
		sb.append("|"); 
		sb.append(classDescription); 
        return sb.toString();
	}
}
