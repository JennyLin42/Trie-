package model;
/**
 * 帖子
 * @author 林飘飘
 *
 */
public class Card {
	public int cardId;//帖子ID
	public int userId;//发布用户
	public String cartTimeDate;//帖子发布时间
	public int good;//赞的个数
	public String cartContent;//帖子内容
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCartTimeDate() {
		return cartTimeDate;
	}
	public void setCartTimeDate(String cartTimeDate) {
		this.cartTimeDate = cartTimeDate;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public String getCartContent() {
		return cartContent;
	}
	public void setCartContent(String cartContent) {
		this.cartContent = cartContent;
	}

}
