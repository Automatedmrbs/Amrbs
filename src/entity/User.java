package entity;

public class User {
	private Long id;
    private String name;
    private String email;
    private String phone;
    private int credits;
    private Role role; // Admin, Manager, Member
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User(Long id, String name, String email, String phone, int credits, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.credits = credits;
		this.role = role;
	}
	public User(int i, String name2, String email2, String password, Role member) {
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String name2, String email2, String password, Role admin) {
		// TODO Auto-generated constructor stub
	}
	
	
}
