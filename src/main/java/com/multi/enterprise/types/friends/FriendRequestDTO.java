/**
 * 
 */
package com.multi.enterprise.types.friends;

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
@XmlRootElement(name = "friendRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class FriendRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String friendRequestId;
	private String requesterUserId;
	private String accepterUserId;

	/**
	 * @return the friendRequestId
	 */
	public String getFriendRequestId() {
		return friendRequestId;
	}

	/**
	 * @param friendRequestId the friendRequestId to set
	 */
	public void setFriendRequestId(String friendRequestId) {
		this.friendRequestId = friendRequestId;
	}

	/**
	 * @return the requesterUserId
	 */
	public String getRequesterUserId() {
		return requesterUserId;
	}

	/**
	 * @param requesterUserId the requesterUserId to set
	 */
	public void setRequesterUserId(String requesterUserId) {
		this.requesterUserId = requesterUserId;
	}

	/**
	 * @return the accepterUserId
	 */
	public String getAccepterUserId() {
		return accepterUserId;
	}

	/**
	 * @param accepterUserId the accepterUserId to set
	 */
	public void setAccepterUserId(String accepterUserId) {
		this.accepterUserId = accepterUserId;
	}

}
