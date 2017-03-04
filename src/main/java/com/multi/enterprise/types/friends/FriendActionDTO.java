/**
 * 
 */
package com.multi.enterprise.types.friends;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Robot
 *
 */

@XmlType
@XmlRootElement(name = "friendAction")
@XmlAccessorType(XmlAccessType.FIELD)
public class FriendActionDTO {

	private String userId;
	private String friendUserId;
	private String actionType;

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
	 * @return the friendUserId
	 */
	public String getFriendUserId() {
		return friendUserId;
	}

	/**
	 * @param friendUserId the friendUserId to set
	 */
	public void setFriendUserId(String friendUserId) {
		this.friendUserId = friendUserId;
	}

	/**
	 * @return the actionType
	 */
	public String getActionType() {
		return actionType;
	}

	/**
	 * @param actionType the actionType to set
	 */
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

}
