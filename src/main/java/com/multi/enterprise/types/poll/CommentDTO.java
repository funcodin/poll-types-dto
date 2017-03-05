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
@XmlRootElement(name = "comment")
@XmlAccessorType(XmlAccessType.FIELD)
public class CommentDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private int commentIndex;
	private String questionId;
	private String userId;
	private String comment;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the commentIndex
	 */
	public int getCommentIndex() {
		return commentIndex;
	}

	/**
	 * @param commentIndex the commentIndex to set
	 */
	public void setCommentIndex(int commentIndex) {
		this.commentIndex = commentIndex;
	}

	/**
	 * @return the questionId
	 */
	public String getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

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
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
