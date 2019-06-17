package spring.model.payitem;

public class PayItemDTO {
	
	int pay_item_num;  //고유번호
    //cart_num        NUMBER NOT NULL,
    //order_num         NUMBER NULL,
    int pay_item_price; //각 영화의 가격(들)
    int movie_num;      //영화 테이블에서 가져오는 아이디
    int pay_num;        //pay테이블에서 가져오는거
    //PRIMARY KEY (pay_item_num),
    //FOREIGN KEY (movie_num) REFERENCES movie,
    //FOREIGN KEY (pay_num) REFERENCES pay
    //FOREIGN KEY (cart_num) REFERENCES cart
    
    
    
	public int getPay_item_num() {
		return pay_item_num;
	}
	public void setPay_item_num(int pay_item_num) {
		this.pay_item_num = pay_item_num;
	}
	public int getPay_item_price() {
		return pay_item_price;
	}
	public void setPay_item_price(int pay_item_price) {
		this.pay_item_price = pay_item_price;
	}
	public int getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(int movie_num) {
		this.movie_num = movie_num;
	}
	public int getPay_num() {
		return pay_num;
	}
	public void setPay_num(int pay_num) {
		this.pay_num = pay_num;
	}
	
	@Override
	public String toString() {
		return "PayItemDTO [pay_item_num=" + pay_item_num + ", pay_item_price=" + pay_item_price + ", movie_num="
				+ movie_num + ", pay_num=" + pay_num + "]";
	}
	
	public PayItemDTO(int pay_item_num, int pay_item_price, int movie_num, int pay_num) {
		super();
		this.pay_item_num = pay_item_num;
		this.pay_item_price = pay_item_price;
		this.movie_num = movie_num;
		this.pay_num = pay_num;
	}
	
	public PayItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
