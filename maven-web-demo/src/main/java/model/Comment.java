package model;
/**
 * 评论
 * @author 林飘飘
 *
 */
public class Comment {

	public int commentId;//评论ID
	public String commentContent;//具体内容
	public String commentTimeDate;//时间毫秒值
	public byte isCommentDelete;//
	public Card card;
	public User user;
	
	
	
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentContent=" + commentContent + ", commentTimeDate="
				+ commentTimeDate + ", isCommentDelete=" + isCommentDelete + ", card=" + card + ", user=" + user + "]";
	}
	public byte getIsCommentDelete() {
		return isCommentDelete;
	}
	public void setIsCommentDelete(byte isCommentDelete) {
		this.isCommentDelete = isCommentDelete;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentTimeDate() {
		return commentTimeDate;
	}
	public void setCommentTimeDate(String commentTimeDate) {
		this.commentTimeDate = commentTimeDate;
	}

}
