/**
 * 
 */
package com.multi.enterprise.types.friends;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.multi.enterprise.types.users.UserDTO;

/**
 * @author Robot
 *
 */
@XmlType
@XmlRootElement(name = "friendList")
@XmlAccessorType(XmlAccessType.FIELD)
public class FriendListDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private UserDTO selfUser;
	private List<UserDTO> userFriendList;

	/**
	 * @return the selfUser
	 */
	public UserDTO getSelfUser() {
		return selfUser;
	}

	/**
	 * @param selfUser the selfUser to set
	 */
	public void setSelfUser(UserDTO selfUser) {
		this.selfUser = selfUser;
	}

	/**
	 * @return the userFriendList
	 */
	public List<UserDTO> getUserFriendList() {
		return userFriendList;
	}

	/**
	 * @param userFriendList the userFriendList to set
	 */
	public void setUserFriendList(List<UserDTO> userFriendList) {
		this.userFriendList = userFriendList;
	}

}
