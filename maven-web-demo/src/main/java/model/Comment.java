package model;
/**
 * 评论
 * @author 林飘飘
 *
 */
public class Comment {

	public int commentId;//评论ID
	public int userId;//是回复的哪个用户
	public int cardId;//帖子ID
	public String commentContent;//具体内容
	public String commentTimeDate;//时间毫秒值
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
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
