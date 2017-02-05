/**
 * 
 */
package com.multi.enterprise.types.poll;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Robot
 *
 */

@XmlType
@XmlRootElement(name = "question")
@XmlAccessorType(XmlAccessType.FIELD)
public class QuestionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String questionId;
	private String pollQuestion;
	private String optionType;
	private int totalVotes;
	private List<OptionDTO> options;

	// Tommy this is for future use. No need to worry about it
	private String userId;
	private String qrCodeUrl;
	private String mediaUrl;

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
	 * @return the question
	 */
	public String getPollQuestion() {
		return this.pollQuestion;
	}

	/**
	 * @param pollQuestion the question to set
	 */
	public void setPollQuestion(final String pollQuestion) {
		this.pollQuestion = pollQuestion;
	}

	/**
	 * @return the optionType
	 */
	public String getOptionType() {
		return this.optionType;
	}

	/**
	 * @param optionType the optionType to set
	 */
	public void setOptionType(final String optionType) {
		this.optionType = optionType;
	}

	/**
	 * @return the qrCodeUrl
	 */
	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}

	/**
	 * @param qrCodeUrl the qrCodeUrl to set
	 */
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

	/**
	 * @return the mediaUrl
	 */
	public String getMediaUrl() {
		return this.mediaUrl;
	}

	/**
	 * @param mediaUrl the mediaUrl to set
	 */
	public void setMediaUrl(final String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return this.userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(final String userId) {
		this.userId = userId;
	}

	/**
	 * @return the totalVotes
	 */
	public int getTotalVotes() {
		return this.totalVotes;
	}

	/**
	 * @param totalVotes the totalVotes to set
	 */
	public void setTotalVotes(final int totalVotes) {
		this.totalVotes = totalVotes;
	}

	/**
	 * @return the options
	 */
	public List<OptionDTO> getOptions() {
		return this.options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(final List<OptionDTO> options) {
		this.options = options;
	}

}
