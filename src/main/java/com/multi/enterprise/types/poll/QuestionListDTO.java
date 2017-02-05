/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Robot
 *
 */

@XmlType
@XmlRootElement(name = "questionList")
@XmlAccessorType(XmlAccessType.FIELD)
public class QuestionListDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	// This will be used for pagination

	// Last index of the result
	private int lastQuestionIndex;
	// Number of results to be returned.
	private int limit;
	// if this is the last Payload.
	private boolean isLastPage;

	@XmlElementWrapper(name = "questions")
	@XmlElement(name = "question")
	private List<QuestionDTO> questions;

	/**
	 * @return the lastQuestionIndex
	 */
	public int getLastQuestionIndex() {
		return lastQuestionIndex;
	}

	/**
	 * @param lastQuestionIndex the lastQuestionIndex to set
	 */
	public void setLastQuestionIndex(int lastQuestionIndex) {
		this.lastQuestionIndex = lastQuestionIndex;
	}

	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * @return the isLastPage
	 */
	public boolean isLastPage() {
		return isLastPage;
	}

	/**
	 * @param isLastPage the isLastPage to set
	 */
	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	/**
	 * @return the questionsDto
	 */
	public List<QuestionDTO> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questionsDto to set
	 */
	public void setQuestions(List<QuestionDTO> questions) {
		this.questions = questions;
	}

}
