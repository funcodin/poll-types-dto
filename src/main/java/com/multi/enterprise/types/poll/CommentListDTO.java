/**
 * 
 */
package com.multi.enterprise.types.poll;

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
@XmlRootElement(name = "commentList")
@XmlAccessorType(XmlAccessType.FIELD)
public class CommentListDTO {

	private int lastCommentIndex;
	private boolean isLastPage;
	private int limit;
	@XmlElementWrapper(name = "comments")
	@XmlElement(name = "comment")
	private List<CommentDTO> comments;

	/**
	 * @return the lastCommentIndex
	 */
	public int getLastCommentIndex() {
		return lastCommentIndex;
	}

	/**
	 * @param lastCommentIndex the lastCommentIndex to set
	 */
	public void setLastCommentIndex(int lastCommentIndex) {
		this.lastCommentIndex = lastCommentIndex;
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
	 * @return the comments
	 */
	public List<CommentDTO> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<CommentDTO> comments) {
		this.comments = comments;
	}

}
