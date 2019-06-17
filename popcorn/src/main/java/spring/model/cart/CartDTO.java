package spring.model.cart;

public class CartDTO {
	
	int cart_num;
    int movie_price;
    String id;
    int movie_num;
    
    
	public int getCart_num() {
		return cart_num;
	}
	public void setCart_num(int cart_num) {
		this.cart_num = cart_num;
	}
	public int getMovie_price() {
		return movie_price;
	}
	public void setMovie_price(int movie_price) {
		this.movie_price = movie_price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMovie_num() {
		return movie_num;
	}
	public void setMovie_num(int movie_num) {
		this.movie_num = movie_num;
	}
	
	@Override
	public String toString() {
		return "CartDTO [cart_num=" + cart_num + ", movie_price=" + movie_price + ", id=" + id + ", movie_num="
				+ movie_num + "]";
	}
	public CartDTO(int cart_num, int movie_price, String id, int movie_num) {
		super();
		this.cart_num = cart_num;
		this.movie_price = movie_price;
		this.id = id;
		this.movie_num = movie_num;
	}
	
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    
}
