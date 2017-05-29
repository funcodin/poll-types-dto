/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Robot
 *
 */
@XmlType
@XmlRootElement(name = "option")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContactUsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private String comment;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the comments
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
