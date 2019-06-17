package spring.model.pay;

public class PayDTO {
	
	int pay_num;
    String id;
    int pay_sum;
    String pay_way;
    String pay_date;
    
    
	public int getPay_num() {
		return pay_num;
	}
	public void setPay_num(int pay_num) {
		this.pay_num = pay_num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPay_sum() {
		return pay_sum;
	}
	public void setPay_sum(int pay_sum) {
		this.pay_sum = pay_sum;
	}
	public String getPay_way() {
		return pay_way;
	}
	public void setPay_way(String pay_way) {
		this.pay_way = pay_way;
	}
	public String getPay_date() {
		return pay_date;
	}
	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}
	@Override
	public String toString() {
		return "PayDTO [pay_num=" + pay_num + ", id=" + id + ", pay_sum=" + pay_sum + ", pay_way=" + pay_way
				+ ", pay_date=" + pay_date + "]";
	}
	public PayDTO(int pay_num, String id, int pay_sum, String pay_way, String pay_date) {
		super();
		this.pay_num = pay_num;
		this.id = id;
		this.pay_sum = pay_sum;
		this.pay_way = pay_way;
		this.pay_date = pay_date;
	}
	public PayDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
