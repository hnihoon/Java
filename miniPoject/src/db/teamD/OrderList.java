package db.teamD;

public class OrderList {
	private int custom_num;
	private String prod_name;
	private int quantity;
	private int price;
	private String p_or_s;
	
	public OrderList() {
		// TODO Auto-generated constructor stub
	}
	public OrderList(String prod_name, int quantity, int price) {
		super();
		this.prod_name = prod_name;
		this.quantity = quantity;
		this.price = price;
	}
	public OrderList(int custom_num, String prod_name, int quantity, int price, String p_or_s) {
		super();
		this.custom_num = custom_num;
		this.prod_name = prod_name;
		this.quantity = quantity;
		this.price = price;
		this.p_or_s = p_or_s;
		
	}

	@Override
	public String toString() {
		return "prod_name=" + prod_name + ", quantity=" + quantity
				+ ", price=" + price;
	}

	public int getCustom_num() {
		return custom_num;
	}

	public String getProd_name() {
		return prod_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public String getP_or_s() {
		return p_or_s;
	}

	public void setCustom_num(int custom_num) {
		this.custom_num = custom_num;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setP_or_s(String p_or_s) {
		this.p_or_s = p_or_s;
	}
	
	
	
	
	
	
	
}
