package model;
/**
 * �û�
 * @author ��ƮƮ
 *
 */
public class User {
	public int userId ;//�û�ID
	public String userName;//�û���
	public String address;//�û���ַ
	public String phone;//�ֻ�����
	public String headPicture;//ͷ���ַ
	public String getHeadPicture() {
		return headPicture;
	}
	public void setHeadPicture(String headPicture) {
		this.headPicture = headPicture;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", phone=" + phone
				+ ", headPicture=" + headPicture + "]";
	}
	
	
	

}
