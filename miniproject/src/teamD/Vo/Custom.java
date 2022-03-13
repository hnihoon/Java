package db.teamD;

public class Custom {
	private int custom_num;	//고객(주문) 번호
	private String p_or_s;	//포장or매장 여부
	
	public Custom() {
		// TODO Auto-generated constructor stub
	}
	
	public Custom(int custom_num, String p_or_s) {
		super();
		this.custom_num = custom_num;
		this.p_or_s = p_or_s;
	}

	public int getCustom_num() {
		return custom_num;
	}

	public String getP_or_s() {
		return p_or_s;
	}

	public void setCustom_num(int custom_num) {
		this.custom_num = custom_num;
	}

	public void setP_or_s(String p_or_s) {
		this.p_or_s = p_or_s;
	}

	@Override
	public String toString() {
		return "custom_num: " + custom_num + ", p_or_s: " + p_or_s;
	}
	
	
}
