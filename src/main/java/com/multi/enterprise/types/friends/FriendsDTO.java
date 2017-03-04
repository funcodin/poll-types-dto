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
@XmlRootElement(name = "friends")
@XmlAccessorType(XmlAccessType.FIELD)
public class FriendsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int totalFriends;
	private List<UserDTO> friends;

	/**
	 * @return the totalFriends
	 */
	public int getTotalFriends() {
		return totalFriends;
	}

	/**
	 * @param totalFriends the totalFriends to set
	 */
	public void setTotalFriends(int totalFriends) {
		this.totalFriends = totalFriends;
	}

	/**
	 * @return the friends
	 */
	public List<UserDTO> getFriends() {
		return friends;
	}

	/**
	 * @param friends the friends to set
	 */
	public void setFriends(List<UserDTO> friends) {
		this.friends = friends;
	}

}
