package model;
/**
 * ����
 * @author ��ƮƮ
 *
 */
public class Card {
	public int cardId;//����ID
	public int userId;//�����û�
	public String cartTimeDate;//���ӷ���ʱ��
	public int good;//�޵ĸ���
	public String cartContent;//��������
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
