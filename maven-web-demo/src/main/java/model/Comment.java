package model;
/**
 * ����
 * @author ��ƮƮ
 *
 */
public class Comment {

	public int commentId;//����ID
	public int userId;//�ǻظ����ĸ��û�
	public int cardId;//����ID
	public String commentContent;//��������
	public String commentTimeDate;//ʱ�����ֵ
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
