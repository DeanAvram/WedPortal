package superapp.boundries;

import superapp.data.UserRole;

public class UserBoundary {

	private UserId userId;
	private UserRole role;
	private String username;
	private String avatar;
	
	
	public UserBoundary() {
		super();
	}

	public UserBoundary(UserId userId, UserRole role, String username, String avatar) {
		super();
		this.userId = userId;
		this.role = role;
		this.username = username;
		this.avatar = avatar;
	}

	public UserId getUserId() {
		return userId;
	}

	public void setUserId(UserId userId) {
		this.userId = userId;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", role=" + role + ", username=" + username + ", avatar=" + avatar + "]";
	}

}
