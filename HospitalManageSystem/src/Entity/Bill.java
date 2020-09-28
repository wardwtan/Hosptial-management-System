package Entity;

public class Bill {
	private String name;
	private String email;
	private String type;
	private String detail;
	private String price;
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	public Bill(String name, String email, String type,String price, String detail ) {
		super();
		this.name = name;
		this.email = email;
		this.type = type;
		this.detail = detail;
		this.price = price;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
