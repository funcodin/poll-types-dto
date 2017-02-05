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
public class OptionDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String optionId;
	private String optionValue;
	private int voteCount;

	/**
	 * @return the optionId
	 */
	public String getOptionId() {
		return optionId;
	}

	/**
	 * @param optionId the optionId to set
	 */
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	/**
	 * @return the optionValue
	 */
	public String getOptionValue() {
		return this.optionValue;
	}

	/**
	 * @param optionValue the optionValue to set
	 */
	public void setOptionValue(final String optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * @return the voteCount
	 */
	public int getVoteCount() {
		return this.voteCount;
	}

	/**
	 * @param voteCount the voteCount to set
	 */
	public void setVoteCount(final int voteCount) {
		this.voteCount = voteCount;
	}

}
