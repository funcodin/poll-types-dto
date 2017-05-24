/**
 * 
 */
package com.multi.enterprise.types.users;

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
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;
	private String username;
	private String password;
	private String ageGroup;
	private String gender;
	private String fullName;
	private String email;
	private String contactNumber;
	private int questionsAsked;
	private int questionsAnswered;
	private int commentsMade;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the ageGroup
	 */
	public String getAgeGroup() {
		return ageGroup;
	}

	/**
	 * @param ageGroup the ageGroup to set
	 */
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the questionsAsked
	 */
	public int getQuestionsAsked() {
		return questionsAsked;
	}

	/**
	 * @param questionsAsked the questionsAsked to set
	 */
	public void setQuestionsAsked(int questionsAsked) {
		this.questionsAsked = questionsAsked;
	}

	/**
	 * @return the questionsAnswered
	 */
	public int getQuestionsAnswered() {
		return questionsAnswered;
	}

	/**
	 * @param questionsAnswered the questionsAnswered to set
	 */
	public void setQuestionsAnswered(int questionsAnswered) {
		this.questionsAnswered = questionsAnswered;
	}

	/**
	 * @return the commentsMade
	 */
	public int getCommentsMade() {
		return commentsMade;
	}

	/**
	 * @param commentsMade the commentsMade to set
	 */
	public void setCommentsMade(int commentsMade) {
		this.commentsMade = commentsMade;
	}

}
